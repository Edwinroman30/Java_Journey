package Condiments;
import Beverage.*;
        
public class CMocha extends CondimentDecorator{

    public CMocha(CBeverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha.";
    }

    @Override
    public double Cost() {
        return this.beverage.Cost() + 0.20;
    }
    
}
