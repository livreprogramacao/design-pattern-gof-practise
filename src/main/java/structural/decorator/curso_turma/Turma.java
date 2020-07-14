package structural.decorator.curso_turma;

public interface Turma {
    void addMatricula(Matricula m);

    void cancelarMatricula(Matricula m);

    double precoVaga();

    Contrato gerarContrato(String... clausulas);
}
