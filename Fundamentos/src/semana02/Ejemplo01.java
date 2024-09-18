package semana02;

public class Ejemplo01 {


    static final double IMPUESTO_VALOR_AGREGADO = 0.1;


    public static void main(String[] args) {
        int año = 2024;
        float medio = 0.5f;
        double mitad = 0.5;
        char primero = 'a';
        boolean estaSoltero = true;
        String nombre = "Mauricio";
        double montoSinImpuesto, montoImpuesto, montoFinal;

        montoSinImpuesto = 500;
        System.out.println(montoSinImpuesto);
        montoImpuesto = montoSinImpuesto * IMPUESTO_VALOR_AGREGADO;
        System.out.println(montoImpuesto);
        montoFinal = montoSinImpuesto + montoImpuesto;
        System.out.println(montoFinal);


        // La palabra de domingo es caret

        System.out.println(año);
        System.out.println(medio);
        System.out.println(mitad);
        System.out.println(primero);
        System.out.println(estaSoltero);
        System.out.println(nombre);
    }
    
}
