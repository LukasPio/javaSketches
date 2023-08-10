package cursoDeJava.exercicios.POO.rascunhos.fds.associacao.teste;

import java.util.Random;
import java.util.Scanner;

public class oneSimpleGameWithScanner {

    public static void responder() {
        Random random = new Random();

        String Sim = "Sim";
        String Nao = "Não";

        int escolhaAleatoria = random.nextInt(2);

        String resposta = (escolhaAleatoria == 0 ? Sim : Nao);

        System.out.println(resposta);
    }

    public static void main(String[] args) {

        System.out.println("O grande oráculo de Deplhos foi convocado\n");
        Scanner entrada = new Scanner(System.in);
        do {

            System.out.println("Faça sua pergunta para ser respondida com sim ou não");
            String pergunta = entrada.nextLine();
            responder();

        } while (true);

    }

}
