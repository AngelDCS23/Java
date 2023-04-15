
import java.util.Scanner;

/** Ejercicio 3 (Conversión de Euros a Pesetas)
 * 
 * 
 */
 
 public class Ejercicio2 {
	 public static void main(String [] args){
		 
		 Scanner s = new Scanner (System.in);
		 
		 int mult = 166;
		 
		 System.out.println("Introduce la cantidad en Euros ");
		 int eu = Integer.parseInt(s.nextLine());
		 
		 int conv = eu * mult;
		 
		 System.out.println(eu + " Euros en pesetas son " + conv + "pesetas");
		 
		 s.close();
	}
}
		 
		 
		 
		 
