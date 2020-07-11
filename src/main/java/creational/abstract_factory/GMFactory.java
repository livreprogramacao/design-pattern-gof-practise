package creational.abstract_factory;

public class GMFactory implements AbstractFactoryIF {
    public AbstractSportsCarIF createSportsCar() {
        return new Corvette();
    }

    public AbstractEconomyCarIF createEconomyCar() {
        return new Cavalier();
    }
}
