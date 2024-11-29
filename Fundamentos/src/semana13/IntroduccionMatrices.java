package semana13;

import generico.Utils;

public class IntroduccionMatrices {


    public static void imprimir(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //RC Row Column
        // Jagged

        int[][] matriz = new int[4][5];
        // System.out.println("matriz.length = " + matriz.length);
        // imprimir(matriz);
        int opcion = 0;
        String[] opciones = {"Poner valor","Imprimir","Salir"};
        do {
            opcion = Utils.seleccionarElementoTexto("MENU", opciones);
            switch (opcion) {
                case 1:
                    int fila = Utils.leerEntero("Digite la fila");
                    int columna = Utils.leerEntero("Digite la columna");
                    int valor = Utils.leerEntero("Digite el valor");
                    matriz[fila][columna] = valor;
                    break;
                case 2:
                    imprimir(matriz);
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 3);

    }
}
