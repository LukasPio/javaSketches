package cursoDeJava.exercicios.POO.rascunhos.fds.associacao.teste;

import cursoDeJava.exercicios.POO.rascunhos.fds.associacao.dominio.Jogador;

public class JogadorTest {

    public static void main(String[] args) {

        Jogador j1 = new Jogador("Arrascometa");
        Jogador j2 = new Jogador("RodiLindo");
        Jogador j3 = new Jogador("BH");

        Jogador[] jogadores = new Jogador[] { j1, j2, j3 };

        for (Jogador jogador: jogadores) {
            jogador.imprime();
        }
    }

}
