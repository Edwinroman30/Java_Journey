/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern.weaponbehaviors;

public class AxeBehavior implements IWeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Cutting as Axe");
    }
    
}
