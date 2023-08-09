package cursoDeJava.exercicios.POO.rascunhos.fds.associacao.dominio;

public class Professor {

    public Professor(String nome) {
        this.nome = nome;
    }

    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
