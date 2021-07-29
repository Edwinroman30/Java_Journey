package POO.Polimorfismo.Prac_Intefaces.Test;

import POO.Polimorfismo.Prac_Intefaces.clasesproyect.clases.Hombre;
import POO.Polimorfismo.Prac_Intefaces.clasesproyect.clases.Humano;
import POO.Polimorfismo.Prac_Intefaces.clasesproyect.clases.Mujer;
import POO.Polimorfismo.Prac_Intefaces.clasesproyect.clases.Animal;
import POO.Polimorfismo.Prac_Intefaces.clasesproyect.clases.Gato;
import POO.Polimorfismo.Prac_Intefaces.clasesproyect.clases.Perro;

public class Main {
    
    public static void main(String[] args){
     
        String[] lg = {"en","es"};
        String[] lg2 = {"en"};

        Hombre pedro = new Hombre("Pedro",'m',23,lg);
        Mujer ana = new Mujer("Ana", 'f', 22, lg2);
        
        getInfo(pedro);
        showLanguage(pedro);

        //Lo acepta porque Ana es una mujer y es humana. 
        //Este es el poder del polimorfismo, desde una clase padre poder optar por diferentes y a veces iguales clases hijas,
        // y reutilizacion.
        getInfo(ana);
        showLanguage(ana);

        System.out.println("\n");

        Animal jack = new Gato();
        Animal tobi = new Perro();
        Animal ricardo = new Perro();
        Animal[] argAnimales = {tobi, jack, ricardo};

        System.out.println("\n");

        comunicarse(argAnimales);

    }

    public static void getInfo(Humano human){

        if(human instanceof Hombre){
            System.out.println("Es un hombre");
            System.out.println(human.toString());
        }
        if(human instanceof Mujer){
            System.out.println("She is a woman");
            System.out.println(human.toString());
        }
    }
    
    public static void showLanguage(Humano human){
        System.out.println(human.getNombre() + ", habla:");
        human.showLanguage();
    }

    public static void comunicarse(Animal[] animal){

       for(Animal species : animal){
           species.hablar();
       }
        
    }

}
