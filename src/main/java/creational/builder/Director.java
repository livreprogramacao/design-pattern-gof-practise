package creational.builder;

public class Director {

    final BuilderIF builder;

    public Director(BuilderIF parm) {
        this.builder = parm;
    }

    public void construct() {
        builder.buildCustomer();
    }
}
