import abilities.Sword;
import beings.Knight;
import beings.Salmon;
import beings.Troll;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Knight player;
    Sword sword;
    Troll troll;
    Salmon salmon01;

    @Before
    public void before() {
        room = new Room(player);
        player = new Knight("Knight01", sword);
        troll = new Troll();
        salmon01 = new Salmon();
    }

    @Test
    public void playerStartsCannotProgress() {
        assertEquals (false, room.progress);
    }

    @Test
    public void roomCanAddEnemy() {
        room.addEnemy(troll);
        assertEquals(1, room.enemiesAlive.size());
    }

    @Test
    public void canDefeatEnemy() {
        room.addEnemy(salmon01);
        room.turnAttack(salmon01);
        room.isEnemyAlive(salmon01);
        assertEquals(0, room.enemiesAlive.size());


////        salmon01.getHealthPoints();
//        if salmon01.getHealthPoints() = 0 {
////            if healthpoints = 0 then remove from enemiesAlive and add to enemiesDead
//            room.enemiesAlive.remove(0);
//            room.enemiesDead.add(salmon01);
//        }
//        return
    }

//    @Test
//    public void playerCanProgress() {
//
//    }

}
