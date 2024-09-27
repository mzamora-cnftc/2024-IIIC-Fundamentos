package semana04;

import generico.Utils;

public class Ejercicio01 {
    public static void main(String[] args) {
        int diaActual, diaProx, mesActual, mesProx, annoActual, annoProx, mesLimite;
        Utils.limpiarConsola();
        diaActual = Utils.leerEntero("Dia: ");
        mesActual = Utils.leerEntero("Mes: ");
        annoActual = Utils.leerEntero("Año: ");

        if (mesActual >= 1 && mesActual <= 12) {
            // mes válido
            if (mesActual == 1 || mesActual == 3 || mesActual == 5 || mesActual == 7 || mesActual == 8
                    || mesActual == 10 || mesActual == 12) {
                mesLimite = 31;
            } else {
                if (mesActual == 2) {
                    if (((annoActual % 4 == 0) && !(annoActual % 100 == 0))
                            || ((annoActual % 4 == 0) && (annoActual % 400 == 0))) {
                        mesLimite = 29;
                    } else {
                        mesLimite = 28;
                    }
                } else {
                    mesLimite = 30;
                }
            }
            // Ya sabemos el límite del mes
            if (diaActual >= 1 && diaActual <= mesLimite) {
                // día y mes válidos
                if (diaActual == mesLimite) {
                    diaProx = 1;
                    if (mesActual == 12) {
                        mesProx = 1;
                        annoProx = annoActual + 1;
                    } else {
                        mesProx = mesActual + 1;
                        annoProx = annoActual;
                    }
                } else {
                    diaProx = diaActual + 1;
                    mesProx = mesActual;
                    annoProx = annoActual;
                }
                System.out.println("Fecha: " + diaProx + "/" + mesProx + "/" + annoProx);
            } else {
                System.out.println("Día inválido");
            }
        } else {
            // mes inválido
            System.out.println("Mes no válido");
        }

    }
}
