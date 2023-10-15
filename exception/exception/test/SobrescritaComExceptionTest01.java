package cursoDeJava.exercicios.POO.rascunhos.fds.exception.exception.test;

import cursoDeJava.exercicios.POO.rascunhos.fds.exception.dominio.Funcionario;
import cursoDeJava.exercicios.POO.rascunhos.fds.exception.dominio.LoginInvalidoException;
import cursoDeJava.exercicios.POO.rascunhos.fds.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        }
        catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
