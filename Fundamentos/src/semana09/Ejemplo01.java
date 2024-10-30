package semana09;

import generico.Utils;

public class Ejemplo01 {

    public static double calcularAreaTriangulo(double a, double b, double c) {
        double area, perimetro, semiperimetro = 0;
        perimetro = a + b + c;
        semiperimetro = perimetro / 2;
        area = Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));
        return area;
    }

    public static double calcularAreaTresTriangulos(double a, double b, double c, double d, double e, double f, double g) {
        double area = 0;
        area += calcularAreaTriangulo(a, b, e);
        area += calcularAreaTriangulo(b, c, f);
        area += calcularAreaTriangulo(c, d, g);
        return area;
    }


    public static void main(String[] args) {
        double a, b, c, d, e, f, g, area;
        a = Utils.leerDoble("Digite el lado A: ");
        b = Utils.leerDoble("Digite el lado B: ");
        c = Utils.leerDoble("Digite el lado C: ");
        d = Utils.leerDoble("Digite el lado D: ");
        e = Utils.leerDoble("Digite el lado E: ");
        f = Utils.leerDoble("Digite el lado F: ");
        g = Utils.leerDoble("Digite el lado G: ");
        area = calcularAreaTresTriangulos(a, b, c, d, e, f, g);
        System.out.println("El área es: " + area);
    }



}
