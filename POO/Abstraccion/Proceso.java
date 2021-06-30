package POO.Abstraccion;

public class Proceso {
    
    public static void main(String[] args) {

        Guitarra G1 = new Guitarra();
        Piano P1 = new Piano();
        P1.setModelo("Johny K");


        G1.tocar();
        P1.tocar();

    }

}
