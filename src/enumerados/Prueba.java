package enumerados;

import java.util.Scanner;

public class Prueba {
	enum DiaSemana {
		LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO
	};

	public static void main(String[] args) {
		DiaSemana dia;
		Scanner sc = new Scanner(System.in);
		String diaCadena = sc.next();
		
		dia = DiaSemana.valueOf(diaCadena);
		System.out.println(dia);
		
	}
}
