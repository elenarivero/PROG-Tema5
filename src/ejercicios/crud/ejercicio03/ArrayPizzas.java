package ejercicios.crud.ejercicio03;

public class ArrayPizzas {
	private static Pizza[] pizzas = new Pizza[50];
	
	public static void listarPizzas() {
		for(Pizza p : pizzas) {
			if(p != null) {
				System.out.println(p);
				System.out.println("------------------------");
			}
		}
	}
	
	
	public static int posLibre() {
		int pos = -1;
		int i = 0;
		
		while (i<pizzas.length && pos == -1) {
			if(pizzas[i] == null) {
				pos = i;
			}
			i++;
		}
		
		return pos;
	}
	
	public static boolean addPizza(Pizza p) {
		boolean anyadida = false;
		int pos = posLibre();
		
		if(pos != -1) {
			pizzas[pos] = p;
			anyadida = true;
		}
		
		return anyadida;
	}
}
