package cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.servico;

import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.dominio.Computador;
import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.dominio.Produto;
import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoProduto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Imprimindo relatório de: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
        if (produto instanceof Computador) {
            Computador computador = (Computador) produto;
            if (computador.getComWindows() == true) {
                System.out.println("O computador tem windows");
            }
            else {
                System.out.println("O computador não possui windows");
            }
        }

    }
}
