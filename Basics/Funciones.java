import java.util.Scanner;

public class Funciones {
    
    public static void main(String[] args){
        
        System.out.println(Sayhello("Edwin","Roman"));
        
        Scanner sn = new Scanner(System.in);
        System.out.println("Just introduce a number (May be a REAL Number): ");
        double num = sn.nextDouble();

        System.out.println(pluster(num, 22));
        System.out.println("Este numero es mayor que cero: " + Tester_numb(num));
        sn.close();

    }

    public static String Sayhello(String name,String lsname){
        
        return "Hi, Mr."+ name+" "+lsname;
    }

    public static int pluster(int num1, int num2){
        return (num1+num2);
    }

    public static double pluster(double num1, double num2){
        return (num1+num2);
    }

    public static boolean Tester_numb(double num){
        if(num>=0){
            return true;
        }
        else{
            return false;
        }
    }


}
