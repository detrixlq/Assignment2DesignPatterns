public class FirebladeEnchantment extends WeaponDecorator{
    public FirebladeEnchantment(IWeapon decoratedWeapon){
        super(decoratedWeapon);
    }

    @Override
    public void useWeapon() {
        super.useWeapon();
        System.out.println("This sword is enchanted with Fire Blade!");
    }
}
