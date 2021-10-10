package strategypattern;
import strategypattern.weaponbehaviors.*;

public class King extends CCharacter{
    
    public King(){
        weaponbehavior = new BowandArrowBehavior();
    }
    
    @Override
    public void fight(){
        weaponbehavior.useWeapon();
    }
    
}
