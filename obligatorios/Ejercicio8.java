
import java.util.Scanner;

/**Ejercicio8 (Calcular el sueldo de un trabajador dependiendo de las horas trabajadas)
 * 			  (A 12 Euros la hora)
 * 
 */
 
 public class Ejercicio8 {
	 public static void main(String [] args){
		 
		 Scanner s = new Scanner (System.in);
		 
		 int hora = 12;
		 
		 System.out.println("Introduce el número de horas totales que has trabajado este mes"); 
		 int horast = Integer.parseInt(s.nextLine());
		 
		 int suel;
		 suel = hora * horast;
		 
		 System.out.println("Usted ha trabajado " + horast + "y por ello le corresponde " + suel + "euros");
		 
		 s.close();
	 }
}

