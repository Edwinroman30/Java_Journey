public class Prueba {
    
    /* 
    - Debe crear 3 instancias de la clase Tv.

    - Debe asignar valores a cada uno de sus atributos.

    - Debe invocar cada uno de sus métodos.

    */

    public static void main(String[] args) {
        
        TV television1 = new TV("RGA","R-1002",false,14);
        TV television2 = new TV("Samsung","Smart V19",true,42);
        TV television3 = new TV("IO Bit","io-977",true,52);

        television2.turnOn();

        for(int i=0; i<3; i++)
        television1.upVolum();

        television1.downVolum();
        television3.upVolum();

        System.out.println(television1.infoTV());
        System.out.println("\n");
        System.out.println(television2.infoTV());
        System.out.println("\n");
        System.out.println(television3.infoTV());
    }    
       

}