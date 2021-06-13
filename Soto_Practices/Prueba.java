public class Prueba {
    
    /* 
    - Debe crear 3 instancias de la clase Tv.

    - Debe asignar valores a cada uno de sus atributos.

    - Debe invocar cada uno de sus métodos.

    */

    public static void main(String[] args) {
        
        TV tele1 = new TV("RGA","R-1002",false,14,true);

        tele1.turnOn();
        System.out.println(tele1.infoTV());

    }


}

