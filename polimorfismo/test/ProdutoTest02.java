package cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.test;

import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.dominio.Computador;
import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.dominio.Produto;
import cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000, true);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println("--------------------------------");
        Produto produto2 = new Tomate("Americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
    }
}
