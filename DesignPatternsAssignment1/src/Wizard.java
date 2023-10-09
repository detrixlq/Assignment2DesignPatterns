class Wizard extends Character{
    @Override
    public void displayCharacter() {
        System.out.println("I am a mighty wizard! Ha-ha-ha!");
    }

    public Wizard(IWeapon weapon, IArmor armor, ISkill skill) {
        super(weapon, armor, skill);
    }
}
