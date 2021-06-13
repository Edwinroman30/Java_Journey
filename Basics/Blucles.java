public class Blucles {

    public static void main(String[] args) {
    
        //* Loops Structure

        //WHILE LOOP
        int i = 1;

        while(i<10){
            i= i*2;
            System.out.println(i);
        }


        //DO WHILE LOOP
        System.out.println("\n");

        do{
            System.out.println(i);
            i--;        
        }while(i != 0);

        //FOR LOOP

        for(int x = 0; x<50; x+=2){
            System.out.println(x);
        }

        //Foreach Elements
        String[] fruits = {"Apples","Bananas","Mangos","Grapes"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        


    }


}
