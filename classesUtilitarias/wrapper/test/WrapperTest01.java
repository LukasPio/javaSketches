package cursoDeJava.exercicios.POO.rascunhos.fds.classesUtilitarias.wrapper.test;

import java.util.List;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'L';
        boolean booleanP = true;

        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1; // autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'L';
        Boolean booleanW = true;

        int i = intW; // unboxing
        int intW2 = Integer.parseInt("1");
        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('3'));
        System.out.println(Character.isLetterOrDigit('#'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toLowerCase('B'));
        System.out.println(Character.toUpperCase('b'));

    }
}
