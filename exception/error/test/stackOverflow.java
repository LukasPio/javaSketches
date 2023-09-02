package cursoDeJava.exercicios.POO.rascunhos.fds.exception.error.test;

public class stackOverflow {
    public static void main(String[] args) {

    recursivo();

    }

    public static void recursivo() {
        recursivo();
    }
}
