/* Torres Sanchez Jonathan Emir
 * Instituto Tecnológico de Pachuca
 * Fundamentos de Programación
 * 02-10-2026 */

package org.example;
import java.util.Scanner;
public class cajero_comision {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            final double COMISION = 10.0;
            final double LIMITE_RETIRO = 5000.0;

            System.out.print("Ingresa el saldo disponible :p : ");
            double saldoDisponible = scanner.nextDouble();

            System.out.print("Ingresa la cantidad que deseas retirar :D : ");
            double cantidadRetirar = scanner.nextDouble();

            if (cantidadRetirar <= 0) {
                System.out.println("Error: La cantidad a retirar debe ser mayor a 0.");
            } else if (cantidadRetirar > LIMITE_RETIRO) {
                System.out.println("Error: La cantidad a retirar supera el límite permitido ($" + LIMITE_RETIRO + ").");
            } else if ((cantidadRetirar + COMISION) > saldoDisponible) {
                System.out.println("Error: Saldo insuficiente para cubrir el retiro y la comisión de $" + COMISION);
            } else {
                // Variables declaradas dentro del bloque de autorización (demostrando alcance/scope)
                double comisionAplicada = COMISION;
                double montoTotalDeducido = cantidadRetirar + comisionAplicada;
                double saldoFinal = saldoDisponible - montoTotalDeducido;

                System.out.println("\n--- RETIRO AUTORIZADO YIYI ---");
                System.out.println("Monto retirado: $" + cantidadRetirar);
                System.out.println("Comisión bancaria: $" + comisionAplicada);
                System.out.println("Saldo final restante: $" + saldoFinal);
            }

            scanner.close();
        }
    }

