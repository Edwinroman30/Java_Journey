package POO.Abstraccion;

public class Guitarra extends Instrumento{
    
    public Guitarra(){
        this.modelo = "Undefined";
    }

    public void tocar(){
        System.out.println("Estas tocando una GUITARRA.");
        System.out.println("DO RE MI FA SOL");
    }

    public void mantenimiento(){
        System.out.println("Soy una" + this.getModelo() + ", me estan limpiando");
    }



}
