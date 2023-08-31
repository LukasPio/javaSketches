package cursoDeJava.exercicios.POO.rascunhos.fds.fibonacciSequence;

import javax.swing.*;

public class fibonacci {
    public static void main(String[] args) {

        int numeroAtual = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número ára a sequência de fibonacci"));
        int numeroAnterior = numeroAtual - 1;
        int auxiliar;

        for (int i = 0; i < 10; i++) {

            auxiliar = numeroAtual;
            System.out.println(numeroAtual += numeroAnterior);
            numeroAnterior = auxiliar;

        }

    }
}
