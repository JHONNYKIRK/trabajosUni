/* Torres Sanchez Jonathan Emir
 * Instituto Tecnológico de Pachuca
 * Fundamentos de Programación
 * 02-10-2026 */
package org.example;
import java.util.Scanner;

public class sistema_calificaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double MINIMO_APROBATORIO = 7;
        final double MINIMO_UNIDAD = 6;

        System.out.print("Ingresa la calificación de la Unidad 1: ");
        double c1 = scanner.nextDouble();

        System.out.print("Ingresa la calificación de la Unidad 2: ");
        double c2 = scanner.nextDouble();

        System.out.print("Ingresa la calificación de la Unidad 3: ");
        double c3 = scanner.nextDouble();

        double promedio = (c1 + c2 + c3) / 3.0;

        System.out.println("\n--- RESUMEN DE TUS CALIFICACIONES ---");
        System.out.println("Unidad 1: " + c1);
        System.out.println("Unidad 2: " + c2);
        System.out.println("Unidad 3: " + c3);
        System.out.println("Promedio calculado: " + promedio);

        // Validación estricta
        if (promedio >= MINIMO_APROBATORIO) {
            System.out.println("Resultado final: APROBADO");
        } else {
            System.out.println("Resultado final: REPROBADO");
        }

        if (c1 < MINIMO_UNIDAD) {
            System.out.println("Atención: Debe presentar recuperación de la Unidad 1.");
        }
        if (c2 < MINIMO_UNIDAD) {
            System.out.println("Atención: Debe presentar recuperación de la Unidad 2.");
        }
        if (c3 < MINIMO_UNIDAD) {
            System.out.println("Atención: Debe presentar recuperación de la Unidad 3.");
        }

        scanner.close();
    }
}