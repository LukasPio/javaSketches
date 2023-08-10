package cursoDeJava.exercicios.POO.rascunhos.fds.associacao.teste;
import java.util.Scanner;

public class leituraDeTecladoComScanner {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo");
        String nome = entrada.next();

        System.out.println("Digite sua idade abaixo");
        int idade = entrada.nextInt();

        System.out.println("Digite M para masculino e F para feminino");
        char sexo = entrada.next().charAt(0);
        System.out.println("\n");

        System.out.println("----- Seus Dados -----");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("----------------------");

    }

}
