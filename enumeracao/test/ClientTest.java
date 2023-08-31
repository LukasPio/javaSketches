package cursoDeJava.exercicios.POO.rascunhos.fds.enumeracao.test;

import cursoDeJava.exercicios.POO.rascunhos.fds.enumeracao.dominio.Cliente;
import cursoDeJava.exercicios.POO.rascunhos.fds.enumeracao.dominio.TipoCliente;
import cursoDeJava.exercicios.POO.rascunhos.fds.enumeracao.dominio.tipoPagamento;

public class ClientTest {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Lucas", TipoCliente.PESSOA_FISICA, tipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Bradesco", TipoCliente.PESSOA_JURIDICA, tipoPagamento.DEBITO);

        System.out.println(cliente);
        System.out.println(cliente2);

        System.out.println(tipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(tipoPagamento.DEBITO.calcularDesconto(100));

        TipoCliente tipoDoCliente = TipoCliente.tipoClientePorNomeDeRelatorio("Pessoa física");
        TipoCliente tipoDoCliente2 = TipoCliente.tipoClientePorNomeDeRelatorio("Pessoa jurídica");

        System.out.println(tipoDoCliente);
        System.out.println(tipoDoCliente2);



    }
}
