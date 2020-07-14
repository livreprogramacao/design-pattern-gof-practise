package structural.decorator.action;

public class ConcreteDecoratorA extends Decorator {
    String addedVariable;

    public void action() {
        super.action();
        System.out.println("ConcreteDecoratorA.action() called.");
        addedVariable = "extra";
        System.out.println("ConcreteDecoratorA.addedVariable=" + addedVariable);
    }
}
