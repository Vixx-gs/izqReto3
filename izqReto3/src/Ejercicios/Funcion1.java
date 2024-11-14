package Ejercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Funcion1 {

	//Sacar la diferencia de meses entre uno y otro
	public static int diferenciaMeses(LocalDate ld1, LocalDate ld2) {
		int meses = (int)ChronoUnit.MONTHS.between(ld1, ld2);
		
		return meses;
	}

}
