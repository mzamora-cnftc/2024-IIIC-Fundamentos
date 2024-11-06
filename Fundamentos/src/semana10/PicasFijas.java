package semana10;

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
        int picas=0;

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
        int picas=0;

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
        int numero =  0;
        do {
            numero = (int) (Math.random() * 9000) + 1000;
        } while (!validarNumero(numero));
        return numero;
    }

    public static void main(String[] args) {
        
        for (int i = 0; i < 100; i++) {
            System.out.println(generarNumeroAleatorio());
        }
        }
}
