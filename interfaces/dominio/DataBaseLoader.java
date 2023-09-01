package cursoDeJava.exercicios.POO.rascunhos.fds.interfaces.dominio;

import jdk.jfr.MemoryAddress;

public class DataBaseLoader implements DataLoader, DataBaseRemove {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }
    @Override
    public void remover() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na classe DataBaseLoader");
    }


}

