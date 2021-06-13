public class TV {
    
    /* 
    Requirements: 
    
    1- Crear la clase Tv y agregar al menos 4 atributos y cuatro métodos. 

    - En cada método debe imprimir la acción que esta representa. (Tal y como se explico en la clase: Ver video de la clase pasada)

    2- Crear una clase Prueba con el método main donde:

    - Debe crear 3 instancias de la clase Tv.

    - Debe asignar valores a cada uno de sus atributos.

    - Debe invocar cada uno de sus métodos.

    */

    private String marca;
    private String model;
    private boolean smartTV;
    private int inches;
    private boolean status;

    public TV(String pMarca, String pModel, boolean pSmartTV, int pInches){

        this.model = pMarca;
        this.model = pModel;
        this.smartTV = pSmartTV;
        this.inches = pInches;
        this.status = false;
        //Validations:

        if(pInches < 14){
            this.inches = 14;
        }
        
    }

    public TV(){
        this.model = "Unknown Values";
        this.model = "Unknown Values";
        this.smartTV = false;
        this.inches = 0;
        this.status = false;
    }

    public void turnOn(){
        this.status = true;
    }

    public void turnOff(){
        this.status = false;
    }

    public String infoTV(){

        return "Brand: "+this.marca+ "\nModel: "+ this.model + "\n Is smart TV? "+this.smartTV + "\n Inches: "+this.inches +"\n Status: "+this.status;
    
    }


}
