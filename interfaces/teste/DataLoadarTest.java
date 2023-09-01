package cursoDeJava.exercicios.POO.rascunhos.fds.interfaces.teste;

import cursoDeJava.exercicios.POO.rascunhos.fds.interfaces.dominio.DataBaseLoader;
import cursoDeJava.exercicios.POO.rascunhos.fds.interfaces.dominio.DataLoader;
import cursoDeJava.exercicios.POO.rascunhos.fds.interfaces.dominio.FileBaseLoader;

public class DataLoadarTest {
    public static void main(String[] args) {

        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileBaseLoader fileBaseLoader = new FileBaseLoader();

//        dataBaseLoader.load();
//        fileBaseLoader.load();
//        System.out.println("==========================");
//        fileBaseLoader.remover();
//        fileBaseLoader.remover();
//
//        dataBaseLoader.checkPermission();
//        fileBaseLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
