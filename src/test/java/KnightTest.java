import abilities.Axe;
import abilities.Bow;
import abilities.Sword;
import beings.Knight;
import beings.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Sword sword;
    Troll troll;

    @Before
    public void before() {
        sword = new Sword();
        knight = new Knight("Sir Robin", sword);
        troll = new Troll();
    }

    @Test
    public void canGetName() {
        assertEquals("Sir Robin", knight.getName());
    }

    @Test
    public void healthPointsStartsAt10() {
        assertEquals(10, knight.getHealthPoints());
    }

    @Test
    public void canAttackEnemy() {
        assertEquals("Slicey slicey!", knight.attack(troll));
        assertEquals(8, troll.getHealthPoints());
    }

    @Test
    public void canChangeWeapon() {
        Axe axe = new Axe();
        knight.changeWeapon(axe);
        assertEquals("Swish Thwack!", knight.attack(troll));
    }

    @Test
    public void canAttackWithBow() {
        Bow bow = new Bow();
        knight.changeWeapon(bow);
        assertEquals("Twang thunk!", knight.attack(troll));
        assertEquals(9, troll.getHealthPoints());
    }

}
