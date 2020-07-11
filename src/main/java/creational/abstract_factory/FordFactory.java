package creational.abstract_factory;

public class FordFactory implements AbstractFactoryIF {
    public AbstractSportsCarIF createSportsCar() {
        return new Mustang();
    }

    public AbstractEconomyCarIF createEconomyCar() {
        return new Focus();
    }
}
