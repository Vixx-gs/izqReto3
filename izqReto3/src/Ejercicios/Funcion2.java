package Ejercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Funcion2 {
// calcula la media de los días mensuales que van de una fecha a otra
	public static double MediaFecha(LocalDate fecha1,LocalDate fecha2){
		int dias = (int) ChronoUnit.DAYS.between(fecha1,fecha2);
		int meses = (int) ChronoUnit.MONTHS.between(fecha1, fecha2);
		
		//System.out.println(ld.getDayOfMonth()); 	//día del mes (1-31)
		//System.out.println(ld.getMonthValue()); 	//nº de mes (1-12)

		
	}
	public static String Letras(LocalDate fecha2) {
		String mes=(fecha2.getMonth());
		int len=mes.length()-1;
		boolean con;
		String retorno="";
		char a;
		
		for (int i=0;i>=len;i++) {
			a=mes.substring(i);
			con=consonante(a);
			if (con) {retorno=retorno+a;}
			
			
		}
		
		public static boolean consonante(char c) {
			char[] consonantes = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
			
			return (new String(consonantes).indexOf(c) >= 0)?true:false;
			}
}
//Si no son del mismo año, calcula la media de los días mensuales que van de una fecha a otra, incluye el mes
//de la primera fecha, pero no el el mes de la segunda fecha. Ademas, muestra las consonantes del mes de la
//segunda fecha separadas por comas. (Ej April -> p,r,l)
//Por ejemplo, si las fechas son: 1/1/2023 y 1/2/2024, hay que calcular la media de 31 (enero 2023), 28
//(febrero 2023), 31 (marzo 2023), 30 (abril), ...31 (diciembre 2023), 31 (enero 2024).
//La suma de los días de todos los meses: 31+28+31+...+31=396 días. Media = 396 días/13 meses=30.46

