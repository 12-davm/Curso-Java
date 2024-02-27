public class Primitivos {
    public static void main(String[] args) {

        //Estos son los 4 tipos para almacenar números enteros que ocupen desde 1 byte hasta 8.

        byte numeroByte = 127; //byte puede tener valor desde -128 a 127
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("El tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("El tipo byte corresponde en bits a " + Byte.SIZE);
        System.out.println("El valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("El valor mínimo de un byte: " + Byte.MIN_VALUE);

        short numeroShort = 32767; //short puede tener valor desde -32768 a 32767
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("El tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("El tipo short corresponde en bits a " + Short.SIZE);
        System.out.println("El valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("El valor mínimo de un short: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("El tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("El tipo int corresponde en bits a " + Integer.SIZE);
        System.out.println("El valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("El valor mínimo de un int: " + Integer.MIN_VALUE);

        long numeroLong = 2147483648L; //Hay que poner una "L" al final del número para convertir la literal en el long.
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("El tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("El tipo long corresponde en bits a " + Long.SIZE);
        System.out.println("El valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("El valor mínimo de un long: " + Long.MIN_VALUE);
    }
}
 