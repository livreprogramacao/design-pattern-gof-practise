package samplecode.behavioral.Mediator;

public class ConcreteColleague1 implements ColleagueIF {
    private final MediatorIF mediator;
    // This colleague uses a boolean for it's state.
    private boolean state;

    public ConcreteColleague1(MediatorIF parm) {
        this.mediator = parm;
        this.mediator.registerColleague1(this);
    }

    public void setState(boolean parm) {
        this.state = parm;
    }

    public void changeState() {
        state = !state;
        mediator.state1Changed();
    }

    public String toString() {
        return Boolean.toString(state);
    }
}
