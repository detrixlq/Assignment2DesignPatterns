class Character {
    private IWeapon weapon;
    private ISkill skill;
    private IArmor armor;

    public Character(IWeapon weapon, IArmor armor, ISkill skill) {
        this.weapon = weapon;
        this.armor = armor;
        this.skill = skill;
    }

    public void displayCharacter(){
        System.out.println("I am a character.");
    }

    public void performAttack(){
        weapon.useWeapon();
    }

    public void performDefence(){
        armor.wearArmor();
    }

    public void performSkill(){
        skill.useSkill();
    }
}
