class Knight extends Character{
    @Override
    public void displayCharacter() {
        System.out.println("I am a knight");
    }

    public Knight(IWeapon weapon, IArmor armor, ISkill skill) {
        super(weapon, armor, skill);
    }
}
