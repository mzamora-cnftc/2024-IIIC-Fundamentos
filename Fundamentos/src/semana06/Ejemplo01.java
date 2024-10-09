package semana06;

import generico.Utils;

public class Ejemplo01 {
    public static void main(String[] args) {
        int n, edad, sumaEdades = 0;
        double promedio;

        n = Utils.leerEntero("¿Cuántos estudiantes son?");
    
        for (int i = 0; i < n; i++) {
            edad = Utils.leerEntero("¿Qué edad tiene usted?");
            sumaEdades = sumaEdades + edad;
            //sumaEdades += edad;            
        }

        promedio = (double) sumaEdades / n; //casting

        System.out.printf("Promedio es %.3f\n", promedio);

    }
}
