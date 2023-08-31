package cursoDeJava.exercicios.POO.rascunhos.fds.enumeracao.dominio;

public enum tipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor *= 0.1;
        }

    }, CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor = 0;
        }
    };

    public abstract double calcularDesconto(double valor);


}
