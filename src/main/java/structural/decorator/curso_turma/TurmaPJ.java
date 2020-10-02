package structural.decorator.curso_turma;

public class TurmaPJ extends TurmaAbstract {
    final Turma turmaDecorada;

    public TurmaPJ(Turma turma) {
        this.turmaDecorada = turma;
    }

    @Override
    public void addMatricula(Matricula m) {
        turmaDecorada.addMatricula(m);
    }

    @Override
    public void cancelarMatricula(Matricula m) {
        turmaDecorada.cancelarMatricula(m);
    }

    @Override
    public Contrato gerarContrato(String... clausulas) {
        return turmaDecorada.gerarContrato(clausulas);
    }

    @Override
    public double precoVaga() {
        return 0;
    }


}
