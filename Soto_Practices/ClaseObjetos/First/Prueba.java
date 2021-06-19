package ClaseObjetos.First;
public class Prueba {
    
 
    public static void main(String[] args) {
        
        //TV1 - SOLO PARA PRACTICAR LO APRENDIDO DE LOS CONSTRUCTORES. :)
        TV television1 = new TV("RGA","R-1002",false,14);
    
        //TV2
        TV television2 = new TV();

        television2.marca = "Samsung";
        television2.model = "Smart V19";
        television2.smartTV = true;
        television2.inches = 42;
        television2.status = false;
        television2.volumen = 60;

        //TV3
        TV television3 = new TV();
        television3.marca = "IO Bit";
        television3.model = "io-977";
        television3.smartTV = true;
        television3.inches = 52;
        television3.status = true;
        television3.volumen = 88;

        television1.turnOn();
        television1.turnOff();
        television1.upVolum();
        television1.downVolum();

        System.out.println("\n");

        television2.turnOn();
        television2.turnOff();
        television2.upVolum();
        television2.downVolum();

        System.out.println("\n");

        television3.turnOn();
        television3.turnOff();
        television3.upVolum();
        television3.downVolum();
       
        System.out.println("\n");


        System.out.println(television1.infoTV());
        System.out.println("\n");
        System.out.println(television2.infoTV());
        System.out.println("\n");
        System.out.println(television3.infoTV());
    }    
       

}