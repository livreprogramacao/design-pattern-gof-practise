package structural.adapter;

public class Adaptee {
    public Adaptee() {
        System.out.println("Adaptee constructed.");
    }

    @SuppressWarnings("SameReturnValue")
    public String oldRequest() {
        return "Adaptee.oldRequest() called.";
    }
}
