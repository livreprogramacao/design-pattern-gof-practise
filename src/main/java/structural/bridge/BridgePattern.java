package structural.bridge;

public class BridgePattern {
    public static void main(String[] args) {
        System.out.println("Bridge Pattern Demonstration.");
        System.out.println("-----------------------------");
        System.out.println("Constructing SportsCar and EconomyCar.");
        AbstractionIF car1 = new SportsCar();
        AbstractionIF car2 = new EconomyCar();
        System.out.println(
                "Calling action() on SportsCar and EconomyCar.");
        car1.action();
        car2.action();
        System.out.println();
    }
}