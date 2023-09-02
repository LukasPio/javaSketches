package cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.test;

import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.repositorio.Repositorio;
import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.servico.RepositorioArquivo;
import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.servico.RepositorioBancoDeDados;
import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {

        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();

    }
}
