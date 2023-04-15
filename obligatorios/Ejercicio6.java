
import java.util.Scanner; 

/**Ejercicio6 (Calcular el Área de un triángulo)
 * 
 * 
 */
 
 public class Ejercicio6 {
	 public static void main(String [] args){
		 
		 Scanner s = new Scanner (System.in);
		 
		 System.out.println("Introduce la base del triángulo");
		 int base = Integer.parseInt(s.nextLine());
		 
		 System.out.println("Introduce la altura del triángulo");
		 int h = Integer.parseInt(s.nextLine());
		
		 int total;
		 
		 total = ((base * h) / 2);
		 
		 System.out.println("El area del triángulo es " + total);
		 
		 s.close();
		 
	 }
 }
