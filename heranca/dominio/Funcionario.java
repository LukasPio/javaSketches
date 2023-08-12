package cursoDeJava.exercicios.POO.rascunhos.fds.heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Dentro de um bloco de inicialização estático de funcionário");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionário 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionário 2");
    }

    public Funcionario(String nome) {

       super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }

    public void relatorioDePagamento() {
        System.out.println("Eu, " + this.nome + ", recebi um salário de " + this.salario);
    }
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }


}
