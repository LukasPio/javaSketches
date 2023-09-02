package cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.servico;

import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
