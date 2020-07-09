package samplecode.behavioral.Iterator;

import java.util.List;

public class ConcreteIterator implements IteratorIF {
    private final List<Object> list;
    private int index;

    public ConcreteIterator(CollectionIF parm) {
        list = (List) parm.elements();
        index = 0;
    }

    public Object next() throws RuntimeException {
        try {
            return list.get(index++);
        } catch (IndexOutOfBoundsException ioobe) {
            throw new RuntimeException("No Such Element");
        }
    }

    public boolean hasNext() {
        return index < list.size();
    }
}
