package behavioral.strategy.recuperar_objeto.concrete;

import behavioral.strategy.recuperar_objeto.RecuperarObjetoStrategy;

public class ConcreteRecuperarObjetoStrategyHardDisk implements RecuperarObjetoStrategy {
    @Override
    public void recuperarObjeto(String local) {
        System.out.println(String.format("valor [%s] recuperado do %s", "ghk", local));
    }
}
