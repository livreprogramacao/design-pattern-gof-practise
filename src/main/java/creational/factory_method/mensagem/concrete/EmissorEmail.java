package creational.factory_method.mensagem.concrete;

import creational.factory_method.mensagem.Emissor;

public class EmissorEmail implements Emissor {
    @Override
    public void envia(String mensagem) {
        System.out.println(String.format(MENSAGEM_ENVIADA_TIPO_EMISSOR, mensagem, this.getClass().getName()));
    }
}
