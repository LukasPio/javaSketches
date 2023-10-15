package cursoDeJava.exercicios.POO.rascunhos.fds.exception.runTime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {

        try {
    throw new ArrayIndexOutOfBoundsException();
        }
        catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException exception) {
            exception.printStackTrace();
        }
        catch (IndexOutOfBoundsException exception) {
            System.out.println("Dentro da IndexOutOfBoundsException");
        }
        catch (RuntimeException exception) {
            System.out.println("Dentro da RuntimeException");
        }

        try {
            talvezLanceException();
        }
        catch (SQLException | FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {
        throw new FileNotFoundException();
    }
}
