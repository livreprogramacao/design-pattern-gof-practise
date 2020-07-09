package samplecode.behavioral.Mediator;

public interface MediatorIF {
    //Interface for communicating with colleagues
    void registerColleague1(ColleagueIF parm);

    void registerColleague2(ColleagueIF parm);

    void state1Changed();

    void state2Changed();
}
