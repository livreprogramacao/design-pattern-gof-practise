package behavioral.strategy.recuperar_objeto;

import behavioral.strategy.recuperar_objeto.concrete.*;

public class RecuperarObjetoStrategyPattern {

    public static void main(String[] args) {
        System.out.println("Strategy Pattern Demonstration.");
        System.out.println("-------------------------------");

        // Construct strategies.
        System.out.println("Recuperar o estado de um objeto de diferentes locais.");
        RecuperarObjetoStrategy memoriaHeap = new ConcreteRecuperarObjetoStrategyMemoriaHeap();
        RecuperarObjetoStrategy hardDisk = new ConcreteRecuperarObjetoStrategyHardDisk();
        RecuperarObjetoStrategy database = new ConcreteRecuperarObjetoStrategyDatabase();
        RecuperarObjetoStrategy fileSerializable = new ConcreteRecuperarObjetoStrategyFileSerializable();
        RecuperarObjetoStrategy network = new ConcreteRecuperarObjetoStrategyNetwork();

        // Construct contexts.
        System.out.println("Constructing contexts.");
        RecuperarObjetoContext context1 = new RecuperarObjetoContext(memoriaHeap);
        RecuperarObjetoContext context2 = new RecuperarObjetoContext(hardDisk);
        RecuperarObjetoContext context3 = new RecuperarObjetoContext(database);
        RecuperarObjetoContext context4 = new RecuperarObjetoContext(fileSerializable);
        RecuperarObjetoContext context5 = new RecuperarObjetoContext(network);

        // Execute contextInterface.
        System.out.println("Constructing context interfaces.");
        context1.recuperarObjeto("Memória heap");
        context2.recuperarObjeto("Hard-disk");
        context3.recuperarObjeto("Database");
        context4.recuperarObjeto("Arquivo serializado");
        context5.recuperarObjeto("Rede");

        System.out.println();
    }

}
