package samplecode.behavioral.Iterator;

import java.util.Collection;

public interface CollectionIF {
    // Interface for creating a
    // collection that needs iterating.
    IteratorIF iterator();

    Collection elements();
}
