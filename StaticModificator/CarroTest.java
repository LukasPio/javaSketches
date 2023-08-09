package cursoDeJava.exercicios.POO.rascunhos.fds.StaticModificator;

public class CarroTest {
    public static void main(String[] args) {

        System.out.println(Carro.getVelocidadeLimite());

        Carro c1 = new Carro("Fuscão", 400);
        Carro c2 = new Carro("Mercedes", 290);
        Carro c3 = new Carro("Audi", 275);

        Carro.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
