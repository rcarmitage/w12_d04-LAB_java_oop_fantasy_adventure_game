import beings.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;

    @Before
    public void before() {
        troll = new Troll();
    }

    @Test
    public void healthPointsStartsAt10() {
        assertEquals(10, troll.getHealthPoints());
    }

    @Test
    public void canTakeDamage() {
        troll.takeDamage(1);
        assertEquals(9, troll.getHealthPoints());
    }

}
