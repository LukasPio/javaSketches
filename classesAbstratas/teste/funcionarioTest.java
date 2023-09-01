package cursoDeJava.exercicios.POO.rascunhos.fds.classesAbstratas.teste;

import cursoDeJava.exercicios.POO.rascunhos.fds.classesAbstratas.dominio.Desenvolvedor;
import cursoDeJava.exercicios.POO.rascunhos.fds.classesAbstratas.dominio.Funcionario;
import cursoDeJava.exercicios.POO.rascunhos.fds.classesAbstratas.dominio.Gerente;

public class funcionarioTest {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Jorge", 2000.80);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Lucas", 5300);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

    }
}
