package semana13;

import generico.Utils;

public class Avolbel {

    public static void registrarVentas(int[][] ventas, String[] vendedores, String[] zonas) {
        Utils.limpiarConsola();
        System.out.println("REGISTRAR VENTAS");
        int zona = Utils.seleccionarElementoTexto("Seleccione zona", zonas);
        int vendedor = Utils.seleccionarElementoTexto("Seleccione vendedor", vendedores);
        int monto = Utils.leerEntero("Digite el monto de la venta");
        ventas[vendedor-1][zona-1] = ventas[vendedor-1][zona-1] + monto;
    }


    public static void imprimirVentas(int[][] ventas, String[] vendedores, String[] zonas) {
        Utils.limpiarConsola();
        System.out.println("IMPRIMIR VENTAS");
        System.out.printf("%21s", "");
        for (int i = 0; i < zonas.length; i++) {
            System.out.printf("%10s ", zonas[i]==null ? "-n/a-" : zonas[i]);
        }
        System.out.println();

        for (int i = 0; i < ventas.length; i++) {
            System.out.printf("%20s ", vendedores[i]==null ? "-n/a-" : vendedores[i]);
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.printf("%10d ", ventas[i][j]);
            }
            System.out.println();
        }

    }

    public static void registrar(String[] arreglo, String singular, String plural) {
        Utils.limpiarConsola();
        System.out.println("REGISTRAR " + plural.toUpperCase());
        String etiqueta;
        for (int i = 0; i < arreglo.length; i++) {
            etiqueta = arreglo[i] == null ? "[sin asignar]" : arreglo[i];
            System.out.printf("%3d %40s\n", i + 1, etiqueta);
        }
        int opcion = Utils.leerRangosEnteros("Selecione " + singular+": ", 1, arreglo.length);
        arreglo[opcion - 1] = Utils.leerString("Digite texto: ");
    }

    public static void main(String[] args) {
        String[] opciones = { "Registrar vendedores", "Registrar zonas", "Registrar ventas", "Imprimir ventas",
                "Generar Reporte", "Salir" };
        String[] vendedores = null;
        String[] zonas = null;
        int[][] ventas = null;

        Utils.limpiarConsola();
        int cantidad = Utils.leerEntero("Digite la cantidad de vendedores: ");
        vendedores = new String[cantidad];
        cantidad = Utils.leerEntero("Digite la cantidad de zonas: ");
        zonas = new String[cantidad];
        ventas = new int[vendedores.length][zonas.length];

        int opcion = 0;
        do {
            opcion = Utils.seleccionarElementoTexto("MENU", opciones);
            switch (opcion) {
                case 1:
                    registrar(vendedores,"vendedores","vendedor");
                    break;
                case 2:
                    registrar(zonas,"zonas","zona");
                    break;
                case 3:
                    registrarVentas(ventas, vendedores, zonas);
                    break;
                case 4:
                    imprimirVentas(ventas, vendedores, zonas);
                    break;
                case 5:

                    break;
                case 6:

                    break;
                default:
                    break;
            }
        } while (opcion != 6);
    }
}
