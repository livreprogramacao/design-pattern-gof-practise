package structural.decorator.curso_turma;

public class TurmaPadrao extends TurmaAbstract implements Turma {
    @Override
    public void addMatricula(Matricula m) {
        System.out.println("Lógica para adição de matricula na turma padrão.");
    }

    @Override
    public void cancelarMatricula(Matricula m) {
        System.out.println("Lógica para cancelar a matricula na turma padrão.");
    }

    @Override
    public double precoVaga() {
        System.out.println("Na turma padrão preço vaga, valor 11.50.");
        return 11.50;
    }

    @Override
    public Contrato gerarContrato(String... clausulas) {
        System.out.println("Lógica para criar um novo contrato na turma padrão.");
        return new Contrato();
    }
}
