package behavioral.observer;

public interface SubjectIF {
    void addObserver(ObserverIF parm);

    void removeObserver(ObserverIF parm);

    void notifyObservers();
}
