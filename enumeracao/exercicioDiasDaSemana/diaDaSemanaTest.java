package cursoDeJava.exercicios.POO.rascunhos.fds.enumeracao.exercicioDiasDaSemana;

public class diaDaSemanaTest {
    public static void main(String[] args) {

        DiasDaSemanaClass segunda = new DiasDaSemanaClass(DiasDaSemana.SEGUNDA);

        segunda.getDiasDaSemana().printDayDetails();
        segunda.getDiasDaSemana().isUtilDay();

        System.out.println("========================================");

        for (DiasDaSemana dia : DiasDaSemana.values()) {

            dia.printDayDetails();
            System.out.println("==========");

        }
    }
}
