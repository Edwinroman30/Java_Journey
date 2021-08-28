package M1;

public class Ejercicio04 {
    
    public static void main(String[] args){

        //4. Realizar un programa que imprima la sumatoria de los números del 1 al 20.
        int sumatoria = 0;

        for(int i=1; i<=20; i++){
            //System.out.println(i);
            sumatoria += i;
        }

        System.out.println("La sumatoria de los numeros del 1 al 20 es: " + sumatoria);

    }

}
