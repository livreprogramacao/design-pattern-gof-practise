package structural.bridge;

public class SportsCar implements AbstractionIF {
    final ImplementorIF implementor = new SportsCarImplementor();

    public SportsCar() {
        System.out.println("SportsCar constructed.");
    }

    public void action() {
        implementor.actionImplemented();
    }
}
