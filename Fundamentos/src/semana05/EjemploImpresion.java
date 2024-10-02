package semana05;

/**
 * EjemploImpresion
 */
public class EjemploImpresion {

    public static void main(String[] args) {
        double pi = 3.1415167841;
        int di = 122547;
        String variableTexto = "Java";

        System.out.printf("Texto: %s, Entero: %d, Decimal: %f\n",variableTexto, 155, 1.23456);
        System.out.printf("Texto: %s, Entero: %d, Decimal: %.2f\n",variableTexto, 155, 1.23456);
        System.out.printf("Texto: %10s, Entero: %04d, Decimal: %10.2f\n",variableTexto, 155, 1.23456);
        System.out.printf("Texto: %-10s, Entero: %04d, Decimal: %10.2f\n",variableTexto, 155, 1.23456);
        System.out.printf("Monto: %10.2f CRC\n", 1500.25);

        System.out.printf("Una palabra %-10s con un número entero %10d y un decimal con 2 digitos %10.2f\n",variableTexto, di, pi);
        System.out.printf("Una palabra %-10s con un número entero %10d y un decimal con 2 digitos %10.2f\n","Python", 1997, 15471.3333333);
        System.out.printf("Una palabra %-10s con un número entero %10d y un decimal con 2 digitos %10.2f\n","C#", 1, 211.5);


    }
}