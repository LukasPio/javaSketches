package cursoDeJava.exercicios.POO.rascunhos.fds.polimorfismo.dominio;

public class Computador extends Produto {
    public Computador(String nome, double valor, boolean comWindows) {
        super(nome, valor);
        this.comWindows = comWindows;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador...");
        return this.valor * IMPOSTO;
    }

    private boolean comWindows;

    public boolean getComWindows() {
        return comWindows;
    }

    public void setComWindows(boolean comWindows) {
        this.comWindows = comWindows;
    }
}
