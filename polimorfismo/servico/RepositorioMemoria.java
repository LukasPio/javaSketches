package cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.servico;

import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
