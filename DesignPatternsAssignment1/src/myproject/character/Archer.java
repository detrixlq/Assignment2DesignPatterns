package myproject.character;
import myproject.weapon.*;
import myproject.armor.*;
import myproject.skill.*;
class Archer extends Character{
    @Override
    public void displayCharacter() {
        System.out.println("I am an archer");
    }

    public Archer(IWeapon weapon, IArmor armor, ISkill skill) {
        super(weapon, armor, skill);
    }
}
