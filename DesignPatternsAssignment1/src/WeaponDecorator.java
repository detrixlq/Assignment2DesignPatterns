public abstract class WeaponDecorator implements IWeapon{
    protected IWeapon decoratedWeapon;

    public WeaponDecorator(IWeapon decoratedWeapon){
        this.decoratedWeapon = decoratedWeapon;
    }

    @Override
    public void useWeapon() {
        decoratedWeapon.useWeapon();
    }
}
