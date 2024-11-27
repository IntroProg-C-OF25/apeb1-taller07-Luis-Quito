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
        System.out.printf("Total acumulado de ventas: $%.2f\n", totalVentas);
    }
}