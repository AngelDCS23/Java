
import java.util.Scanner;

/** Ejercicio3 (Conversor de Pesetas a Euros
 * 
 * 
 */
 
 public class Ejercicio3 {
	 public static void main(String [] args){
		 
		 Scanner s = new Scanner (System.in);
		 
		 int conv = 166;
		 double eu;
		 
		 System.out.println("Introduce la cantidad de Pesetas ");
		 int pese = Integer.parseInt(s.nextLine());
		 
		 eu = (double) pese / (double)conv;

		System.out.println(pese + " Pesetas son " + eu + "euros");
		
		s.close();
	}
}
