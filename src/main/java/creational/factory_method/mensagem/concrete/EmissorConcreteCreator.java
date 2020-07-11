package creational.factory_method.mensagem.concrete;

import creational.factory_method.mensagem.Creator;
import creational.factory_method.mensagem.Emissor;
import creational.factory_method.mensagem.EmissorTipo;
import creational.factory_method.mensagem.concrete.EmissorEmail;

public class EmissorConcreteCreator implements Creator {

    @Override
    public Emissor factoryMethodCreator(EmissorTipo tipo) throws IllegalArgumentException {

        if (EmissorTipo.EMAIL.equals(tipo)) {
            return new EmissorEmail();
        } else if (EmissorTipo.SMS.equals(tipo)) {
            return new EmissorSMS();
        } else if (EmissorTipo.PUSH.equals(tipo)) {
            return new EmissorPush();
        } else if (EmissorTipo.JMS.equals(tipo)) {
            return new EmissorJMS();
        }
        throw new IllegalArgumentException("Tipo de emissor não suportado!");
    }
}
