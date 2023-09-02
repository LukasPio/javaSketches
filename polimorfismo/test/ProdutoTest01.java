package cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.test;

import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.dominio.Computador;
import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.dominio.Televisao;
import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.dominio.Tomate;
import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {

        Computador computador = new Computador("NUC10i7", 11000, true);
        Tomate tomate = new Tomate("Tomate siciliano", 10);
        Televisao tv = new Televisao("Samsung 50 \" ", 5000);

        CalculadoraImposto.calcularImpostoProduto(computador);
        System.out.println("======== Divisor ========");
        CalculadoraImposto.calcularImpostoProduto(tomate);
        System.out.println("======== Divisor ========");
        CalculadoraImposto.calcularImpostoProduto(tv);


    }
}
