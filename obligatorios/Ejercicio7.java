
import java.util.Scanner;

/** Ejercicio7 (Calcular el total a partir de una base imponible)
 * 
 * 
 */
 
 public class Ejercicio7{
	 public static void main(String [] args){
		 
		 Scanner s = new Scanner (System.in);
		 int base = 100;
		 
		 System.out.println("Introduce tu salario");
		 int sal = Integer.parseInt(s.nextLine());
		 
		 int total;
		 
		 total = sal - base;
		 
		 System.out.println("Tu sueldo descontando la base imponible se queda en " + total);
		 
		 s.close();
	 }
}

