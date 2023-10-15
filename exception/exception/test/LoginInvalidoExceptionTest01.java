package cursoDeJava.exercicios.POO.rascunhos.fds.exception.exception.test;

import cursoDeJava.exercicios.POO.rascunhos.fds.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        }
        catch (LoginInvalidoException exception) {
            exception.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o usuário: ");
        String username = scanner.next();
        System.out.println("Digite a senha: ");
        String senha = scanner.next();
        String usernameDB = "Itachi";
        String senhaDB = "Sharingan";

        if (!usernameDB.equals(username) || !senhaDB.equals(senha)) {
            throw new LoginInvalidoException("Usuário ou senh inválidos");
        }

        System.out.println("Usuário logado com sucesso!");
    }
}
