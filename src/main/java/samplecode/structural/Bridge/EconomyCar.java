package samplecode.structural.Bridge;

public class EconomyCar implements AbstractionIF {
    ImplementorIF implementor = new EconomyCarImplementor();

    public EconomyCar() {
        System.out.println("EconomyCar constructed.");
    }

    public void action() {
        implementor.actionImplemented();
    }
}
