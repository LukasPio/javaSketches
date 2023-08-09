package cursoDeJava.exercicios.POO.rascunhos.fds.StaticModificator;

public class Carro {
    private String nome;
    private double velocidadeMaxima;

    // o modificador static faz com que essa propriedade afete não só o objeto, mas sim, todos os objetos da classe Carro
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("------------\n");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade limite: " + this.velocidadeLimite);
        System.out.println("Velocidade máxima: " + this.velocidadeMaxima + "\n");
        System.out.println("------------");
    }

    public static void setVelocidadeLimite(double velocidade) {
        Carro.velocidadeLimite = velocidade;
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }
}
