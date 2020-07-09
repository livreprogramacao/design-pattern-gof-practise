package samplecode.creational.FactoryMethod;

public class ConcreteCreator implements CreatorIF {
    public TradeIF factoryMethod() {
        return new ConcreteTrade();
    }
}