package cursoDeJava.exercicios.POO.rascunhos.fds.enumeracao.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private tipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, tipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getTipoDoCliente() +
                ", idTipoCliente=" + tipoCliente.valor +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}

