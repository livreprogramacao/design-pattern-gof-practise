package structural.decorator.curso_turma;

public class TurmaPromocional implements Turma {
    public TurmaPromocional(Turma turma, double v) {

    }

    @Override
    public void addMatricula(Matricula m) {

    }

    @Override
    public void cancelarMatricula(Matricula m) {

    }

    @Override
    public double precoVaga() {
        return 0;
    }

    @Override
    public Contrato gerarContrato(String... clausulas) {
        return null;
    }
}
