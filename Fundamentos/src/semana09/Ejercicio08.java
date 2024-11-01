package semana09;

public class Ejercicio08 {

    public static boolean determinarPalindromo(String palabra) {
        boolean esPalindromo = true;

        int n, i, combinaciones, ultimo;

        n = palabra.length();
        combinaciones = n / 2;
        ultimo = n - 1;
        i = 0;

        while (esPalindromo && i < combinaciones) {
            esPalindromo = palabra.charAt(0+i) == palabra.charAt(ultimo-i);
            i++;
        }

        return esPalindromo;
    }

    public static void main(String[] args) {
        System.out.println(determinarPalindromo("saas"));
        System.out.println(determinarPalindromo("arenera"));
        System.out.println(determinarPalindromo("mauricio"));
    }
}