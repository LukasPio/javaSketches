package cursoDeJava.exercicios.POO.rascunhos.fds.enumeracao.exercicioDiasDaSemana;

public enum DiasDaSemana {
    DOMINGO(false, "Domingo"),
    SEGUNDA(true, "Segunda-feira"),
    TERCA(true, "Terça-feira"),
    QUARTA(true,"Quarta-feira"),
    QUINTA(true,"Quinta-feira"),
    SEXTA(true,"Sexta-feira"),
    SABADO(false, "Sábado");

    private final boolean diaUtil;
    private final String nomeDoDia;

    DiasDaSemana(boolean diaUtil, String nomeDoDia) {
        this.diaUtil = diaUtil;
        this.nomeDoDia = nomeDoDia;
    }

    public void isUtilDay () {
        if (getDiaUtil() == true) {
            System.out.println("Esse é um dia útil");
        }
        else {
            System.out.println("Isso é um final de semana");
        }
    }

    public void printDayDetails () {
        isUtilDay();
        System.out.println("O nome desse dia é " + getNomeDoDia());
    }

    public boolean getDiaUtil() {
        return diaUtil;
    }

    public String getNomeDoDia() {
        return nomeDoDia;
    }

}
