package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements SubjectIF {
    final List<ObserverIF> observers = new ArrayList<>();

    public void addObserver(ObserverIF parm) {
        observers.add(parm);
    }

    public void removeObserver(ObserverIF parm) {
        observers.remove(parm);
    }

    public void notifyObservers() {
        for (ObserverIF observer : observers) {
            observer.update();
        }
    }

    public void doSomething() {
        double d = Math.random();

        if (d < 0.25 || d > 0.75) {
            System.out.print("Yes");
            notifyObservers();
        } else {
            System.out.print("No");
        }
    }
}
