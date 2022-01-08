package Beverage;

public abstract class  CBeverage {
    
    protected String description = "Unknown bevarage...";
    
    public String getDescription(){
        return this.description;
    }
    
    public abstract double Cost();
       
}
