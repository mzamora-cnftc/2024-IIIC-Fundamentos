package semana09;

import generico.Utils;

public class Ejercicio04 {

    public static int obtenerMayor(int x, int y) {
        int mayor = 0;

        if (x > y) {
            mayor = x;
        } else {
            mayor = y;
        }

        return mayor;
    }

    public static int devolverMayoresTres(int a, int b, int c) {
        int mayor;

        mayor = obtenerMayor(a, b);
        mayor = obtenerMayor(mayor, c);

        return mayor;
    }

    public static void main(String[] args) {
        int a, b, c;
        a = Utils.leerEntero("A: ");
        b = Utils.leerEntero("B: ");
        c = Utils.leerEntero("C: ");

        System.out.println(devolverMayoresTres(a, b, c));
    }
}
