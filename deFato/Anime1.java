package cursoDeJava.exercicios.POO.rascunhos.fds.deFato;

public class Anime1 {
    //Ordem de procedimentos após a criação de um objeto

    // 1- Alocação de espaço em memória
    // 2- Cada atributo de classe é criado e inicializado com os valores default ou o quer for passado
    // 3- Bloco de inicialização é executado
    // 4- Construtor é executado

    private String nome = "OneRandomAnime\n";
    private int[] episodios;

    {
        System.out.println("Dentro do bloco de inicialização");
        this.episodios = new int[100];

        for (int i = 0; i < this.episodios.length; i++) {
            this.episodios[i] = i + 1;
        }

        for (int episodio: this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println("\n");
        System.out.println("Fora do bloco de inicialização: \n");
    }


    public Anime1(String nome) {
        this.nome = nome;
    }

    public Anime1 () {
    }

    public String getNome() {
        return nome;
    }

}
