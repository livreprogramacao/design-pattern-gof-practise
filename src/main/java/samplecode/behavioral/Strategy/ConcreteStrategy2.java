package samplecode.behavioral.Strategy;

public class ConcreteStrategy2 implements StrategyIF {
    // Switch text beginning with "the".
    public void algorithmInterface(String parm) {
        System.out.println((parm.toLowerCase().startsWith("the "))
                ? parm.substring(4) + ", " + parm.substring(0, 4)
                : parm);
    }
}
