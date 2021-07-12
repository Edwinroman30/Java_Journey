package Herencia_encapsulacion;

public class Auto extends Vehiculo{

    private boolean airConditioner;

    public Auto(int gomas, String modelo, String color, boolean status, String placa){
        super(gomas,modelo,color,status,placa);

        this.airConditioner = false;
        System.out.println("Constructor de Auto");
    }

    @Override
    public void encenderRadio(){
        super.encenderRadio();
        System.out.println("La radio se ha encendido, en la estacion por defecto 99.7");
    }

    @Override
    public void apagarRadio(){
        super.apagarRadio();
        System.out.println("La radio se ha apagado ...");
    }

    @Override
    public void mantenimiento(){
        System.out.println("Este vehiculo, se le esta dando mantenimiento...");
        System.out.println("Cambio de filtros y de aceite (LISTO)");
        System.out.println("Revisión de frenos (LISTO)");
        System.out.println("Revisión de las luces (LISTO)");
    }

    public void airOn(){
        this.airConditioner = true;
    }

    public void airOff(){
        this.airConditioner = false;
    }

}