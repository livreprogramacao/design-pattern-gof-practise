package samplecode.creational.AbstractFactory;

public class FordFactory implements AbstractFactoryIF {
    public AbstractSportsCarIF createSportsCar() {
        return new Mustang();
    }

    public AbstractEconomyCarIF createEconomyCar() {
        return new Focus();
    }
}
