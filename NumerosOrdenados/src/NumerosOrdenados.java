/*Debe dise�ar un programa que reciba 3 n�meros por consola y determine cual de los 3 n�meros es el mayor.
Plus: Imprimir los n�meros ordenados de mayor a menor.
Plus: Imprimir los n�meros ordenados de menor a mayor.
*/


import java.util.Scanner;
public class NumerosOrdenados {

	public static void main(String[] args) {
		
		
		int num1,num2,num3;
		 
		int a, b, c;

		System.out.println("Bienvenido al programa para calcular el n�mero mayor. Disfr�talo. \n ");
		Scanner type = new Scanner(System.in);
		System.out.println("Ingrese el valor del numero 1: ");
		num1 = type.nextInt();
		System.out.println("Ingrese el valor del numero 2: ");
		num2 = type.nextInt();
		System.out.println("Ingrese el valor del numero 3: ");
		num3 = type.nextInt();
		
		a = num1;
		b = num2;
		c = num3;
		
		
		//If para indicar cual es el mayor 
		
		
		
		if (a > b && a > c) {
			System.out.println ("El n�mero " + a + " es el mayor.");
			
			
		} else {
				if (b > a && b > c) {
					System.out.println ("El n�mero " + b + " es el mayor.");
					
					
		} else {
					System.out.println ("El n�mero " + c + " es el mayor.");
		}
		}
	}
}
	
	
	

		
