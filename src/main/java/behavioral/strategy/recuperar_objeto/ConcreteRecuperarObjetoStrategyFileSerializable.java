package behavioral.strategy.recuperar_objeto;

public class ConcreteRecuperarObjetoStrategyFileSerializable implements RecuperarObjetoStrategy {
    @Override
    public void recuperarObjeto(String local) {
        System.out.println(String.format("valor [%s] recuperado do %s", "afa", local));
    }
}
