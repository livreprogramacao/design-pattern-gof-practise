package creational.prototype;

public interface PrototypeIF {
    PrototypeIF getClone(); // as opposed to Object.clone()

    void action();
}
