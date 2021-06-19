package ClaseObjetos.First;
public class TV{
    
    /* 
    Requirements: 
    
    1- Crear la clase Tv y agregar al menos 4 atributos y cuatro métodos. 

    - En cada método debe imprimir la acción que esta representa. (Tal y como se explico en la clase: Ver video de la clase pasada)

    2- Crear una clase Prueba con el método main donde:

    - Debe crear 3 instancias de la clase Tv.

    - Debe asignar valores a cada uno de sus atributos.

    - Debe invocar cada uno de sus métodos.

    */

    public String marca;
    public String model;
    public boolean smartTV;
    public int inches;
    public boolean status;
    public int volumen;

    public TV(String pMarca, String pModel, boolean pSmartTV, int pInches){

        this.marca = pMarca;
        this.model = pModel;
        this.smartTV = pSmartTV;
        this.inches = pInches;
        this.status = false;
        this.volumen = 0;

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
        this.volumen = 0;
    }

    public void turnOn(){
        System.out.println("Hola soy " +this.marca + ", y me acaban de encender.");
    }

    public void turnOff(){
        System.out.println("Hola soy " +this.marca + ", y me acaban de apagar.");
    }

    public void upVolum(){
        System.out.println("Hola soy " +this.marca + ", y me acaban de aumentar el volumen.");
    }

    public void downVolum(){
        System.out.println("Hola soy " +this.marca + ", y me acaban de disminuir el volumen.");
    }

    public String infoTV(){
        return "Brand: "+ this.marca + "\nModel: "+ this.model + "\nIs smart TV? "+this.smartTV + "\nInches: "+this.inches +"\nStatus: "+this.status + "\nVolume: " + this.volumen;
    }


}