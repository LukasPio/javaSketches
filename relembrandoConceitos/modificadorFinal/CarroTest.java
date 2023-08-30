package cursoDeJava.exercicios.POO.rascunhos.fds.relembrandoConceitos.modificadorFinal;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro = new Carro("Mustang");
        System.out.println(carro.comprador);
        carro.comprador.setNome("Plino");
        System.out.println(carro.comprador);

    }
}
