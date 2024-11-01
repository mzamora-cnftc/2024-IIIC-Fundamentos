package semana09;

import generico.Utils;

public class Ejercicio06 {

    public static boolean determinarNumeroPrimo(int numero) {
        boolean esPrimo = true;
        int n = 2;
        while (esPrimo && n <= numero -1 ) {
            esPrimo = !(numero % n == 0);
            n++;
        }
        return esPrimo;
    }


    public static void main(String[] args) {
        int limite = Utils.leerEntero("Digite el límite de la búsqueda: ");
        boolean resultado;
        String texto_resultado;
        for (int i = 2; i <= limite; i++) {
            resultado = determinarNumeroPrimo(i);
            texto_resultado = resultado?"Primo":"No primo";
            System.out.printf("%3d es %8s\n",i,texto_resultado);
        }
    }
}
