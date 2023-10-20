package cursoDeJava.exercicios.POO.rascunhos.fds.Strings.test;

public class StringTest03 {
    public static void main(String[] args) {
        String nome = "Lucas Pio";
        nome.concat(" DEV");
        nome.substring(0, 3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Lucas Pio");
        sb.append(" - DEV").append(" Back-end").append(" em Java");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);

        // StringBuilders / StringBuffers são mutáveis e por isso tem um maior desempenho
    }
}
