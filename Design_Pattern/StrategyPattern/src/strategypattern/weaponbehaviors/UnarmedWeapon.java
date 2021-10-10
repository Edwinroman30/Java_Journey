package strategypattern.weaponbehaviors;

public class UnarmedWeapon implements IWeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Unarmed... just hands");
    }
    
}
