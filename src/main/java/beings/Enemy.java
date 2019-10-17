package beings;

public abstract class Enemy {

    private int healthPoints;

    public Enemy() {
        this.healthPoints = 10;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void takeDamage(int amount) {
        this.healthPoints -= amount;
    }
}
