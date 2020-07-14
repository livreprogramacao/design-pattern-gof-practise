package structural.decorator.curso_turma;

import java.util.Collection;

public abstract class TurmaAbstract implements Turma {
    private Collection<Matricula> matriculas;

    @Override
    public double precoVaga() {
        return 10.0;
    }

    @Override
    public Contrato gerarContrato(String... clausulas) {
        return null;
    }
}
