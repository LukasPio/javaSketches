package cursoDeJava.exercicios.POO.rascunhos.fds.enumeracao.exercicioDiasDaSemana;

public class diaDaSemanaTest {
    public static void main(String[] args) {

        DiasDaSemanaClass segunda = new DiasDaSemanaClass(DiasDaSemana.SEGUNDA);

        for (DiasDaSemana umDia : DiasDaSemana.values()) {
            if (umDia.getDiaUtil() == true) {

                System.out.println(umDia.getNomeDoDia() + " é um dia útil");

            }

            else {
                System.out.println(umDia.getNomeDoDia() + " é um final de semana");
            }

        }
    }
}

