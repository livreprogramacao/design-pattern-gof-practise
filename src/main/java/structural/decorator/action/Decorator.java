package structural.decorator.action;

public class Decorator implements ComponentIF {
    final ComponentIF component = new ConcreteComponent();

    public void action() {
        component.action();
    }
}
