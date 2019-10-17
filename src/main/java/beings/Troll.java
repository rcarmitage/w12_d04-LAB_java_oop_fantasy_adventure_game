package beings;

import abilities.IDefend;

public class Troll extends Enemy implements IDefend {

    public Troll() {
        super(10);
    }

    public int defend() {
        return 1;
    }
}
