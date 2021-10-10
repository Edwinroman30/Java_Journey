package strategypattern;
import strategypattern.weaponbehaviors.IWeaponBehavior;

public abstract class CCharacter {
    
    protected IWeaponBehavior weaponbehavior;
    
    public void fight(){}
    
    public void setWeapon(IWeaponBehavior weapon){
        this.weaponbehavior = weapon;
    }
}
