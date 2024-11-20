package semana12;

public class Pruebas {
    public static void main(String[] args) {
        int suma = 0;
        char[] caracteres = "M1Cl4v3!".toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print("Posición " + (i+1) + " " + caracteres[i]);
            if (Character.isDigit(caracteres[i])) {
                System.out.println(" es un dígito");
                suma = suma + Integer.parseInt(String.valueOf(caracteres[i]));
            } else if (Character.isLetter(caracteres[i])) {
                System.out.println(" es una letra");
            } else {
                System.out.println(" es un caracter especial");
            }
        }
        System.out.println("La suma de los dígitos es: " + suma);
    }
}
