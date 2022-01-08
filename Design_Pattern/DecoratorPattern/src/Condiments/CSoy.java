package Condiments;
import Beverage.CBeverage;

public class CSoy extends CondimentDecorator{
 
    public CSoy(CBeverage beverage) {
        
         this.beverage = beverage;
    }

    @Override
    public String getDescription() {
    
        return this.beverage.getDescription() + ", Soys.";
    }

    @Override
    public double Cost() {
        
        return this.beverage.Cost() + 0.10;
    }
    
}
