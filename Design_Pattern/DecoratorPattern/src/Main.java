import Beverage.*;
import Condiments.*;
        
public class Main {
    
     public static void main(String[] args) {
       
         //System.out.print("Decorator pattern!\n");
         CBeverage beverage1 = new CDecaf();
         
         System.out.print( beverage1.getDescription() + ", cost $" + beverage1.Cost() + "\n" );
         
         CBeverage beverage2 = new CExpresso();
         beverage2 = new CDarkRoast();
         beverage2 = new CDecaf();
         beverage2 = new CHouseBlend();
         
         System.out.print( beverage2.getDescription() + ", cost $" + beverage2.Cost() + "\n" );
         
         beverage2 = new CMocha(beverage2);
         beverage2 = new CSoy(beverage2);
         beverage2 = new CWhip(beverage2);
         
         System.out.print( beverage2.getDescription() + ", cost $" + beverage2.Cost() + "\n" );
    }
   
}
