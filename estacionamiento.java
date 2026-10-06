/* Torres Sanchez Jonathan Emir
 * Instituto Tecnológico de Pachuca
 * Fundamentos de Programación
 * 04-10-2026 */

package org.example;
import java.util.Scanner;

public class estacionamiento {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            final double TARIFA_MOTO = 10.0;
            final double TARIFA_AUTO = 20.0;
            final double TARIFA_CAMIONETA = 30.0;

            final double DESC_MAS_5_HORAS = 0.10;
            final double DESC_MAS_10_HORAS = 0.20;

            System.out.print("Ingresa el tipo de vehículo (1: Motocicleta, 2: Automóvil, 3: Camioneta): ");
            int tipoVehiculo = scanner.nextInt();

            System.out.print("Ingresa el número de horas estacionado: ");
            int horas = scanner.nextInt();

            if (horas <= 0) {
                System.out.println("Error: La cantidad de horas no es válida.");
            } else {
                double tarifaHora = 0.0;
                String nombreVehiculo = "";

                if (tipoVehiculo == 1) {
                    tarifaHora = TARIFA_MOTO;
                    nombreVehiculo = "Motocicleta";
                } else if (tipoVehiculo == 2) {
                    tarifaHora = TARIFA_AUTO;
                    nombreVehiculo = "Automóvil";
                } else if (tipoVehiculo == 3) {
                    tarifaHora = TARIFA_CAMIONETA;
                    nombreVehiculo = "Camioneta";
                } else {
                    System.out.println("Error: Tipo de vehículo no válido.");
                }

                if (tarifaHora > 0.0) {
                    double subtotal = tarifaHora * horas;
                    double porcentajeDescuento = 0.0;

                    if (horas > 10) {
                        porcentajeDescuento = DESC_MAS_10_HORAS;
                    } else if (horas > 5) {
                        porcentajeDescuento = DESC_MAS_5_HORAS;
                    }

                    double montoDescuento = subtotal * porcentajeDescuento;
                    double totalPagar = subtotal - montoDescuento;

                    System.out.println("\n--- RECIBO DE ESTACIONAMIENTO ---");
                    System.out.println("Tipo de vehículo: " + nombreVehiculo);
                    System.out.println("Horas transcurridas: " + horas);
                    System.out.println("Tarifa por hora: $" + tarifaHora);
                    System.out.println("Subtotal: $" + subtotal);
                    System.out.println("Descuento aplicado: $" + montoDescuento);
                    System.out.println("Total a pagar: $" + totalPagar);
                }
            }

            scanner.close();
        }
    }

