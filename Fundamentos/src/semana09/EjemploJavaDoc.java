package semana09;

/**
 * Esta clase bla bla bla
 */
public class EjemploJavaDoc {


    /**
     * Esta es una función que permite la suma de dos números enteros
     * La estoy para demostrarles como funciona el JavaDoc a nivel de
     * documentación interna.
     * 
     * @param x Este es un parámetro de tipo entero, el primer sumando
     * @param y Este es un parámetro de tipo entero, el segundo sumando
     * @return Devuelve la suma de los dos números enteros
     */
    public static int sumar(int x, int y) {
        int total = 0; // esta variable es temporal para almacenar el resultado de la suma
        /*
        Este es un comentario de tipo multilínea
        Como ven puedo escribir
        en más de una línea.         
        */
        return x + y;
    }

    public static void main(String[] args) {
        String x = "";
        System.out.println(sumar(7, 9));
    }
}
