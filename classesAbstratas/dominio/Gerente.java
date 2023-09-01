package cursoDeJava.exercicios.POO.rascunhos.fds.classesAbstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
    @Override
    public void calcularBonus () {
        this.salario *= 1.2;
    }

    @Override
    public void imprime() {
        System.out.println("Nome do cargo: Gerente, salário: " + this.salario);
    }
}
