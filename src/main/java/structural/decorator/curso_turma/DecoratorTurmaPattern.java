package structural.decorator.curso_turma;

public class DecoratorTurmaPattern {
    public static void main(String[] args) {
        Turma turma1 = new TurmaPadrao();
        TurmaPromocional turmaPromo = new TurmaPromocional(turma1, 10);
        TurmaComAvisoDesistencia turmaAviso = new TurmaComAvisoDesistencia(turmaPromo);
        turmaAviso.addMatricula(new Matricula());

        Turma t1 = new TurmaComAvisoDesistencia(new TurmaPromocional(new TurmaPadrao(), 10.0));
        t1.addMatricula(new Matricula());
        t1.gerarContrato();
    }
}
