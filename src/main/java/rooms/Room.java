package rooms;

import beings.Enemy;
import beings.Knight;

import java.util.ArrayList;

public abstract class Room {

    public Knight player;
    public ArrayList<Enemy> enemiesAlive;
    public ArrayList<Enemy> enemiesDead;
    public boolean progress;
    public Enemy target;

    public Room(Knight player) {
        this.player = player;
        this.enemiesAlive = new ArrayList<Enemy>();
        this.enemiesDead = new ArrayList<Enemy>();
        this.progress = false;
        this.target = this.enemiesAlive.get(0);
    }

    public void addEnemy(Enemy enemy) {
        this.enemiesAlive.add(enemy);
    }

    public void isEnemyAlive(Enemy enemy) {
        if (target.getHealthPoints(enemy) = 0) {
            System.out.println("Target is dead");
        }
//            if healthpoints = 0 then remove from enemiesAlive and add to enemiesDead
            this.enemiesAlive.remove(0);
            this.enemiesDead.add(target);
    }

    public void turnAttack(Enemy target) {

        player.attack(target);
    }

}
