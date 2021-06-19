package SobrecargaMetodos;
import SobrecargaMetodos.PKG_Calculadoras.Calculadora;

public class Main {
    
    public static void main(String[] args){

    /*
        Crear una clase Calculadora con los métodos sumar, restar, multiplicar y dividir que reciba 
        dos parámetros enteros y retorne el resultado (utilizar la palabra reservada return).Sobrecargar
        los métodos sumar, restar y multiplicar para que reciba tres y cuatro parámetros enteros.
    */
        Calculadora casio = new Calculadora();

        System.out.println("\nSUMAS:");
        System.out.println(casio.sumar(4,8));
        System.out.println(casio.sumar(4,8,88));
        System.out.println(casio.sumar(4,6,88,52));

        System.out.println("\nRESTA:");
        System.out.println(casio.restar(8,2));
        System.out.println(casio.restar(8,22,1));
        System.out.println(casio.restar(5000,2000,1000,500));
       
        System.out.println("\nMULTILPLICACIONES:");
        System.out.println(casio.multiplicar(4,3));
        System.out.println(casio.multiplicar(4,32,88));
        System.out.println(casio.multiplicar(99999,99999,9999,1));

        System.out.println("\nDIVISION:");
        System.out.println(casio.dividir(24,4));
    }

}
