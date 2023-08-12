package cursoDeJava.exercicios.POO.rascunhos.fds.relembrandoConceitos.heranca_assossicacao;



public class Test {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Bemji");
        Cachorro[] cachorros = new Cachorro[] { cachorro };
        Dono dono = new Dono("Jequerson");

        dono.setCachorro(cachorros);
        dono.setIdade(15);
        cachorro.setDono(dono);
        cachorro.setIdade(3);
        cachorro.setSexo('M');
        cachorro.setQuantidadeDePatas(4);

        dono.imprime();
    }
}
