import abilities.Axe;
import beings.Knight;
import beings.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Axe axe;

    @Before
    public void before() {
        axe = new Axe();
        knight = new Knight("Sir Robin", axe);
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
        Troll troll = new Troll();
        assertEquals("Swish Thwack!", knight.attack(troll));
        assertEquals(9, troll.getHealthPoints());
    }

}
