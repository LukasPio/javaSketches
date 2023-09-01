package cursoDeJava.exercicios.POO.rascunhos.fds.interfaces.dominio;

import cursoDeJava.exercicios.POO.rascunhos.fds.interfaces.dominio.DataBaseRemove;
import cursoDeJava.exercicios.POO.rascunhos.fds.interfaces.dominio.DataLoader;

public class FileBaseLoader implements DataLoader, DataBaseRemove {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remover() {
        System.out.println("Deletando dados de um arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Verificando permissões em um arquivo");
    }
}
