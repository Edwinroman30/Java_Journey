package Herencia_encapsulacion;

public class Vehiculo {
    

    private int gomas;
    private String modelo;
    private String color;
    private boolean status;
    private String placa;

    private boolean radio;

    public Vehiculo(int gomas,String modelo, String color, boolean status, String placa)
    {
        this.gomas = gomas;
        this.modelo = modelo;
        this.color = color;
        this.status = status;
        this.placa = placa;
        this.radio = false;

        System.out.println("Constructor de Vehículo");
    }


    //Setters

    public void setGomas(int gomas) {
        
        if(gomas < 2 || gomas > 8){
            this.gomas = 0;
        }
        else{
            this.gomas = gomas;
        }

    }

    public void setModel(String model){
        this.modelo = model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setStatus(boolean status){
        if(status != false || status != true){
            this.status = false;
        }else{
            this.status = status;
        }
    }

    public void setPlaca(String placa){
        if(placa.length() > 7){
            this.placa = "NULL0-0";
        }
        else{
            this.placa = placa;
        }
    }

    //Getters

    public int getGomas(){
        return this.gomas;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getColor(){
        return this.color;
    }

    public boolean getStatus(){
        return this.status;
    }


    public void mantenimiento(){
        System.out.println("Este vehiculo, se le esta dando mantenimiento");
    }

    public void encenderRadio(){
        this.radio = true;
    }

    public void apagarRadio(){
        this.radio = false;
    }

    public String checkRadioStatus(){
        
        if(this.radio != true){
            return "La radio en este momento se encuentra... Apagada";
        }else{
            return "La radio en este momento se encuentra... Encendida";
        }
    }

}


