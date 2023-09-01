package cursoDeJava.exercicios.POO.rascunhos.fds.classesAbstratas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calcularBonus() {
        this.salario *= 1.5;
    }
    @Override
    public void imprime() {
        System.out.println("Nome do cargo: Desenvolvedor, salário: " + this.salario);
    }
}
