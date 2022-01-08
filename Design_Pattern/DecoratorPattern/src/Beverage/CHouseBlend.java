package Beverage;

public class CHouseBlend extends CBeverage{

    public CHouseBlend() {
        description = "House Blend Coffe";
    }
    
    @Override
    public double Cost() {
        return .99;
    }
    
}
