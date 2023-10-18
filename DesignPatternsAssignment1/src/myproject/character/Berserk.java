package myproject.character;
import myproject.weapon.*;
import myproject.armor.*;
import myproject.skill.*;
class Berserk extends Character{
    @Override
    public void displayCharacter() {
        System.out.println("I am a berserk! Ghraaaaah!");
    }

    public Berserk(IWeapon weapon, IArmor armor, ISkill skill) {
        super(weapon, armor, skill);
    }
}
