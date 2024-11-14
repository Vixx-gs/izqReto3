package Ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainReto3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate fecha1 = dimeFecha("Introduce una fecha", sc);
		LocalDate fecha2 = dimeFecha("Introduce una segunda fecha", sc);
		
	}

	
	//funcion para decir fecha
	public static LocalDate dimeFecha(String fechafrase, Scanner sc) {
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do
		{
			try
			{
				System.out.println(fechafrase);
				String s = sc.nextLine();
				LocalDate fecha = LocalDate.parse(s, formato1);
				return fecha;
			}
			catch(Exception ex)
			{
				System.out.println("Introduce una fecha correcta");
			}
		}while(true);
	}
	
	
	//funcion para decir nombre
	public static String dimeNombre(String nombre, Scanner sc) {
		do {
			try {
				System.out.println("Introduce una frase");
				String s1 = sc.nextLine();
				return s1;
			}
			catch(Exception ex) {
				System.out.println("Introduce una frase valida");
			}
		}while(true);
		
		
		
	}
}
