package strategypattern;
import strategypattern.weaponbehaviors.*;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("It running");
        CCharacter luisII = new King();
        
        luisII.fight();
        System.out.println("//////");
        luisII.setWeapon(new AxeBehavior());
        luisII.fight();

        Troll sebastian = new Troll();
        sebastian.fight();
        
    }
    
}
