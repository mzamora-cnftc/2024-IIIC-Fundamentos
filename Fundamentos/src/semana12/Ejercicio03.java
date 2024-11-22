package semana12;

public class Ejercicio03 {

    public static void invertir(int[] datos) {
        int n, length, temp;
        length = datos.length;
        n = length / 2;
        for (int i = 0; i < n; i++) {
            temp = datos[i];
            datos[i] = datos[length - i - 1];
            datos[length - i - 1] = temp;
        }
    }

    public static void imprimir(int[] datos) {
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i]);
            if (i < datos.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        int[] valores = {20, 14, 36, 7};
        imprimir(valores);
        invertir(valores);
        imprimir(valores);
    }
}
