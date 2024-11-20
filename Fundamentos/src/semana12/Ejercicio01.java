package semana12;

public class Ejercicio01 {

    public static boolean compararArreglos(int[] a, int[] b) {
        boolean iguales = true;
        int i = 0;

        if (a.length == b.length) {
            // sospechamos que pueden iguales
            while (iguales && i < a.length) {
                if (a[i] != b[i]) {
                    iguales = false;
                }
                i++;

            }
        } else {
            iguales = false;
        }

        return iguales;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 1, 2, 3, 4, 5 };
        System.out.println(compararArreglos(a, b));
    }
}
