package cursoDeJava.exercicios.POO.rascunhos.fds.associacao.teste;

import cursoDeJava.exercicios.POO.rascunhos.fds.associacao.dominio.Jogador;
import cursoDeJava.exercicios.POO.rascunhos.fds.associacao.dominio.Time;

public class TimeTest {

    public static void main(String[] args) {

        Time time = new Time("Flamengo");
        Jogador jogador = new Jogador("RodiLindo");

        jogador.setTime(time);

        jogador.imprime();

    }

}
