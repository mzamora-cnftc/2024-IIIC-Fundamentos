package semana13;

import generico.Utils;

public class Lotto {

    public static int contarAciertos(int[] usuario, int[] aleatorios) {
        int contador = 0;
        for (int i = 0; i < usuario.length; i++) {
            if (buscarValor(aleatorios, usuario[i])) {
                contador++;
            }
        }
        return contador;
    }
    
    public static void imprimir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    public static void iniciarlizar(int[] array, int valorInicial) {
        for (int i = 0; i < array.length; i++) {
            array[i] = valorInicial;
        }
    }

    public static void cargarNumerosUsuario(int[] array, int min, int max) {
        int valor;
        for (int i = 0; i < array.length; i++) {
            valor = Utils.leerRangosEnteros("Digite el número", min, max);
            array[i] = valor;
        }
    }

    public static void cargarNumerosAleatorios(int[] array, int min, int max) {
        int valor;
        for (int i = 0; i < array.length; i++) {
           valor = Utils.generarNumerosEntre(min, max);
           while (!buscarValor(array, valor)) {
                array[i] = valor;
                valor = Utils.generarNumerosEntre(min, max);
           }
        }
    }


    public static boolean buscarValor(int[] array, int valor) {
        boolean encontrado = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }

    public static void main(String[] args) {
        int[] numerosAleatorios = new int[5];
        int[] numerosUsuario = new int[5];
        cargarNumerosUsuario(numerosUsuario, 0, 40);
        iniciarlizar(numerosAleatorios, -1);
        cargarNumerosAleatorios(numerosAleatorios, 0, 40);
        imprimir(numerosAleatorios);
        imprimir(numerosUsuario);
        System.out.println("Cantidad de aciertos: " + contarAciertos(numerosUsuario, numerosAleatorios));
    }
}
