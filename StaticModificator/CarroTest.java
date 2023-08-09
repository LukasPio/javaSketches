package cursoDeJava.exercicios.POO.rascunhos.fds.StaticModificator;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("Fuscão", 400);
        Carro c2 = new Carro("Mercedes", 290);
        Carro c3 = new Carro("Audi", 275);

        c1.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
