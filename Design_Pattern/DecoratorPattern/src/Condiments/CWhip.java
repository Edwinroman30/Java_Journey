package Condiments;
import Beverage.*;
   
public class CWhip extends CondimentDecorator{

    public CWhip(CBeverage beverage) {
         this.beverage = beverage;
    }

    @Override
    public String getDescription() {
    
        return this.beverage.getDescription() + ", Whips.";
    }

    @Override
    public double Cost() {
        
        return this.beverage.Cost() + 0.10;
    }
    
}
