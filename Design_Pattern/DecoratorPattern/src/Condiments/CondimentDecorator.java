package Condiments;
import Beverage.CBeverage;

public abstract class CondimentDecorator extends CBeverage{

    CBeverage beverage;
 
    @Override
    public abstract String getDescription();
    
}
