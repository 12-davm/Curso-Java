public class Variables {
    public static void main(String[] args) {

        String saludo = "Hola Mundo desde Java";
        System.out.println(saludo);
        System.out.println("saludo.toUpperCase() = " + saludo.toUpperCase());

        int numero = 13;

        boolean valor = true;
        int numero2 = 5;
        if (valor) {
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = 15;

        String nombre;
        nombre = "David";

        if (numero > 10) {
            nombre = "Javier";
        }

        System.out.println("nombre = " + nombre);
        int edad = 5;

    }
}
