package behavioral.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ConcreteCollection implements CollectionIF {

    // Builds an iterable list of elements
    private final ArrayList<Object> list = new ArrayList<>();

    public ConcreteCollection(Object[] objectList) {
        list.addAll(Arrays.asList(objectList));
    }

    public IteratorIF iterator() {
        return new ConcreteIterator(this);
    }

    public Collection elements() {
        return Collections.unmodifiableList(list);
    }

}
