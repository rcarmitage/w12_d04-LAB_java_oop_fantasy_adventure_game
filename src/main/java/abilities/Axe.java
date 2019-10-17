package abilities;

import beings.Enemy;

public class Axe implements IWeapon {

    private int damage;

    public Axe() {
        this.damage = 1;
    }

    public String attack(Enemy target) {
        target.takeDamage(this.damage);
        return "Swish Thwack!";
    }
}
