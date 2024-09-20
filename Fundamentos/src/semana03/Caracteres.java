package semana03;

public class Caracteres {
    public static void main(String[] args) {
        String nombre = "          mauricio           ";
        nombre = nombre.toUpperCase();
        System.out.println(nombre);
        nombre = nombre.trim(); // quitar los espacios en blanco en los extremos
        System.out.println(nombre);
        char primeraLetra = nombre.charAt(0);
        System.out.println(primeraLetra);
        if (primeraLetra == 'M') {
            System.out.println("La letra es M mayúscula");
        } else {
            System.out.println("Es otra cosa");
        }
    }
}
