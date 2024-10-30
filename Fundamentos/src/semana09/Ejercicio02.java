package semana09;

import generico.Utils;

public class Ejercicio02 {

    public static double convertirMetrosEnPulgadas(double metros) {
        double pulgadas = 0;
        pulgadas = (metros * 100) / 2.54;
        return pulgadas;
    }

    public static double convertirMetrosEnPies(double metros) {
        return convertirMetrosEnPulgadas(metros) / 12;
    }

    public static void main(String[] args) {
        double pulgadas, pies;
        double metros = Utils.leerDoble("Digite su estatura en metros: ");
        pulgadas = convertirMetrosEnPulgadas(metros);
        pies = convertirMetrosEnPies(metros);

        System.out.println(String.format("Su estatura en pies es %.2f y en pulgadas es %.2f\n", pies, pulgadas));
    }
}
