package cursoDeJava.exercicios.POO.rascunhos.fds.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) throws IOException{

        criarNovoArquivo();

    }

    //Para métodos privados, é recomendado que você use try catch

    //Para métodos públicos é preferível a utilização do throws

    private static void criarNovoArquivo() throws IOException{
        File file = new File("diretorio/arquivo.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        }

        catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Problema ao tentar criar um arquivo");
        }


    }
}
