package myproject.weapon;

public class BowWeapon implements IWeapon {
    @Override
    public void useWeapon(){
        System.out.println("I shoot from my bow!");
    }
}
