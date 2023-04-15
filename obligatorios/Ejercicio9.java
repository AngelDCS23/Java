
import java.util.Scanner;

/**Ejercicio9 (calcular el volumen de un cono)
 * 
 * 
 */
 
 public class Ejercicio9 {
	 public static void main(String [] args){
		 
		 Scanner s = new Scanner (System.in);
		 
		 System.out.println("Introduce la altura del cono");
		 int h = Integer.parseInt(s.nextLine());
		 
		 System.out.println("Introduce el rádio del cono");
		 int r = Integer.parseInt(s.nextLine());
		 
		 double pi = 3.14;
		 double at;
		 
		 at = ((pi * ((double)r * (double)r) * (double)h) / 3);
		 
		 System.out.println("El volumen de el cono es " + at);
		 
		 s.close();
	 }	 
}
