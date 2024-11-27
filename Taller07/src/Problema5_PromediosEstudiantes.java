/***
 * Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de ellos ingresar el nombre del estudiante, el promedio de ciclo. Presentar el siguiente reporte		
 * Estudiante 1	10	Aprobado
 * Estudiante 2	6.9	Reprobado
 * Estudiante 3	7	Aprobado
 * Estudiante 4	5	Reprobado
 * Atención; con base al valor del promedio, usted debe asignar en cada registro el tipo Aprobado o Reprobado.
 * @author Luis
 */
import java.util.Scanner;
public class Problema5_PromediosEstudiantes {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, estado; 
        double promedio;
        int contador = 1;
        while (contador <= 4){
            System.out.print("Dame nombres y promedio del estudiante " + contador + ": ");
               nombre = tcl.next();
            promedio = tcl.nextDouble();
            if (promedio < 7)
                estado = "Reprobado"; 
            else
                estado = "Aprobado";
            System.out.printf("| %s\t| %s | %s\t|\n","Nombre", "Promedio", "Estado");
            System.out.printf("| %s\t| %.2f\t   | %s\t|\n", nombre, promedio, estado);
            contador++;
        
        }
    }
}
/***
 * run:
 * Dame nombres y promedio del estudiante1: Carlos 9
 * | Nombre	| Promedio | Estado	|
 * | Carlos	| 9,00	   | Aprobado	|
 * Dame nombres y promedio del estudiante2: Alfredo 10
 * | Nombre	| Promedio | Estado	|
 * | Alfredo	| 10,00	   | Aprobado	|
 * Dame nombres y promedio del estudiante3: Natasha 7
 * | Nombre	| Promedio | Estado	|
 * | Natasha	| 7,00	   | Aprobado	|
 * Dame nombres y promedio del estudiante4: Daniela 5,7
 * | Nombre	| Promedio | Estado	|
 * | Daniela	| 5,70	   | Reprobado	|
 * BUILD SUCCESSFUL (total time: 29 seconds)
 */