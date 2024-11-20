package semana12;

public class Ejercicio02 {

    public static boolean esOracionPalindrome(String palabra) {
        boolean esPalindrome = true;
        char[] caracteres = null;
        int ultimaPosicion = 0;
        int comparaciones = 0;
        // limpiar los espacio en blanco
        palabra = palabra.replaceAll(" ", "");
        //convertimos todo a minúsculas
        palabra = palabra.toLowerCase();
        caracteres = palabra.toCharArray();
        // obtenemos la última posición
        ultimaPosicion = caracteres.length - 1;
        comparaciones = caracteres.length / 2;
        //incluimos inclusive la última comparación
        for (int i = 0; i <= comparaciones; i++) {
            if(caracteres[i] != caracteres[ultimaPosicion - i]){
                esPalindrome = false;
            }
        }


        return esPalindrome;
    }

    public static void main(String[] args) {
        System.out.println(esOracionPalindrome("AnitA lava la tIna"));
    }
}
