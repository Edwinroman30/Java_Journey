
package POO.Polimorfismo.Prac_Intefaces.clasesproyect.clases;

import POO.Polimorfismo.Prac_Intefaces.clasesproyect.interfaces.AccionesGeneral;


public abstract class Animal implements AccionesGeneral{
    
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
