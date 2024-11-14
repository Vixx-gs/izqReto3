package Ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainReto3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate fecha1 = null;
		LocalDate fecha2 = null;
		do {
			try {
				fecha1 = dimeFecha("Introduce una fecha", sc);
				fecha2 = dimeFecha("Introduce una segunda fecha", sc);
			}
			catch(Exception ex) {
				
			}
		}while(fecha1.isAfter(fecha2));
		
		int difmeses = Funcion1.diferenciaMeses(fecha1, fecha2);
		int corta = Integer.MAX_VALUE;
		if(difmeses>=3) {
		for(int i=0;i<difmeses;i++) {
			String nombre = dimeNombre("Introduce un nombre", sc);
			 if (nombre.length() < corta) {
                 corta = nombre.length();
             }
			 System.out.println(nombre.startsWith("a"));
		}
		System.out.println(corta);
		
		}
		else {
			for(int j=0;j<4;j++) {
				String nombre2 = dimeNombre("Introduce nombre", sc);
				if (nombre2.length() < corta) {
	                 corta = nombre2.length();
	             }
			}
		}
		
		
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
				System.out.println(nombre);
				String s1 = sc.nextLine();
				return s1;
			}
			catch(Exception ex) {
				System.out.println("Introduce un nombre valido");
			}
		}while(true);
		
		
		
	}
}
