package exercises_while;

import java.util.Scanner;

/***
 * Escribe un programa que vaya pidiendo al usuario números enteros positivos
 * que debe ir contando. Cuando el usuario no quiera insertar más números,
 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
 * cantidad de números positivos introducidos por el usuario.
 * 
 * @author misorna
 *
 */
public class Exercise2 {
	public static void main(String[] args) {
		// Declaramos las variables y inicializamos con 0
		int contador = 0; // Aquí se almacenarán cuantos núm positivos hay
		int num = 0; // Donde se guardará el valor de los números enteros
		Scanner sc = new Scanner(System.in); // Creamos el Scanner

		// Pedimos al usuario que introduzca un número
		System.out.print("Introduzca un número entero (positivo): ");
		num = sc.nextInt(); // leemos de teclado (entrada por defecto).

		while (num >= 0) {
			contador++;
			System.out.println("LLevas un total de " + contador + " núm positivos");
			// Pedimos al usuario que vuelva a introducir un número
			System.out.print("Introduzca de nuevo un número (negativo si desea finalizar): ");
			num = sc.nextInt(); // leemos de teclado (entrada por defecto).
		}

		// Mostramos la cuenta
		System.out.print("La cuenta sería --> " + contador);

		// Cerramos el Scanner
		sc.close();
	}
}
