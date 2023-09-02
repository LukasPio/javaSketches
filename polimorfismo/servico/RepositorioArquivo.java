package cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.servico;

import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
