package semana03;

import generico.Utils;

public class Ejemplo02 {
    public static void main(String[] args) {
        int numero;

        numero = Utils.leerEntero("Digite un número: ");

        if (numero >= 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }


    }
}
