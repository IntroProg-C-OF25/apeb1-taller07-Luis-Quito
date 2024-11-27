/***
 * Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
 * Nombre el jugador
 * Posición en el campo de juego
 * Edad
 * Estatura
 * El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
 * Listado de Jugadores
 * 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 * 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
 * 3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
 * 4. Ángel Mena -Delantero-, edad 32, estatura 1.75
 * 5. Michael Estrada -Delantero-, edad 27, estatura 1.93
 * Promedio de edades:  26.8
 * Promedio de estaturas: 1.87
 * @author Luis
 */
import java.util.Scanner;
public class Problema4_JugadoresFutbol {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        StringBuilder recopilacion = new StringBuilder("");
        String nombre, posicion, seguir;
        int edad, ciclos = 0;
        double estatura, edadprom = 0, estaturaprom = 0;
        do{
            System.out.print("Ingrese el nombre del jugador: ");
                nombre = tcl.next();
                tcl.nextLine();
            System.out.print("Ingrese la posisicion del jugador en el campo de juego: ");
                posicion = tcl.next();
            System.out.print("Ingrese la edad del jugador: ");
                edad = tcl.nextInt();
            System.out.print("Ingrese la estatura del jugador: ");
                estatura = tcl.nextDouble();
                tcl.nextLine();
                edadprom+=edad;
                estaturaprom+=estatura;
            ciclos++;
            recopilacion.append(ciclos).append("-").append(nombre).append("-").append(posicion).append(", ").append(" EDAD ").append(edad).append(", ESTATURA ").append(estatura).append("\n");
            System.out.println("¿Deseas ingresar datos de otro jugador? ");
            seguir = tcl.nextLine();
        } while (seguir.equalsIgnoreCase("si")); 
            edadprom = (edadprom)/ciclos;
            estaturaprom = (estaturaprom)/ciclos;
            System.out.println(recopilacion.toString());
            System.out.println("Promedio de edades: " + edadprom);
            System.out.println("Promedio de estaturas: " + estaturaprom);
        }
    }
/***
 * run:
 * Ingrese el nombre del jugador: Alexander Dominguez
 * Ingrese la posisicion del jugador en el campo de juego: Arquero
 * Ingrese la edad del jugador: 32
 * Ingrese la estatura del jugador: 1,95
 * ¿Deseas ingresar datos de otro jugador? 
 * si
 * Ingrese el nombre del jugador: Xavier Arreaga
 * Ingrese la posisicion del jugador en el campo de juego: Defensa
 * Ingrese la edad del jugador: 24
 * Ingrese la estatura del jugador: 1,85
 * ¿Deseas ingresar datos de otro jugador? 
 * si
 * Ingrese el nombre del jugador: Moises Caicedo
 * Ingrese la posisicion del jugador en el campo de juego: Mediocentro
 * Ingrese la edad del jugador: 19
 * Ingrese la estatura del jugador: 1,88
 * ¿Deseas ingresar datos de otro jugador? 
 * si
 * Ingrese el nombre del jugador: Ángel Mena
 * Ingrese la posisicion del jugador en el campo de juego: Delantero
 * Ingrese la edad del jugador: 32
 * Ingrese la estatura del jugador: 1,75
 * ¿Deseas ingresar datos de otro jugador? 
 * si
 * Ingrese el nombre del jugador: Michael Estrada
 * Ingrese la posisicion del jugador en el campo de juego: Delantero
 * Ingrese la edad del jugador: 27
 * Ingrese la estatura del jugador: 1,93
 * ¿Deseas ingresar datos de otro jugador? 
 * no
 * 
 * 1-Alexander-Arquero,  EDAD 32, ESTATURA 1.95
 * 2-Xavier-Defensa,  EDAD 24, ESTATURA 1.85
 * 3-Moises-Mediocentro,  EDAD 19, ESTATURA 1.88
 * 4-Ángel-Delantero,  EDAD 32, ESTATURA 1.75
 * 5-Michael-Delantero,  EDAD 27, ESTATURA 1.93
 * 
 * Promedio de edades: 26.8
 * Promedio de estaturas: 1.8719999999999999
 * BUILD SUCCESSFUL (total time: 1 minute 52 seconds)
 */