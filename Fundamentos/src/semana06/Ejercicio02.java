package semana06;

import generico.Utils;

public class Ejercicio02 {
    public static void main(String[] args) {
        int n;
        Utils.limpiarConsola();

        n = Utils.leerEntero("Digite el valor de N: ");

        for (int i = n; i > 0; i--) {
                System.out.println(i);
        }
    }
}
