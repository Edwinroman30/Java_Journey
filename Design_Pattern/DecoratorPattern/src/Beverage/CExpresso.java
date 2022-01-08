package Beverage;

public class CExpresso extends CBeverage {

    public CExpresso() {
        description = "Expresso...";
    }
       
    @Override
    public double Cost() {
        return 1.99;
    }
    
}
