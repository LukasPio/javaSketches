package cursoDeJava.exercicios.POO.rascunhos.fds.relembrandoConceitos.heranca_assossicacao;

public class Dono {
    protected String nome;
    protected int Idade;
    protected Cachorro[] cachorros;

    public Dono(String nome, int idade, Cachorro[] cachorros) {
        this.nome = nome;
        Idade = idade;
        this.cachorros = cachorros;
    }

    public Dono(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("----- Dados do Dono -----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.Idade);
        if (this.cachorros != null) {
            for (Cachorro cachorro : this.cachorros) {
                System.out.println(String.format("----- Dados do %s -----", cachorro.nome));
                cachorro.imprime();
            }

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public Cachorro[] getCachorro() {
        return cachorros;
    }

    public void setCachorro(Cachorro[] cachorros) {
        this.cachorros = cachorros;
    }
}
