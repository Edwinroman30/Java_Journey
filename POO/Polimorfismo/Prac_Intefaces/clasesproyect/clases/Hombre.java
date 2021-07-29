package POO.Polimorfismo.Prac_Intefaces.clasesproyect.clases;

public class Hombre extends Humano{
    
    public Hombre(){}

    public Hombre(String nombre,char sexo, int edad, String[] lan)
    {
        super(nombre, sexo, edad);
        setLanguage(lan);
    }


    
}
