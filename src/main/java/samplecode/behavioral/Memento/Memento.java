package samplecode.behavioral.Memento;

public class Memento {
    private final boolean state;
    private final String name;

    Memento(boolean parm1, String parm2) {
        this.state = parm1;
        this.name = parm2;
    }

    boolean getState() {
        return this.state;
    }

    String getName() {
        return this.name;
    }
}
