package cursoDeJava.exercicios.POO.rascunhos.fds.heranca.dominio;

import cursoDeJava.exercicios.POO.rascunhos.fds.heranca.dominio.Endereco;

public class Pessoa {
    protected String nome;
    private String cpf;
    private Endereco endereco;
    static {
        System.out.println("Dentro de um bloco de inicialização estático de pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de pessoa 2");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this(nome);
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void imprime() {

        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
