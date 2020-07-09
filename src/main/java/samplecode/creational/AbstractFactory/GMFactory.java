package samplecode.creational.AbstractFactory;

public class GMFactory implements AbstractFactoryIF {
    public AbstractSportsCarIF createSportsCar() {
        return new Corvette();
    }

    public AbstractEconomyCarIF createEconomyCar() {
        return new Cavalier();
    }
}
