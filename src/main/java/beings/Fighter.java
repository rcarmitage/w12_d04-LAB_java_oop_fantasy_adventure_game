package beings;

import abilities.IWeapon;

public class Fighter extends Player {

    private IWeapon weapon;
    private String skilledWith;

    public Fighter(String name, IWeapon weapon, String skilledWith) {
        super(name);
        this.weapon = weapon;
        this.skilledWith = skilledWith;
    }

    public int getMultiplier() {
        if (this.weapon.getType() == this.skilledWith) {
            return 2;
        } else {
            return 1;
        }
    }

    public String attack(Enemy target) {
        return this.weapon.attack(target, this.getMultiplier());
    }

    public void changeWeapon(IWeapon newWeapon) {
        this.weapon = newWeapon;
    }

}
