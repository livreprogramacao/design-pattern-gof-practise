package structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Composite extends Component {
    final String name;
    final List<Component> children = new ArrayList<>();

    public Composite(String parm) {
        this.name = parm;
        System.out.println(parm.trim() + " constructed.");
    }

    public String getName() {
        return name;
    }

    public Component getChild(int parm) {
        Component child;
        try {
            child = children.get(parm);
        } catch (IndexOutOfBoundsException ioobe) {
            child = null;
        }
        return child;
    }

    public void add(Component parm) {
        try {
            System.out.println("Adding " + parm.getName().trim() + " to " + this.getName().trim());
            children.add(parm);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void remove(Component parm) {
        try {
            System.out.println("Removing " + parm.getName().trim()
                    + " from " + this.getName().trim());
            children.remove(parm);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void display() {
        Iterator<Component> iterator = children.iterator();
        System.out.println(this.getName()
                + (iterator.hasNext() ? " with the following: " : " that is bare."));
        while (iterator.hasNext()) {
            (iterator.next()).display();
        }
    }
}
