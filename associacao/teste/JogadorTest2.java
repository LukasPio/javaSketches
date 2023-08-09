package cursoDeJava.exercicios.POO.rascunhos.fds.associacao.teste;

import cursoDeJava.exercicios.POO.rascunhos.fds.associacao.dominio.Jogador;
import cursoDeJava.exercicios.POO.rascunhos.fds.associacao.dominio.Time;

public class JogadorTest2 {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Arrascometa");
        Jogador jogador2 = new Jogador("Cansado Luiz");
        Jogador jogador3 = new Jogador("Rodilindo");

        Time time = new Time("Flamengo");
        Jogador[] listaDeJogadores = new Jogador[] { jogador, jogador2, jogador3 };
        time.setJogadores(listaDeJogadores);

        jogador.setTime(time);
        jogador2.setTime(time);

        System.out.println("----- Jogadores -----");
        jogador.imprime();
        jogador2.imprime();

        System.out.println("----- Time -----");
        time.imprime();


    }
}
