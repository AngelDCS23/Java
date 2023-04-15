
import java.util.Scanner;

/**Ejercicio11 (Conversor de KB a MB)
 * 
 * 
 */
 
 public class Ejercicio11{
	 public static void main(String [] args){
		 
		 Scanner s = new Scanner (System.in);
		 int ope = 1024;
		 
		 System.out.println("Introduce la contidad de KB que quieres convertir en MB");
		 int kb = Integer.parseInt(s.nextLine());
		 
		 int total;
		 
		 total = kb / ope;
		 
		 System.out.println(kb + "KB son " + total + "MB");
		 
		 s.close();
	 }
}
