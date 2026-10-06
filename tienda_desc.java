/* Torres Sanchez Jonathan Emir
 * Instituto Tecnológico de Pachuca
 * Fundamentos de Programación
 * 02-10-2026 */

package org.example;
import java.util.Scanner;
public class tienda_desc {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            final double DESC_FRECUENTE = 0.10;
            final double DESC_VIP = 0.20;
            final double DESC_ADICIONAL = 0.05;

            System.out.print("Ingresa el nombre del cliente :P ");
            String nombre = scanner.nextLine();

            System.out.print("Ingresa el monto de la compra: ");
            double monto = scanner.nextDouble();

            System.out.print("El cliente es... (1: Normal, 2: Frecuente, 3: VIP): ");
            int tipoCliente = scanner.nextInt();

            double porcentajeDescuentoTipo = 0.0;

            if (tipoCliente == 1) {
                porcentajeDescuentoTipo = 0.0;
            } else if (tipoCliente == 2) {
                porcentajeDescuentoTipo = DESC_FRECUENTE;
            } else if (tipoCliente == 3) {
                porcentajeDescuentoTipo = DESC_VIP;
            } else {
                System.out.println("Tipo de cliente no válido. Se considerará como Normal.");
            }

            double porcentajeDescuentoExtra = 0.0;
            if (monto > 2000) {
                porcentajeDescuentoExtra = DESC_ADICIONAL;
            }

            double descuentoTipo = monto * porcentajeDescuentoTipo;
            double descuentoExtra = monto * porcentajeDescuentoExtra;
            double totalDescuentos = descuentoTipo + descuentoExtra;
            double totalPagar = monto - totalDescuentos;

            System.out.println("\n--- RESUMEN DE COMPRA YIYI ---");
            System.out.println("Cliente: " + nombre);
            System.out.println("Monto original: $" + monto);
            System.out.println("Descuento por tipo de cliente: $" + descuentoTipo);
            System.out.println("Descuento adicional (> $2000): $" + descuentoExtra);
            System.out.println("Total de descuentos: $" + totalDescuentos);
            System.out.println("Total a pagar: $" + totalPagar);

            scanner.close();
        }
    }

