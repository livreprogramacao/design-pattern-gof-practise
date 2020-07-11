package creational.factory_method.trade;

public class ConcreteCreator implements CreatorIF {
    public TradeIF factoryMethod() {
        return new ConcreteTrade();
    }
}