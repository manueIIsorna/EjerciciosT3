package exercises_while;

import java.util.Scanner;

/***
 * Escribe un programa que vaya pidiendo al usuario números enteros positivos
 * que debe ir sumando. Cuando el usuario no quiera insertar más números,
 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
 * media de los números positivos introducidos por el usuario.
 * 
 * @author misorna
 *
 */
public class Exercise3 {
	public static void main(String[] args) {
		// Declaramos las variables y inicializamos con 0
		double media = 0; // Aquí se almacenará la media de los números
		int numPedido = 0; // Donde se guardará el valor de los números enteros
		int sumaNum = 0; // Almacenamos aquí los valores de núm, sumándose unos con otros
		int contador = 0; // Usado para saber por cuanto hacer la media
		Scanner sc = new Scanner(System.in); // Creamos el Scanner

		// Pedimos al usuario que introduzca un número
		System.out.print("Introduzca un número entero (positivo): ");
		numPedido = sc.nextInt(); // leemos de teclado (entrada por defecto).
		sumaNum = numPedido;
		contador++; // para contar el primer número pedido

		while (numPedido >= 0) {

			// Pedimos al usuario que vuelva a introducir un número
			System.out.print("Introduzca de nuevo un número (negativo si desea finalizar): ");
			numPedido = sc.nextInt(); // leemos de teclado (entrada por defecto).
			sumaNum += numPedido;
			contador++; // va almacenando la cuenta de núm introducidos

		}

		// Tras introducir un núm negativo, ha de ahcerse lo siguiente
		contador--; // Quitando aquí el número que no contaría (negativo).
		numPedido *= -1; // Para revertir la negatividad
		sumaNum += numPedido; // Para tener así la suma sin la resta hecha por el núm negativo

		// Realizamos la media
		media = sumaNum / contador;

		// Mostramos la cuenta
		System.out.printf("La media de todos los números introducidos sería de -> %.0f", media);

		// Cerramos el Scanner
		sc.close();
	}
}
