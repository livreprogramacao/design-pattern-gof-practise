package creational.factory_method.mensagem;

public interface Creator {
    Emissor factoryMethodCreator(EmissorTipo tipo) throws IllegalArgumentException;
}
