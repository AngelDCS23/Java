
import java.util.Scanner;


/**Ejercicio4 (Operaciones básicas con 2 números)
 * 
 * 
 */

public class Ejercicio4 {
	public static void main(String [] args){
		
		Scanner s = new Scanner (System.in);
	
		System.out.println("Escribe el primer número");
		int num1 = Integer.parseInt(s.nextLine());
		
		System.out.println("Introduce el segundo número");
		int num2 = Integer.parseInt(s.nextLine());
		
		int sum;
		int res;
		int mult;
		double div;
		
		sum = num1 + num2;
		res = num1 - num2;
		mult = num1 * num2;
		div = (double)num1 / (double)num2; 
		
		System.out.println("El resultado de la suma es " + sum + ", el resultado de la resta es " + res + ", el resultado de la multiplicación es " + mult + ", el resultado de la división es " + div);
		
		s.close();
	}
}
