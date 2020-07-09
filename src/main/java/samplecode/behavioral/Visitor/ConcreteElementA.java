package samplecode.behavioral.Visitor;

public class ConcreteElementA implements ElementIF {
    public void accept(VisitorIF parm) {
        parm.visitConcreteElementA(this);
    }

    public void operationA() {
        System.out.println("ConcreteElementA.operationA() called.");
    }
}
