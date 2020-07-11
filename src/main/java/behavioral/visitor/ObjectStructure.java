package behavioral.visitor;

import java.util.Arrays;
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
        for (Object o : objectStruct) {
            ((ElementIF) o).accept(visitor);
        }
    }
}
