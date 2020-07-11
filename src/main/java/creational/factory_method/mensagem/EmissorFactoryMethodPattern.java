package creational.factory_method.mensagem;

import creational.factory_method.mensagem.concrete.EmissorConcreteCreator;

public class EmissorFactoryMethodPattern {
    public static void main(String[] args) {
        Creator emissorMensagem = new EmissorConcreteCreator();

        // Envia uma mensagem por e-mail...
        Emissor enviaEmail = emissorMensagem.factoryMethodCreator(EmissorTipo.EMAIL);
        enviaEmail.envia("Inscrição confirmada!");

        // Notificação uma mensagem por push
        Emissor enviaPush = emissorMensagem.factoryMethodCreator(EmissorTipo.PUSH);
        enviaPush.envia("Você em um novo evento...");

        // Envia uma mensagem por SMS
        Emissor enviaSMS = emissorMensagem.factoryMethodCreator(EmissorTipo.SMS);
        enviaSMS.envia("Inscrição confirmada!");

        // Envia uma mensagem por JMS
        Emissor enviaJMS = emissorMensagem.factoryMethodCreator(EmissorTipo.JMS);
        enviaJMS.envia("Compra efetuada no valor de R$ 199,84 na loja da esquina.");
    }
}
