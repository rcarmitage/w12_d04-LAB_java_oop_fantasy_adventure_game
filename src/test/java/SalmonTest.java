import abilities.Axe;
import beings.Dwarf;
import beings.Salmon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalmonTest {

    Salmon salmon;

    @Before
    public void before() {
        salmon = new Salmon();
    }

    @Test
    public void startsWith1HealthPoint() {
        assertEquals(1, salmon.getHealthPoints());
    }

    @Test
    public void cannotOverkill() {
        salmon.takeDamage(2);
        assertEquals(0, salmon.getHealthPoints());
    }

    @Test
    public void cannotDefend() {
        Axe myAxe = new Axe();
        Dwarf dwarf = new Dwarf("Gimli", myAxe);
        dwarf.attack(salmon);
        assertEquals(0, salmon.getHealthPoints());
    }

}
