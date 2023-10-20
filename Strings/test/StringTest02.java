package cursoDeJava.exercicios.POO.rascunhos.fds.Strings.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Lucas";
        String numeros = "13579";
        System.out.println(nome.charAt(2)); // c
        System.out.println(nome.length()); // 5
        System.out.println(nome.replace("s", "z")); // Lucaz
        System.out.println(nome.toUpperCase()); // LUCAS
        System.out.println(nome.toLowerCase()); // lucas
        System.out.println(numeros.substring(0, 2)); // 13
        System.out.println(numeros.substring(2)); // 579
        System.out.println("               lucas  "); // "               lucas  "
        System.out.println("               lucas  ".trim()); // lucas
    }
}
