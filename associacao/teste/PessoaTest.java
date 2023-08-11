package cursoDeJava.exercicios.POO.rascunhos.fds.associacao.teste;

import cursoDeJava.exercicios.POO.rascunhos.fds.associacao.dominio.Endereco;
import cursoDeJava.exercicios.POO.rascunhos.fds.associacao.dominio.Funcionario;
import cursoDeJava.exercicios.POO.rascunhos.fds.associacao.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua Silvia");
        endereco.setCep("09571-300");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jorge Plino");
        pessoa.setCpf("142.723.193-59");
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Lucas");
        funcionario.setCpf("125.247.729-35");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2055.23);
        funcionario.imprime();
    }
}