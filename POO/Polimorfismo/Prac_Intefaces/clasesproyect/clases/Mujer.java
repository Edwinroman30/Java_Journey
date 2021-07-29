package POO.Polimorfismo.Prac_Intefaces.clasesproyect.clases;

public class Mujer extends Humano{


    public Mujer(String nombre,char sexo, int edad, String[] lan){
        super(nombre, sexo, edad);
        setLanguage(lan);
    }
    
}
