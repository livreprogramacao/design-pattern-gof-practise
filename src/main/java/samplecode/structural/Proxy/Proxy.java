package samplecode.structural.Proxy;

public class Proxy implements ServiceIF {
    // Proxy to be the service
    private final Service service = new Service();

    public void action() {
        service.action();
    }
}
