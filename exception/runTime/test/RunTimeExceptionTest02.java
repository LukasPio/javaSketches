package cursoDeJava.exercicios.POO.rascunhos.fds.exception.runTime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {

        divisao(1,0);

    }

    /**
     * @param a
     * @param b: não pode ser zero
     * @return
     * @throws IllegalArgumentException, caso b = 0
     */

    public static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero é inválido");
        }

        return a/b;
    }
}
