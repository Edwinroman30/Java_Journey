package POO.Herencias;

public class Main {
    
    public static void main(String[] args) {
        
        Employed Ricardo = new Employed(1, "Ricardo Almanza", 24, 'M', 42000);
        String info;

        info = Ricardo.presentation();
        System.out.println(info);
        Ricardo.working();



    }

}
