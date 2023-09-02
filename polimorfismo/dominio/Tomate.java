package cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.dominio;

public class Tomate extends Produto{
    private String dataValidade;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }
    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate...");
        return this.valor * IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
