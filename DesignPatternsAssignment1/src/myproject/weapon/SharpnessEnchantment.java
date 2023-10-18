package myproject.weapon;

public class SharpnessEnchantment extends WeaponDecorator{
    public SharpnessEnchantment(IWeapon decoratedWeapon){
        super(decoratedWeapon);
    }

    @Override
    public void useWeapon() {
        super.useWeapon();
        System.out.println("This sword is enchanted with Sharpness!");
    }
}
