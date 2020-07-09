package samplecode.behavioral.Visitor;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ObjectStructure {
    private final List objectStruct;
    private VisitorIF visitor;

    public ObjectStructure(ElementIF[] parm) {
        objectStruct = Arrays.asList(parm);
    }

    public void visitElements() {
        if (visitor == null) {
            visitor = new ConcreteVisitor();
        }
        for (Iterator i = objectStruct.iterator(); i.hasNext(); ) {
            ((ElementIF) i.next()).accept(visitor);
        }
    }
}
