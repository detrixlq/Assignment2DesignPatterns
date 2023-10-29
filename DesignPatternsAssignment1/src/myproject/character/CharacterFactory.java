package myproject.character;

import myproject.armor.IArmor;
import myproject.skill.ISkill;
import myproject.weapon.IWeapon;

public class CharacterFactory {
    public static Character createCharacter(int request, IWeapon weapon, IArmor armor, ISkill skill){
        Character hero = null;
        switch (request){
            case 1:
                hero = new Knight(weapon, armor, skill);
                break;
            case 2:
                hero = new Berserk(weapon, armor, skill);
                break;
            case 3:
                hero = new Archer(weapon, armor, skill);
                break;
            case 4:
                hero = new Wizard(weapon, armor, skill);
                break;
            default:
                System.out.println("Invalid type of hero.");
                return null;
        }
        return hero;
    }

}
