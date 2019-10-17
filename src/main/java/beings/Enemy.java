package beings;

public abstract class Enemy {

    private int healthPoints;

    public Enemy(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void takeDamage(int amount) {
        if (this.healthPoints - amount >= 0) {
            this.healthPoints -= amount;
        } else {
            this.healthPoints = 0;
        }
    }
}
