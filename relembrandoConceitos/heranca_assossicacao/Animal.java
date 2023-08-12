package cursoDeJava.exercicios.POO.rascunhos.fds.relembrandoConceitos.heranca_assossicacao;

public class Animal {
    protected String nome;
    protected int idade;
    protected int quantidadeDePatas;
    protected char sexo;

    public Animal(String nome, int idade, int quantidadeDePatas, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeDePatas = quantidadeDePatas;
        this.sexo = sexo;
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Nome do animal: " + this.nome);
        System.out.println("Idade do animal: " + this.idade);
        System.out.println("Quantidade de patas do animal: " + this.quantidadeDePatas);
        System.out.println("Sexo do animal: " + this.sexo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQuantidadeDePatas() {
        return quantidadeDePatas;
    }

    public void setQuantidadeDePatas(int quantidadeDePatas) {
        this.quantidadeDePatas = quantidadeDePatas;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
