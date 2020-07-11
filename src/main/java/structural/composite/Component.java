package structural.composite;

public abstract class Component {

    public abstract void display();

    public void add(Component c) { // override in concrete class;
    }

    public void remove(Component c) { // override in concrete class;
    }

// --Commented out by Inspection START (09/07/2020, 13:12):
//    public Component getChild(int index) {
//        return null;
//    }
// --Commented out by Inspection STOP (09/07/2020, 13:12)

    public String getName() {
        return null;
    }

}