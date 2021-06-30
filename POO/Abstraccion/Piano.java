package POO.Abstraccion;

public class Piano extends Instrumento{
    
    @Override
    public void tocar() {
        System.out.println("Estas tocando Piano. TURI TURI TURI RIRURU RURIRI RURU PIRIRIRURU");
    }

    @Override
    public void mantenimiento() {
        System.out.println("Soy un piano, modelo: " + this.getModelo() + " y estoy en proceso de mantenimiento.");
    }

    @Override
    public String getModelo() {
        return super.getModelo();
    }


    @Override
    public void setModelo(String modelo) {
        super.setModelo(modelo);
    }
}
