package cursoDeJava.exercicios.POO.rascunhos.fds.relembrandoConceitos.heranca_assossicacao;

public class Cachorro extends Animal{

    protected Dono dono;
    public Cachorro(String nome) {
        super(nome);
    }

    public Cachorro(String nome, int idade, int quantidadeDePatas, char sexo) {
        super(nome, idade, quantidadeDePatas, sexo);
    }

    public void imprime() {
        super.imprime();
        System.out.println("Nome do dono: " + this.dono.nome);
    }

    public void miar() {
        System.out.println("Miau");
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }
}
