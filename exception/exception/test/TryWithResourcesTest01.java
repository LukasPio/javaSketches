package cursoDeJava.exercicios.POO.rascunhos.fds.exception.exception.test;

import cursoDeJava.exercicios.POO.rascunhos.fds.exception.dominio.Leitor1;
import cursoDeJava.exercicios.POO.rascunhos.fds.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
    lerArquivo();
    }
    public static void lerArquivo() {
        try(Leitor2 leitor2 = new Leitor2();
            Leitor1 leitor1 = new Leitor1()) {

        }
        catch (IOException exception) {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            }
            catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
