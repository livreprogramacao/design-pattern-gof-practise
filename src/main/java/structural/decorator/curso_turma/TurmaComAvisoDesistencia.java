package structural.decorator.curso_turma;

public class TurmaComAvisoDesistencia implements Turma {
    TurmaPromocional turmaPromocional;

    public TurmaComAvisoDesistencia(TurmaPromocional turma) {
        this.turmaPromocional = turma;
    }

    public void addMatricula(Matricula matricula) {
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
