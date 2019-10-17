package abilities;

import beings.Enemy;

public class Axe implements IWeapon {

    private int damage;

    public Axe() {
        this.damage = 2;
    }

    public String attack(Enemy target) {
        int damageToDeal = this.damage;
        if (target instanceof IDefend) {
            damageToDeal -= ((IDefend) target).defend();
        }
        target.takeDamage(damageToDeal);
        return "Swish Thwack!";
    }
}
