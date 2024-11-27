/***
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados. Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo 
 * del día trabajo. Calcular el valor a cancelar por la empresa para cada empleado. Presentar un reporte como el siguiente:
 * Nombre 1	10	$2.5	$25
 * Nombre 2	11	$2	$22
 * Nombre 3	9	$3	$27
 * Nombre 4	5	$4	$20
 * Nombre 5	12	$2	$24
 * @author Luis
 */
import java.util.Scanner;
public class Problema3_Empleados {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre;
        double diastrabajo, costodia, total;
        int contador = 1;
        while (contador <= 5) {
            System.out.print("Ingrese su nombre, numero de dias que a trabjo y costo del dia de trabajo: ");
            nombre = tcl.next();
            diastrabajo = tcl.nextDouble();
            costodia = tcl.nextDouble();
            total = (diastrabajo * costodia);
            System.out.printf("| %s\t| %s | %s |   %s   |\n", "Nombre", "Dias de trabajo", "Costo del día", "Total");
            System.out.printf("| %s\t|     %.2f\t  |     %.2f\t  |   %.2f\t|\n", nombre, diastrabajo, costodia, total);
            contador++;
        }
    }
}
/**
 * run:
 * Ingrese su nombre, numero de dias que a trabjo y costo del dia de trabajo: Willian 54 2,4
 * | Nombre	| Dias de trabajo | Costo del día |   Total   |
 * | Willian	|     54,00	  |     2,40	  |   129,60  |
 * Ingrese su nombre, numero de dias que a trabjo y costo del dia de trabajo: Sasha 71 3,1
 * | Nombre	| Dias de trabajo | Costo del día |   Total   |
 * | Sasha	|     71,00       |     3,10      |   220,10  |
 * Ingrese su nombre, numero de dias que a trabjo y costo del dia de trabajo: Daniela 25 2,7
 * | Nombre	| Dias de trabajo | Costo del día |   Total   |
 * | Daniela	|     25,00	  |     2,70	  |   67,50   |
 * Ingrese su nombre, numero de dias que a trabjo y costo del dia de trabajo: Valentina 66 3
 * | Nombre	| Dias de trabajo | Costo del día |   Total   |
 * | Valentina	|     66,00	  |     3,00	  |   198,00  |
 * Ingrese su nombre, numero de dias que a trabjo y costo del dia de trabajo: Roberto 87 4
 * | Nombre	| Dias de trabajo | Costo del día |   Total   |
 * | Roberto	|     87,00	  |     4,00	  |   348,00  |
 * BUILD SUCCESSFUL (total time: 1 minute 30 seconds)
 */