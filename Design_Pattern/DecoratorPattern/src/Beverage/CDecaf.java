package Beverage;

public class CDecaf extends CBeverage{
    
    public CDecaf(){
        description = "Decaf beer!";
    }

    @Override
    public double Cost() {
    
        return 2.99;
    }
    
}
