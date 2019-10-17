import abilities.Axe;
import beings.Dwarf;
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

}
