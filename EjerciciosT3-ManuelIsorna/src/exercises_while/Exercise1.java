package exercises_while;

import java.util.Scanner;

/***
 * Escribe un programa que vaya pidiendo al usuario números enteros positivos
 * que debe ir sumando. Cuando el usuario no quiera insertar más números,
 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
 * suma de los números positivos introducidos por el usuario.
 * 
 * @author misorna
 *
 */
public class Exercise1 {
	public static void main(String[] args) {
		// Declaro las variables y las inicializo con valor 0
		int num = 0; // Contendrá los números que ponga el usuario
		int suma = 0; // Aquí se almacenará la suma de los números
		Scanner sc = new Scanner(System.in); // Creamos el Scanner

		// Pedimos al usuario que introduzca un número
		System.out.print("Introduzca un número entero: ");
		suma = sc.nextInt(); // leemos de teclado

		// Hacemos una comprobación que mira si el número es negativo
		while (num >= 0) {
			System.out.println("La suma sería de " + suma); // mostramos la suma
			System.out.print("Vuelva a introducir un número: "); // pedimos otra vez número
			num = sc.nextInt(); // leemos de teclado
			suma += num; // van sumándose aquí los números
		}
		
		/* opcional: 
		 * 			System.out.println("El resultado final sería de " + (suma + num*-1)); 
		*/
		
		// Cerramos el Scanner
		sc.close();
	}
}
