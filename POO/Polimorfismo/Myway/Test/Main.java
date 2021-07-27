package POO.Polimorfismo.Myway.Test;
import clasesproyect.Humano;
import clasesproyect.Mujer;


public class Main {
    
    public static void main(String[] args){
     
        System.out.println("Maven Working");
        Hombre pedro = new Hombre("Pedro","m",23);
        Hombre mario = new Hombre();
        Mujer ana = new Mujer("Ana", "f", 22);
        
        System.out.println(mario.toString());

    }
    
}
