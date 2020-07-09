package samplecode.behavioral.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteSubject implements SubjectIF {
    List observers = new ArrayList();

    public void addObserver(ObserverIF parm) {
        observers.add(parm);
    }

    public void removeObserver(ObserverIF parm) {
        observers.remove(parm);
    }

    public void notifyObservers() {
        for (Iterator i = observers.iterator(); i.hasNext(); ) {
            ((ObserverIF) i.next()).update();
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
