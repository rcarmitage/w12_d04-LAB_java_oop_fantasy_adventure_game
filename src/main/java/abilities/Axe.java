package abilities;

public class Axe implements IWeapon {

    private int damage;

    public Axe() {
        this.damage = 1;
    }

    public String attack() {
        return "Swish Thwack!";
    }
}
