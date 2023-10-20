package cursoDeJava.exercicios.POO.rascunhos.fds.Strings.test;

public class StringPerformanceTest {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concatStrings(100000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (fim - inicio) + " ms"); // 2719 ms para 100000

        inicio = System.currentTimeMillis();
        concatStringsBuilder(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (fim - inicio) + " ms"); // 24 ms para 1.000.000

        inicio = System.currentTimeMillis();
        concatStringsBuffer(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (fim - inicio) + " ms"); // 32 ms para 1.000.000
    }

    private static void concatStrings(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringsBuilder(int tamanho) {
        StringBuilder stringBuilder = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            stringBuilder.append(i);
        }
    }

    private static void concatStringsBuffer(int tamanho) {
        StringBuffer stringBuffer = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            stringBuffer.append(i);
        }
    }
}
