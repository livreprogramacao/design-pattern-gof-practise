package behavioral.strategy.aplicacao_financeira;

public class InvestimentoPoupança implements Investimento {
    @Override
    public void aplicar(double valor) {
        System.out.println("valor R$ %d investido na Poupança");
    }

    @Override
    public void resgatar(double valor) {
        System.out.println("valor R$ %d resgatado da Poupança");
    }
}
