package semana03;

import generico.Utils;

public class Ejemplo02 {
    public static void main(String[] args) {
        int numero;

        // Esta variable indica tal y tal cosa C++
        numero = Utils.leerEntero("Digite un número: "); // al final

        /*
         Este es un comentario tipo C
         Tiene la ventaja es el de múltiples líneas
         :D
         */

        if (numero >= 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

    }
}
