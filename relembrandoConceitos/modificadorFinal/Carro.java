package cursoDeJava.exercicios.POO.rascunhos.fds.relembrandoConceitos.modificadorFinal;

public class Carro {
    private String nome;
    public final Comprador comprador = new Comprador();
    public final double VELOCIDADE_LIMITE = 250;
    public Carro (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
