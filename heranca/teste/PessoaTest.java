package cursoDeJava.exercicios.POO.rascunhos.fds.heranca.teste;

import cursoDeJava.exercicios.POO.rascunhos.fds.heranca.dominio.Endereco;
import cursoDeJava.exercicios.POO.rascunhos.fds.heranca.dominio.Funcionario;
import cursoDeJava.exercicios.POO.rascunhos.fds.heranca.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua Silvia");
        endereco.setCep("09571-300");
        Pessoa pessoa = new Pessoa("Jorge");
        pessoa.setCpf("142.723.193-59");
        pessoa.setEndereco(endereco);
        pessoa.imprime();


        Funcionario funcionario = new Funcionario("Lucas");

        funcionario.setCpf("125.247.729-35");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2055.23);
        funcionario.imprime();


    }
}
