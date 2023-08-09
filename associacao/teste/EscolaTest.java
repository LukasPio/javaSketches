package cursoDeJava.exercicios.POO.rascunhos.fds.associacao.teste;

import cursoDeJava.exercicios.POO.rascunhos.fds.associacao.dominio.Escola;
import cursoDeJava.exercicios.POO.rascunhos.fds.associacao.dominio.Professor;

public class EscolaTest {

  public static void main (String[] args) {

      Professor professor = new Professor("Mestre Kami");
      Professor professor2 = new Professor("Mr. Bill");

      Professor[] listaDeProfessores = new Professor[] { professor, professor2 };
      Escola escola = new Escola("Raya Lucaria", listaDeProfessores);

      escola.imprime();
  }

}
