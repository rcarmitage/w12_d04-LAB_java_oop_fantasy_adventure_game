package beings;

import abilities.IDefend;

public class Troll extends Enemy implements IDefend {

    public Troll() {
    }

    public int defend() {
        return 1;
    }
}
