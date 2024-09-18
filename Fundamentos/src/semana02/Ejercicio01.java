package semana02;

import generico.Utils;

public class Ejercicio01 {


    static final double PORCENTAJE_IMPUESTO = 0.13;

    public static void main(String[] args) {
        Utils.limpiarConsola();

        String nombre;
        double precio, precioFinal;

        nombre = Utils.leerString("Digite el nombre del producto: ");
        precio = Utils.leerDoble("Digite el precio: ");

        precioFinal = (precio * PORCENTAJE_IMPUESTO) + precio;

        System.out.println("Resultado: El nombre del producto es: " + nombre + " precio final es: " + precioFinal);
    }
}
