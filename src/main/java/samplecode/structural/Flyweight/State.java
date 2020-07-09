package samplecode.structural.Flyweight;

public class State {
    private final boolean state;

    public State(boolean parm) {
        this.state = parm;
    }

    public boolean getState() {
        return state;
    }
}
