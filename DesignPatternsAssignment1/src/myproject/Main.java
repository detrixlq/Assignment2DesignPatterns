package myproject;

import myproject.armor.*;
import myproject.weapon.*;
import myproject.skill.*;
import myproject.character.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("The Battle Begins!");
        System.out.println("...");

        IWeapon Sword = new SwordWeapon();
        IWeapon SharpnessSword = new SharpnessEnchantment(Sword);
        IWeapon FireSharpnessSword = new FirebladeEnchantment(SharpnessSword);

        myproject.character.Character knight = new Knight(FireSharpnessSword, new HeavyArmor(), new SwordplaySkill());
        knight.displayCharacter();
        knight.performAttack();
        knight.performDefence();
        knight.performSkill();
        System.out.println("...");

    }
}