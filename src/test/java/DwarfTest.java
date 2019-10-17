import abilities.Axe;
import beings.Dwarf;
import beings.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Axe axe;

    @Before
    public void before() {
        axe = new Axe();
        dwarf = new Dwarf("Gimli", axe);
    }

    @Test
    public void canGetName() {
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void healthPointsStartsAt10() {
        assertEquals(10, dwarf.getHealthPoints());
    }

    @Test
    public void canAttackEnemy() {
        Troll troll = new Troll();
        assertEquals("Swish Thwack!", dwarf.attack(troll));
        assertEquals(9, troll.getHealthPoints());
    }

}
