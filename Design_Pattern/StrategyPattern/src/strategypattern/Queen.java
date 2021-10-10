package strategypattern;
import strategypattern.weaponbehaviors.*;

public class Queen extends CCharacter {
    
    public Queen(){
        weaponbehavior = new SwordBehavior();
    }
    
    @Override
    public void fight(){
        weaponbehavior.useWeapon();
    }
    
    
}
