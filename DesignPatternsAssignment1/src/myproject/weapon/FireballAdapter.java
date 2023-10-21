package myproject.weapon;

import myproject.skill.*;

public class FireballAdapter implements IWeapon{
    private FireSkill fireball;

    public FireballAdapter(FireSkill fireball){
        this.fireball = fireball;
    }

    @Override
    public void useWeapon() {
        System.out.println("I use this fireball as a weapon!");
        fireball.useSkill();
    }
}
