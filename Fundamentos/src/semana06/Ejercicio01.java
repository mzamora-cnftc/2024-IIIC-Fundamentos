package semana06;

import generico.Utils;

public class Ejercicio01 {
    public static void main(String[] args) {
        int n;
        n = Utils.leerEntero("Digite el valor de N: ");

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
