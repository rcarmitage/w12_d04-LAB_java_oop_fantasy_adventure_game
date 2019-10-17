package beings;

import abilities.IWeapon;

public class Fighter extends Player {

    private IWeapon weapon;

    public Fighter(String name, IWeapon weapon) {
        super(name);
        this.weapon = weapon;
    }

    public String attack(Enemy target) {
        return this.weapon.attack(target);
    }
}
