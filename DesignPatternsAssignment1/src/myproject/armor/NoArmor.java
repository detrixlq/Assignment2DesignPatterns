package myproject.armor;

public class NoArmor implements IArmor {
    @Override
    public void wearArmor() {
        System.out.println("I don't wear any armor.");
    }
}
