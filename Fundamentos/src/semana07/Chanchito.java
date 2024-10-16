package semana07;

import generico.Utils;

public class Chanchito {
    public static void main(String[] args) {
        int opcion, saldo = 0, monto;
        String reporte = "REPORTE DE MOVIMIENTOS";

        do {
            Utils.limpiarConsola();

            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Ahorrar dinero");
            System.out.println("3 - Retirar dinero");
            System.out.println("4 - Ver estado de cuenta");
            System.out.println("0 - Salir");

            opcion = Utils.leerRangosEnteros("Digite la opción del menú: ", 0, 4);

            switch (opcion) {
                case 1:
                    System.out.println("SALDO");
                    System.out.println(saldo);
                    Utils.leerString("Presine <ENTER> para continuar ....");
                    break;
                case 2:
                    System.out.println("AHORRAR");
                    monto = Utils.leerEntero("Digite el monto para ahorrar: ");
                    saldo = saldo + monto;
                    reporte = reporte + "\n" + String.format("%-10s %6d", "Ahorro",monto);
                    break;
                case 3:
                    System.out.println("RETIRAR");
                    do {
                        monto = Utils.leerEntero("Digite el monto para retirar: ");
                    } while (!(monto <= saldo));
                    saldo = saldo - monto;
                    reporte = reporte + "\n" + String.format("%-16s %6d", "Retiro",monto);
                    System.out.println("Su saldo es: " + saldo);
                    Utils.leerString("Presine <ENTER> para continuar ....");
                    break;
                case 4:
                    Utils.limpiarConsola();
                    System.out.println(reporte);
                    Utils.leerString("Presine <ENTER> para continuar ....");
                    break;
            }

        } while (opcion != 0);

        System.out.println("Hasta vista, baby!");

    }
}
