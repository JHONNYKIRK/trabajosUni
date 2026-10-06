/* Torres Sanchez Jonathan Emir
 * Instituto Tecnológico de Pachuca
 * Fundamentos de Programación
 * 02-10-2026 */
package org.example;
import java.util.Scanner;

public class cajero_automatico {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            final double LIMITE_RETIRO = 5000.0;

            System.out.print("Ingresa tu saldo disponible :p : ");
            double saldoDisponible = scanner.nextDouble();

            System.out.print("Ingrese la cantidad a retirar :D : ");
            double cantidadRetirar = scanner.nextDouble();

            if (cantidadRetirar <= 0) {
                System.out.println("Error: La cantidad a retirar debe ser mayor a 0.");
            } else if (cantidadRetirar > LIMITE_RETIRO) {
                System.out.println("Error: La cantidad a retirar supera el límite permitido ($" + LIMITE_RETIRO + ").");
            } else if (cantidadRetirar > saldoDisponible) {
                System.out.println("Error: Saldo insuficiente para realizar la operación ff papa.");
            } else {
                double nuevoSaldo = saldoDisponible - cantidadRetirar;
                System.out.println("\n--- Retiro ---");
                System.out.println("Efectivo entregado: $" + cantidadRetirar);
                System.out.println("Saldo restante: $" + nuevoSaldo);

                if (nuevoSaldo < 500) {
                    System.out.println("Advertencia :0 !!! Su saldo restante es menor a $500 pesos.");
                }
            }

            scanner.close();
        }
    }


