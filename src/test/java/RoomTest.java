import abilities.Sword;
import beings.Knight;
import beings.Salmon;
import beings.Troll;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;
import rooms.Room01;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room01 room01;
    Knight player;
    Sword sword;
    Troll troll;
    Salmon salmon01;

    @Before
    public void before() {
        room01 = new Room01(player);
        player = new Knight("Knight01", sword);
        troll = new Troll();
        salmon01 = new Salmon();
    }

    @Test
    public void playerStartsCannotProgress() {
        assertEquals (false, room01.progress);
    }

    @Test
    public void roomCanAddEnemy() {
        room01.addEnemy(troll);
        assertEquals(1, room01.enemiesAlive.size());
    }

    @Test
    public void canDefeatEnemy() {
        room01.addEnemy(salmon01);
        room01.turnAttack(salmon01);
        room01.isEnemyDead(salmon01);
        assertEquals(0, room01.enemiesAlive.size());

    @Test
    public void canProgress() {
        room01.addEnemy(salmon01);
        room01.turnAttack(salmon01);
        assertEquals(true, room01.playerProgress());
    }

}
