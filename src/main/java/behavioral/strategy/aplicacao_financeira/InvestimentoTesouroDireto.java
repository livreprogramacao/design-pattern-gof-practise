package behavioral.strategy.aplicacao_financeira;

public class InvestimentoTesouroDireto implements Investimento {
    @Override
    public void aplicar(double valor) {
        System.out.println("valor R$ %d investido no Tesouro Direto.");
    }

    @Override
    public void resgatar(double valor) {
        System.out.println("valor R$ %d resgatado do Tesouro Direto.");
    }
}
