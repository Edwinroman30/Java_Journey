package POO.Polimorfismo.Prac_Intefaces.clasesproyect.clases;
import POO.Polimorfismo.Prac_Intefaces.clasesproyect.interfaces.*;

public class Humano implements AccionesHumano,AccionesGeneral{
    
    private String nombre;
    private char sexo;
    private int edad;
    private String[] language;
    
    public Humano(){}
    
    public Humano(String nombre,char sexo, int edad){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSexo(sexo);
    } 

    public void setLanguage(String[] lan){
        this.language = lan;
    }

    public String[] getLanguage(){
        return this.language;
    }

    public void showLanguage(){
        
        for(String i : getLanguage()){
            System.out.println(i);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        if((nombre).length() < 2){
            nombre = "";
        }else{
            this.nombre = nombre;
        }
    }

    public void setSexo(char sexo) {
        if(sexo == 'm' || sexo == 'f')
        {
            this.sexo = sexo;
        }
    }
    public void setEdad(int edad) {
        if(edad < 0){
            
        }else{
            this.edad = edad;
        }
    }
    
    @Override
    public String toString(){
        return "Mi nombre es: " + this.nombre + ", tengo " + this.edad + " y pertenezco al genero "+this.sexo;
    }
    
    //Implements

    @Override
    public void trabajar() {
        System.out.println("Estoy trabajando");
    }

    @Override
    public void estudiar() {
        System.out.println("Estoy estudiando");

    }

    @Override
    public void bailar(){
        System.out.println("Estoy bailando");

    }

    @Override
    public void cocinar() {
        System.out.println("Estoy cocinando");
    }

    @Override
    public void comer() {
        System.out.println("Estoy comiendo");
    }

    @Override
    public void desplazarse() {
        System.out.println("Estoy desplazando");
    }

    @Override
    public void jugar() {
        System.out.println("Estoy jugando");
    }

    @Override
    public void dormir() {
        System.out.println("Estoy durmiendo");
    }

    @Override
    public void hablar() {
        System.out.println("Estoy hablando");
    }
}
