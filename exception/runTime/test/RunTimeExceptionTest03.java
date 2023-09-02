package cursoDeJava.exercicios.POO.rascunhos.fds.exception.runTime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {

        abrindoConexao();

        abrindoConexao2();
    }

    public static String abrindoConexao () {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Fechando arquivo");
        }
        return null;
    }

    public static void abrindoConexao2 () {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        }

        finally {
            System.out.println("Fechando arquivo");
        }

    }
}
