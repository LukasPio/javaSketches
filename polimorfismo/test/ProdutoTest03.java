package cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.test;

import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.dominio.Computador;
import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.dominio.Produto;
import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.dominio.Tomate;
import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000, true);
        Tomate produto2 = new Tomate("Americano", 20);

        produto2.setDataValidade("29/10/2024");

        CalculadoraImposto.calcularImpostoProduto(produto2);
        CalculadoraImposto.calcularImpostoProduto(produto);

    }
}
