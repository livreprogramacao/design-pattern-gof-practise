package samplecode.behavioral.Observer;

public interface SubjectIF {
    void addObserver(ObserverIF parm);

    void removeObserver(ObserverIF parm);

    void notifyObservers();
}
