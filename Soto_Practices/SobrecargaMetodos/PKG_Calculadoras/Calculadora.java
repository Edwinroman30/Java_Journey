package SobrecargaMetodos.PKG_Calculadoras;

public class Calculadora {  
    
    /*
    Crear una clase Calculadora con los métodos sumar, restar, multiplicar y dividir que reciba 
    dos parámetros enteros y retorne el resultado (utilizar la palabra reservada return).Sobrecargar
    los métodos sumar, restar y multiplicar para que reciba tres y cuatro parámetros enteros.
    */

    public Calculadora(){
        System.out.println("Welcome to Ed-Cal:");
    } 

    //SUMAR:

    public int sumar(int num1, int num2){
        return (num1 + num2);
    }

    public int sumar(int num1, int num2, int num3){ 
        return (num1 + num2 + num3);
    }

    public int sumar(int num1, int num2, int num3, int num4){ 
        return (num1 + num2 + num3 + num4);
    }


    //RESTAR:

    public int restar(int num1, int num2){
        return (num1 - num2);
    }

    public int restar(int num1, int num2, int num3){ 
        return (num1 - num2 - num3);
    }

    public int restar(int num1, int num2, int num3, int num4){ 
        return (num1 - num2 - num3 - num4);
    }


    //MULTIPLICAR:

    public int multiplicar(int num1, int num2){
        return (num1 * num2);
    }

    public int multiplicar(int num1, int num2, int num3){ 
        return (num1 * num2 * num3);
    }

    public int multiplicar(int num1, int num2, int num3, int num4){ 
        return (num1 * num2 * num3 * num4);
    }

    
    //DIVIDIR

    public int dividir(int num1, int num2){
        
        if(num2 != 0){
            return num1/num2;
        }
        else{
            return 0;
        }
   
    }

}
