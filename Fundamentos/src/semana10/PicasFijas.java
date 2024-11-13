package semana10;

import generico.Utils;

public class PicasFijas {

    public static int evaluarFija(int x, int y) {
        if (x == y) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int evaluarPica(int x, int a, int b, int c) {
        if (x == a || x == b || x == c) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int contarFijas(int numeroUsuario, int numeroSecreto) {
        int picas = 0;

        if (validarNumero(numeroSecreto) && validarNumero(numeroUsuario)) {
            int m1, c1, d1, u1;
            int m2, c2, d2, u2;

            m1 = numeroUsuario / 1000;
            c1 = (numeroUsuario % 1000) / 100;
            d1 = (numeroUsuario % 100) / 10;
            u1 = numeroUsuario % 10;

            m2 = numeroSecreto / 1000;
            c2 = (numeroSecreto % 1000) / 100;
            d2 = (numeroSecreto % 100) / 10;
            u2 = numeroSecreto % 10;

            picas += evaluarFija(m1, m2);
            picas += evaluarFija(c1, c2);
            picas += evaluarFija(d1, d2);
            picas += evaluarFija(u1, u2);
        }

        return picas;
    }

    public static int contarPicas(int numeroUsuario, int numeroSecreto) {
        int picas = 0;

        if (validarNumero(numeroSecreto) && validarNumero(numeroUsuario)) {
            int m1, c1, d1, u1;
            int m2, c2, d2, u2;

            m1 = numeroUsuario / 1000;
            c1 = (numeroUsuario % 1000) / 100;
            d1 = (numeroUsuario % 100) / 10;
            u1 = numeroUsuario % 10;

            m2 = numeroSecreto / 1000;
            c2 = (numeroSecreto % 1000) / 100;
            d2 = (numeroSecreto % 100) / 10;
            u2 = numeroSecreto % 10;

            picas += evaluarPica(m1, c2, d2, u2);
            picas += evaluarPica(c1, m2, d2, u2);
            picas += evaluarPica(d1, m2, c2, u2);
            picas += evaluarPica(u1, m2, c2, d2);
        }

        return picas;
    }

    public static boolean validarNumero(int numero) {
        int m, c, d, u;
        if (numero >= 1000 && numero <= 9999) {
            m = numero / 1000;
            c = (numero % 1000) / 100;
            d = (numero % 100) / 10;
            u = numero % 10;
            return m != c && m != d && m != u && c != d && c != u && d != u;

        } else {
            return false;
        }
    }

    public static int generarNumeroAleatorio() {
        int numero = 0;
        do {
            numero = (int) (Math.random() * 9000) + 1000;
        } while (!validarNumero(numero));
        return numero;
    }

    public static void imprimirLogo() {
        Utils.limpiarConsola();
        System.out.println();
        System.out.println("        _____ _                         ______ _ _           ");
        System.out.println("        |  __ (_)                       |  ____(_|_)          ");
        System.out.println("        | |__) |  ___ __ _ ___   _   _  | |__   _ _  __ _ ___ ");
        System.out.println("        |  ___/ |/ __/ _` / __| | | | | |  __| | | |/ _` / __|");
        System.out.println("        | |   | | (_| (_| \\__ \\ | |_| | | |    | | | (_| \\__ \\");
        System.out.println("        |_|   |_|\\___\\__,_|___/  \\__, | |_|    |_| |\\__,_|___/");
        System.out.println("                                  __/ |         _/ |          ");
        System.out.println("                                 |___/         |__/           ");
        Utils.leerString("Digite <enter> para continuar");
        Utils.limpiarConsola();
    }

    public static void main(String[] args) {
        int intentos = 5, intento = 0, numero, numeroSecreto;
        boolean haAcertado = false;
        numeroSecreto = generarNumeroAleatorio();
        imprimirLogo();
        while (!haAcertado && intento < intentos) {
            intento++;
            System.out.println("Intento " + intento + " de " + intentos);
            numero = Utils.leerEntero("Digite un número de 4 cifras diferentes: ");
            if (validarNumero(numero)) {
                if (numero == numeroSecreto) {
                    haAcertado = true;
                    System.out.println("¡Felicidades! Has acertado el número secreto");
                } else {
                    int picas = contarPicas(numero, numeroSecreto);
                    int fijas = contarFijas(numero, numeroSecreto);
                    System.out.println("Picas: " + picas);
                    System.out.println("Fijas: " + fijas);
                }
            } else {
                System.out.println("El número no es válido");
            }
        }

        if (intento == intentos) {
            System.out.println("Lo siento, no has acertado el número secreto");
            System.out.println("El número secreto era: " + numeroSecreto);
        }

    }
}
