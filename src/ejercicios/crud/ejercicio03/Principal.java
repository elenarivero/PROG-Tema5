package ejercicios.crud.ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opc = 0;
		Pizza p;
		boolean res= false;
		int codigo;
		do {
			menu();
			opc = pideOpcion();
			
			switch(opc) {
			case 1: // Listado de pizzas
				ArrayPizzas.listarPizzas();
				break;
			case 2: // Nuevo pedido
				p = pidePizza();
				res = ArrayPizzas.addPizza(p);
				if(res) {
					System.out.println("Añadido correctamente");
				} else {
					System.out.println("No se ha podido añadir");
				}
				
				break;
			case 3: //Pizza servida
				codigo = pideCodigo();
				p = ArrayPizzas.buscaPizza(codigo);
				if(p!=null) {
					p.cambiaEstado();
					System.out.println("Pizza servida");
				} else {
					System.out.println("Pizza no encontrada");
				}
				break;
			case 4: // Salir
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Opción errónea");
				break;
			}
		} while (opc != 4);

	}

	private static void menu() {
		System.out.println("1. Listado de pizzas");
		System.out.println("2. Nuevo pedido");
		System.out.println("3. Pizza servida");
		System.out.println("4. Salir");
	}

	private static int pideOpcion() {
		int opc = 0;
		do {
			try {
				System.out.println("Introduce una opción");
				opc = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Tipo de dato erróneo");
			} finally {
				sc.nextLine();
			}
		} while (opc < 1 || opc > 4);
		
		return opc;
	}
	
	private static Pizza pidePizza() {
		Pizza pizza;
		int codigo;
		String tam;
		String tipo;
		
		codigo = pideCodigo();
		
		System.out.println("Introduzca el tamaño:");
		tam = sc.next();
		sc.nextLine();
		
		System.out.println("Introduzca el tipo:");
		tipo = sc.next();
		sc.nextLine();
		
		pizza = new Pizza(codigo, tam, tipo);
		
		return pizza;
	}
	
	private static int pideCodigo() {
		int codigo = 0;
		System.out.println("Introduzca el código:");
		codigo = sc.nextInt();
		sc.nextLine();
		
		return codigo;
	}
}
