package semana07;

import generico.Utils;

public class Ejercicio01 {
    public static void main(String[] args) {
        int numero = 0;
        
        Utils.limpiarConsola();

        do {
            numero = Utils.leerEntero("Digite un número para evaluar: ");

        } while (numero % 2 == 0);
        System.out.println("¡muchas gracias!");
    }
}
