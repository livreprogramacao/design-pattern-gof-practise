package creational.factory_method.mensagem;

;

/**
 * Envio de mensagem após um evento ser realizado.
 */
public interface Emissor {
    void envia(final String mensagem);
}
