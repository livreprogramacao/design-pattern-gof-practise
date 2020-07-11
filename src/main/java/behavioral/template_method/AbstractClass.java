package behavioral.template_method;

public abstract class AbstractClass {
    public void templateMethod() {
        System.out.println("AbstractClass.templateMethod() called.");
        primitiveOperation1();
        primitiveOperationN();
    }

    public abstract void primitiveOperation1();

    public abstract void primitiveOperationN();
}
