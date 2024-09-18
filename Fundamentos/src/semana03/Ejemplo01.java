package semana03;

import generico.Utils;

public class Ejemplo01 {
    public static void main(String[] args) {
        int numero;
        numero = Utils.leerEntero("Digite el número: ");

        if (numero < 0) {
            numero = numero * -1;
        }

        System.out.println("Número: " + numero);
    }
}
