
import java.util.Scanner;

/**Ejercicio número 1 
 * 
 * 
 */ 

public class Ejercicio1 {
	public static void main (String [] args){
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Escribe el pimer número ");
	int num1 = Integer.parseInt(s.nextLine());
	
	System.out.println("Escribe el segundo número ");
	int num2 = Integer.parseInt(s.nextLine());
	
	int total = num1 * num2;
	
	System.out.println("El resultado de la multiplicación es " + total);
	
	s.close();
	}
}
