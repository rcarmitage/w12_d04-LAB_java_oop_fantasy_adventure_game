package abilities;

import beings.Enemy;

public class Bow implements IWeapon {

    private int damage;

    public Bow() { this.damage = 1; }

    public String attack(Enemy target) {
        target.takeDamage(this.damage);
        return "Twang thunk!";
    }

}
