package strategypattern;
import strategypattern.weaponbehaviors.*;


public class Troll extends CCharacter {
    
    public Troll(){
        this.weaponbehavior = new UnarmedWeapon();
    }
    
    @Override
    public void fight(){
        this.weaponbehavior.useWeapon();
    }
    
}
