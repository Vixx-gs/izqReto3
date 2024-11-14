package Ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainReto3 {

	public static void main(String[] args) {
		
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
}
