
import java.util.Scanner;

/**Ejercicio10 (Conversor de MB a KB)
 * 
 * 
 */
 
 public class Ejercicio10{
	 public static void main(String [] args){
		 
		 Scanner s = new Scanner (System.in);
		 int ope = 1024;
		 
		 System.out.println("Introduce la cactidad de MB que quieres convertir");
		 int mb = Integer.parseInt(s.nextLine());
		 
		 int total;
		 
		 total = mb * ope;
		 
		 System.out.println(mb + "MB son " + total + "KB");
		 
		 s.close();
	 }
}

