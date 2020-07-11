package creational.factory_method.mensagem.concrete;

import creational.factory_method.mensagem.Emissor;

public class EmissorPush implements Emissor {
    @Override
    public void envia(String mensagem) {
        System.out.println(String.format("%S :: mensagem [%s] enviada. ::", this.getClass().getName(), mensagem));
    }
}
