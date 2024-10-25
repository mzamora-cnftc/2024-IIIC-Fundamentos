package semana07;

import generico.Utils;

class Universidad {

    final static int TOTAL_PISOS = 2, TOTAL_AULAS = 3;

    public static void main(String[] args) {
        int totalPapasSolicitadas = 0, totalPapasAdquiridas = 0, totalPapasVendidas = 0, montoTotalVentas = 0;
        int pisoActual = 1, aulaActual = 1;
        int papasParaComprar;
        boolean hayAgentesSeguridad = false, quierenPapas = false;

        Utils.limpiarConsola();

        totalPapasSolicitadas = Utils.leerEntero("Digite la cantidad de papas a comprar al proveedor: ");
        totalPapasAdquiridas =  (totalPapasSolicitadas / 10) * 2 + totalPapasSolicitadas;
        while (TOTAL_PISOS >= pisoActual && TOTAL_AULAS >= aulaActual && !hayAgentesSeguridad && totalPapasAdquiridas > totalPapasVendidas) {

            hayAgentesSeguridad = Utils.leerBoolean("Se ven moros a la vista");
            if (!hayAgentesSeguridad) {
                System.out.println("Faltan : " + (TOTAL_PISOS - pisoActual + 1) + " y Aulas: " + (TOTAL_AULAS - aulaActual + 1));
                System.out.println("Entro al aula");
                do {
                    quierenPapas = Utils.leerBoolean("Están interesadas en adquirir ricos snack de papas");
                    if (quierenPapas) {
                        papasParaComprar = Utils.leerRangosEnteros("¿Cuántas papas gustan, les ofrezco 2 x 1500 o 1 x 1000?", 1, 2);

                        if (totalPapasAdquiridas - totalPapasVendidas >= papasParaComprar) {
                            if (papasParaComprar == 1) {
                                totalPapasVendidas = totalPapasVendidas + 1;
                                montoTotalVentas = montoTotalVentas + 1000;
                            } else {
                                totalPapasVendidas = totalPapasVendidas + 2;
                                montoTotalVentas = montoTotalVentas + 1500;
                            }
                        } else {
                            System.out.println("Perdón pero no hay papas sufientes, pruebe otra cantidad menor");
                        }
                    } else {
                        System.out.println("Muchas gracias");
                    }
                } while (totalPapasAdquiridas - totalPapasVendidas > 0);
                aulaActual = aulaActual + 1;
                if (TOTAL_AULAS < aulaActual) {
                    aulaActual = 1;
                    pisoActual = pisoActual + 1;
                }
            } else {
                System.out.println("Ciao, Ciao, nos agarraron!");
            }
        }
        System.out.println("Reporte");
        System.out.println("Utilidad: " + (montoTotalVentas - totalPapasSolicitadas * 500));
        System.out.println("Papas vendidas: " + totalPapasVendidas);
        System.out.println("Papas restantes: " + (totalPapasAdquiridas - totalPapasVendidas));
    }
}
