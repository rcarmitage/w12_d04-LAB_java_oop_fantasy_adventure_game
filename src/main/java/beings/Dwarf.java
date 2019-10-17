package beings;

import abilities.IWeapon;

public class Dwarf extends Fighter {

    private IWeapon weapon;

    public Dwarf(String name, IWeapon weapon) {
        super(name);
        this.weapon = weapon;
    }

}
