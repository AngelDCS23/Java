
import java.util.Scanner;

/** Ejercicio 5 (Calcular el área de un triángulo)
 * 
 * 
 */
 
 public class Ejercicio5 {
	 public static void main(String [] args){
		 
		 Scanner s = new Scanner (System.in);
		 
		 System.out.println("Introduce la base del rectángulo");
		 int base = Integer.parseInt(s.nextLine());
		 
		 System.out.println("Introduce la altura del rectángulo");
		 int h = Integer.parseInt(s.nextLine());
		 
		 int area;
		 
		 area = base * h;
		 
		 System.out.println("El área del rectángulo es " + area);
	
		 s.close();
	 }
}


