package cursoDeJava.exercicios.POO.rascunhos.fds.enumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa física"),
    PESSOA_JURIDICA(2, "Pessoa jurídica");

    public final int valor;
    public final String tipoDoCliente;
    TipoCliente(int valor, String tipoDoCliente) {
        this.valor = valor;
        this.tipoDoCliente = tipoDoCliente;
    }

    public static TipoCliente tipoClientePorNomeDeRelatorio(String nomeRelatorio) {

        for (TipoCliente tipoDoClienteAtual : values()) {

            if (tipoDoClienteAtual.getTipoDoCliente().equals(nomeRelatorio)) {
                return tipoDoClienteAtual;
            }

        }
        return null;
    }



    public String getTipoDoCliente() {
        return tipoDoCliente;
    }

    public int getValor() {
        return valor;
    }
}
