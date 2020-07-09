package samplecode.creational.Builder;

public class Director {

    BuilderIF builder;

    public Director(BuilderIF parm) {
        this.builder = parm;
    }

    public void construct() {
        builder.buildCustomer();
    }
}
