/***
 * Generar e imprimir la siguiente serie:
 * sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 * @author Luis 
 */
public class Problema7_Suma {
    public static void main(String[] args) {
        int contador = 1, n = 10; 
        double suma = 0, num = 1.0;
        while (contador <= 10) {
            num = 1.0 / contador;
            if (contador % 2 == 0) {
                suma += num;
                System.out.print("+(1/" + contador + ") ");
            } else {
                suma -= num;
                System.out.print("-(1/" + contador + ") ");
            }
            contador++;
        }
        System.out.println("\n\nSumatoria = " + suma);
    }
}
/***
 * run:
 * -(1/1) +(1/2) -(1/3) +(1/4) -(1/5) +(1/6) -(1/7) +(1/8) -(1/9) +(1/10) 
 * 
 * Sumatoria = -0.6456349206349207
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */