/***
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 5/10, 10/12, 15/14, 20/16, ... n
 * @author Luis
 */
import java.util.Scanner;
public class Problema2_Serie2 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int contador = 5, limite, num = 10;
        System.out.print("Dame el limite: ");
        limite = tcl.nextInt();
        while (contador <= limite){
            System.out.print(contador + "/" + num + ", ");
            contador = contador + 4;
            contador++;
            num = num + 2;
        }
        System.out.println("");
    }
}
/***
 * run:
 * Dame el limite: 100
 * 5/10, 10/12, 15/14, 20/16, 25/18, 30/20, 35/22, 40/24, 45/26, 50/28, 55/30, 60/32, 65/34, 70/36, 75/38, 80/40, 85/42, 90/44, 95/46, 100/48, 
 * BUILD SUCCESSFUL (total time: 6 seconds)
 */