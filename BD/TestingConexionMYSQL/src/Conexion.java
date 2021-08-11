import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conexion {
    
    private Connection con;
    private PreparedStatement psInsert;
    private ResultSet resultset;
    
    public Conexion(){
        try {
            this.con = DriverManager.getConnection("jdbc:mysql://localhost/pruebadb?useServerPrepStmts=true","root","admin");
            this.psInsert = null;
            this.resultset = null;
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private Connection getConnection(){
        return con;
    }
    
    
    public boolean insertPeopleDate(int id, String nombre, String fecha){
       
        try {
            this.psInsert = getConnection().prepareStatement("INSERT INTO People VALUES (?,?,?);");
            this.psInsert.setInt(1, id);
            this.psInsert.setString(2, nombre);
            this.psInsert.setString(3, fecha);
            
            this.psInsert.executeUpdate();
            
            this.getConnection().close();
            return true;

        } catch (SQLException ex) {
            return false;
        }
     
    }
    
    
    
    
}
