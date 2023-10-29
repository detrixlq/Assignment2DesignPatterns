package myproject;

import myproject.armor.*;
import myproject.character.Character;
import myproject.weapon.*;
import myproject.skill.*;
import myproject.character.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The Battle Begins!");
        System.out.println("...");
        System.out.println("Choose your hero:");
        System.out.println("1. Knight");
        System.out.println("2. Berserk");
        System.out.println("3. Archer");
        System.out.println("4. Wizard");

        int heroRequest = scanner.nextInt();

        IArmor knightArmor = new HeavyArmor();
        ISkill knightSkill = new SwordplaySkill();
        IWeapon knightSword = new SwordWeapon();

        Character hero = CharacterFactory.createCharacter(heroRequest, knightSword, knightArmor, knightSkill);
        hero.displayCharacter();
        hero.performAttack();
        hero.performDefence();
        hero.performSkill();
        System.out.println("...");
    }
}