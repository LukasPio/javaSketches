package cursoDeJava.exercicios.POO.rascunhos.fds.fibonacciSequence;

import javax.swing.*;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        int numeroFibonacci = 0;
        int numeroIncrementado = numeroFibonacci + 1;
        int aux;
        int tamanhoFibonacci = 5;

        for (int i = 0; i < tamanhoFibonacci; i++) {
            aux = numeroFibonacci;
            numeroFibonacci += numeroIncrementado;
            numeroIncrementado = aux;
            System.out.println(numeroFibonacci);
        }

    }
}
