import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class Test {
  
    public static void main(String[] args) {
         
        String url = "jdbc:mysql://localhost/pruebadb";
        String user = "root";
        String pass = "admin";
        
        Connection conexion = null;
        Statement statement;
        ResultSet result;
        int numbersRowsAfected;
        
        try
        { 
           conexion = DriverManager.getConnection(url,user,pass);
           System.out.println("Conexión aprovisionada");
//           statement = conexion.createStatement();
//           numbersRowsAfected =  statement.executeUpdate("INSERT INTO people VALUES (5,'Manuel Gil','1980-05-03');");
//           System.out.println(numbersRowsAfected);
//           conexion.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        
        try{
            statement = conexion.createStatement();
            result = statement.executeQuery("select * FROM People;");
            
            
            while(result.next()){
                System.out.println("Id: " + result.getInt(1) + ", Nombre: " + result.getString(2) + ", FechaN: " + result.getDate(3));
            }
           
            conexion.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        
             
                
    }
   
    
    public void ShowPeopleData(){
        //SOLO UN PEQUEÑO EJEMPLO, MOVEMOS EL SEGUNDO  TRY CONSEGUIREMOS MEJOR SEGMENTACIÓN.
    }
    
    
    
}