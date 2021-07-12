package Herencia_encapsulacion;
import Herencia_encapsulacion.Auto;

public class Main {
    

    public static void main(String[] args) {
        //Vehiculo v1 = new Vehiculo(4,"Mazda","Rojo",false,"PD002-2");
        Auto miCarro = new Auto(4,"Toyota","Rojo",false,"PD002-7");
   
        miCarro.encenderRadio();
        miCarro.airOn();
        System.out.println(miCarro.checkRadioStatus());

    }

}
