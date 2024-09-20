package semana03;

import generico.Utils;

public class Ejercicio04 {
    public static void main(String[] args) {
        String mensaje, nacionalidad;

        nacionalidad = Utils.leerString("Digite su nacionalidad: ");

        //if (nacionalidad.equalsIgnoreCase("COSTARRICENSE")) { DE ESTA FORMA NO
        if ("COSTARRICENSE".equalsIgnoreCase(nacionalidad)) {
            mensaje = "Bienvenido a casa";
        } else {
            mensaje = "Lo invitamos a que regrese a tu dulce hogar";
        }

        System.out.println(mensaje);
    }
}
