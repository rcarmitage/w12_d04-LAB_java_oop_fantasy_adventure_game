package abilities;

import beings.Enemy;

public class Sword implements IWeapon {

    private int damage;

    public Sword() {
        this.damage = 3;
    }

    public String attack(Enemy target) {
        int damageToDeal = this.damage;
        if (target instanceof IDefend) {
            damageToDeal -= ((IDefend) target).defend();
        }
        target.takeDamage(damageToDeal);
        return "Slicey slicey!";
    }

}
