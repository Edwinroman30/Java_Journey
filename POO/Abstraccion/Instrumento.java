package POO.Abstraccion;

public abstract class Instrumento {
    
    protected String modelo;

    public abstract void tocar();
    public abstract void mantenimiento();

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

}
