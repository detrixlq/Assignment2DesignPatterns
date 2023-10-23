package myproject;

import myproject.armor.*;
import myproject.weapon.*;
import myproject.skill.*;
import myproject.character.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("The Battle Begins!");
        System.out.println("...");

        FireSkill fireball = new FireSkill();
        IWeapon FireballWeapon = new FireballAdapter(fireball);

        IArmor knightArmor = new HeavyArmor();

        ISkill knightSkill = new SwordplaySkill();

        myproject.character.Character knight = new Knight(FireballWeapon, knightArmor, knightSkill);
        knight.displayCharacter();
        knight.performAttack();
        knight.performDefence();
        knight.performSkill();
        System.out.println("...");

    }
}