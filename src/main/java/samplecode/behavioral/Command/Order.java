package samplecode.behavioral.Command;

public class Order implements ReceiverIF {
    public void action() {
        System.out.println("Order.action() called.");
    }
}
