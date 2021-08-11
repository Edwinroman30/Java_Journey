public class TestOOP {
    
    
  public static void main(String[] args) {
  
      Conexion con = new Conexion();
      
      boolean rs = con.insertPeopleDate(6, "Yuan", "2017-04-3");
      
      if(rs){
          System.out.println("Todo salío bien");
      }else{
          System.out.println("Algo ando mal");
      }
         
  }
    
}
