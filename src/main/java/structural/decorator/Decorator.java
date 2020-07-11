package structural.decorator;

public class Decorator implements ComponentIF {
    final ComponentIF component = new ConcreteComponent();

    public void action() {
        component.action();
    }
}
