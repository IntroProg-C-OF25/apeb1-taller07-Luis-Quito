/***
 * Una empresa de comercialización de computadoras realiza el proceso de venta haciendo un descuento por tipo de cliente: Si es cliente tipo 1 
 * hay un descuento del 10% Si es cliente tipo 2 hay un descuento del 20% En caso que sea otro tipo de cliente, no hay descuento. Generar un 
 * proceso que permita ingresar 7 ventas: por cada venta preguntar los siguiente datos:
 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente 
 * Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 * @author Luis
 */
import java.util.Scanner;
public class Problema6_EmpresaComputadoras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int contadorVentas = 0, tipoCl;
        String reporte = "Reporte de Ventas:\n", nombre;
        double costoComputadora, totalVentas = 0, descuento = 0, precioFinal;
        System.out.println("Ingrese los datos de las ventas (7 ventas):");
        while (contadorVentas < 7) {
            System.out.println("\nVenta: " + (contadorVentas + 1));
            System.out.print("Ingrese el nombre del cliente: ");
            nombre = tcl.nextLine();
            tcl.nextLine();
            System.out.print("Ingrese el costo de la computadora: ");
            costoComputadora = tcl.nextDouble();
            System.out.print("Ingrese el tipo de cliente (1, 2, otro (3)): ");
            tipoCl = tcl.nextInt();
            if (tipoCl == 1) {
                descuento = costoComputadora * 0.10;
            } else if (tipoCl == 2) {
                descuento = costoComputadora * 0.20;
            } else if (tipoCl == 3){
                descuento = 0.0;
            }
            precioFinal = costoComputadora - descuento;
            totalVentas += precioFinal;
            reporte += String.format("Cliente %s (Tipo %d): Costo original $%.2f, Descuento $%.2f, Total a pagar $%.2f\n",nombre, tipoCl, costoComputadora, descuento, precioFinal);
            contadorVentas++;
        }
        System.out.println("\n" + reporte);
        System.out.printf("Total de ventas: $%.2f\n", totalVentas);
    }
}
/***
 * run:
 * Ingrese los datos de las ventas (7 ventas):
 * 
 * Venta: 1
 * Ingrese el nombre del cliente: Jorge
 * Ingrese el costo de la computadora: 860
 * Ingrese el tipo de cliente (1, 2, otro (3)): 1
 * 
 * Venta: 2
 * Ingrese el nombre del cliente: Ivan
 * Ingrese el costo de la computadora: 987
 * Ingrese el tipo de cliente (1, 2, otro (3)): 2
 * 
 * Venta: 3
 * Ingrese el nombre del cliente: Arelis
 * Ingrese el costo de la computadora: 943
 * Ingrese el tipo de cliente (1, 2, otro (3)): 2
 * 
 * Venta: 4
 * Ingrese el nombre del cliente: Danna
 * Ingrese el costo de la computadora: 697
 * Ingrese el tipo de cliente (1, 2, otro (3)): 1
 * 
 * Venta: 5
 * Ingrese el nombre del cliente: Daniel
 * Ingrese el costo de la computadora: 760
 * Ingrese el tipo de cliente (1, 2, otro (3)): 3
 * 
 * Venta: 6
 * Ingrese el nombre del cliente: Valeria
 * Ingrese el costo de la computadora: 1230
 * Ingrese el tipo de cliente (1, 2, otro (3)): 3
 * 
 * Venta: 7
 * Ingrese el nombre del cliente: Ricardo
 * Ingrese el costo de la computadora: 579
 * Ingrese el tipo de cliente (1, 2, otro (3)): 1
 * 
 * Reporte de Ventas:
 * Cliente Jorge (Tipo 1): Costo original $860,00, Descuento $86,00, Total a pagar $774,00
 * Cliente  (Tipo 2): Costo original $987,00, Descuento $197,40, Total a pagar $789,60
 * Cliente  (Tipo 2): Costo original $943,00, Descuento $188,60, Total a pagar $754,40
 * Cliente  (Tipo 1): Costo original $697,00, Descuento $69,70, Total a pagar $627,30
 * Cliente  (Tipo 3): Costo original $760,00, Descuento $0,00, Total a pagar $760,00
 * Cliente  (Tipo 3): Costo original $1230,00, Descuento $0,00, Total a pagar $1230,00
 * Cliente  (Tipo 1): Costo original $579,00, Descuento $57,90, Total a pagar $521,10
 * 
 * Total de ventas: $5456,40
 * BUILD SUCCESSFUL (total time: 1 minute 40 seconds)
 */