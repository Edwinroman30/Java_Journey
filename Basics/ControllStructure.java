public class ControllStructure {
    
    public static void main (String[] args){

        //IF STAMENT
        
        int num = 23;

        if(num%2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }

        //Ternary Operator

        //variable = (condition) ? expressionTrue :  expressionFalse;
        System.out.println("El mayor es: " + (23>15));

        //Switch Operator

        int year = 25;

        switch(year){

            case 19:
                System.out.println("Its 2019");
            break;

            case 20:
                System.out.println("Its 2020");
            break;

            case 21:
                System.out.println("Its 2021");
            break;

            default:
                System.out.println("We sorry but its not in the range");
            break;
        }

    }


}
