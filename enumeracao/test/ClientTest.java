package cursoDeJava.exercicios.POO.rascunhos.fds.enumeracao.test;

import cursoDeJava.exercicios.POO.rascunhos.fds.enumeracao.dominio.Cliente;
import cursoDeJava.exercicios.POO.rascunhos.fds.enumeracao.dominio.TipoCliente;

public class ClientTest {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Lucas", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Bradesco", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente5 = new Cliente("Bradesco", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Lucas", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Lucas", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);


    }
}
