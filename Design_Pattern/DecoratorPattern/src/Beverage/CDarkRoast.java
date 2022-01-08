package Beverage;

public class CDarkRoast extends CBeverage{

    public CDarkRoast() {
        description = "Dark Roast";
    }
   
    @Override
    public double Cost() {
        return .99;
    }
    
}
