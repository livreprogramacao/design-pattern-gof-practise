package creational.factory_method.mensagem;

/**
 * Envio de mensagem após um evento ser realizado.
 */
public interface Emissor {
    String MENSAGEM_ENVIADA_TIPO_EMISSOR = ":: mensagem [%s] enviada  Emissor [%S] ::";

    void envia(final String mensagem);
}
