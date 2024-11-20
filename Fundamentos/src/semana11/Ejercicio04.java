package semana11;

import generico.Utils;

public class Ejercicio04 {

    public static void leerDatos(String[] nombres, double[] saldos) {
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = Utils.leerString("Ingrese el nombre de la cuenta " + (i + 1) + ": ");
            saldos[i] = Utils.leerDoble("Ingrese el saldo de la cuenta " + (i + 1) + ": ");
        }
    }

    public static void imprimirDatos(String[] nombres, double[] saldos) {
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Cuenta %2d: %s - Saldo: %.2f\n", i + 1, nombres[i], saldos[i]);
        }
    }

    public static void main(String[] args) {
        double[] saldos = null;
        String[] nombres = null;
        int n = 0;

        n = Utils.leerEntero("Ingrese la cantidad de cuentas: ");

        saldos = new double[n];
        nombres = new String[n];

        leerDatos(nombres, saldos);
        imprimirDatos(nombres, saldos);
    }
}
