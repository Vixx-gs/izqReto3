package Ejercicios;

import java.util.Scanner;

public class funciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		System.out.println(esInt("5"));
		System.out.println(esDouble("5"));
		int n = dimeEntero("numero", sc);
		System.out.println(n);
		double d = dimeDouble("numero double", sc);
		System.out.println(d);
	}
	
	//comprueba si es entero true o si no false
	public static boolean esInt(String text) {

		try {
			//leer si es entero
			Integer.parseInt(text);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}
	
	//comprueba si tiene es con decimaes true o si no false
	public static boolean esDouble(String text) {
		try {
			Double.parseDouble(text);
			return true;
		} catch (Exception ex) {
			return false;
		}
		
	}
	
	//comprueba que le pasas un entero y devuelve ese numero
	public static int dimeEntero(String text, Scanner sc) {
		int n=0;
		do
		{
			try
			{
				System.out.println(text);
				String s = sc.nextLine();
				n=Integer.parseInt(s);
				break;
			}
			catch(Exception ex)
			{
				System.out.println("Introduce un nº correcto");
			}
		}while(true);
		return n;
	}
	
	//comprueba que le pasas un decimal y devuelve ese numero
	public static double dimeDouble(String text, Scanner sc) {
		double d=0;
		do
		{
			try
			{
				System.out.println(text);
				String s = sc.nextLine();
				d=Double.parseDouble(s);
				break;
			}
			catch(Exception ex)
			{
				System.out.println("Introduce un nº correcto");
			}
		}while(true);
		return d;
	}
}
