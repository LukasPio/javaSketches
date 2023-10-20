package cursoDeJava.exercicios.POO.rascunhos.fds.Strings.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Lucas";
        String nome2 = "Lucas";

        nome = nome.concat(" Pio"); // nome += " Pio"

        System.out.println(nome);
        System.out.println(nome2 == (nome));

        String nome3 = new String("Lucas");

        System.out.println(nome3 == nome2);
        System.out.println(nome3.intern() == nome2);

        // Strings são imutáveis (não podem ter seus valores modificados sem a necessidade de uma nova atribuição)


    }
}
