package cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.dominio;

public abstract class Produto implements Taxavel{
    public static final double IMPOSTO = 0.21;
    protected String nome;
    protected double valor;
    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
