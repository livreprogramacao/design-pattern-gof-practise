package behavioral.strategy.recuperar_objeto;

public class RecuperarObjetoContext {
    private final RecuperarObjetoStrategy strategy;

    public RecuperarObjetoContext(RecuperarObjetoStrategy strategy) {
        this.strategy = strategy;
    }

    public void recuperarObjeto(String local_objeto) {
        this.strategy.recuperarObjeto(local_objeto);
    }
}
