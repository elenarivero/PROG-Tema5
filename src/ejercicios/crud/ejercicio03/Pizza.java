package ejercicios.crud.ejercicio03;

public class Pizza {
	
	enum Tamanyo {MEDIANA, FAMILIAR};
	enum Tipo {MARGARITA, CUATRO_QUESOS, FUNGHI};
	enum Estado {PEDIDA, SERVIDA};
	
	private int codigo;
	private Tamanyo tam;
	private Tipo tipo;
	private Estado estado = Estado.PEDIDA;
	
	public Pizza() {
		
	}
	
	public Pizza(int codigo, String tam, String tipo) {
		if(codigo>0) {
			this.codigo = codigo;
		}
		
		if(tam!=null && !tam.equals("")) {
			this.tam = Tamanyo.valueOf(tam);
		}
		
		if(tipo!=null && !tipo.equals("")) {
			this.tipo = Tipo.valueOf(tipo);					
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTam() {
		return String.valueOf(tam);
	}

	public String getTipo() {
		return String.valueOf(tipo);
	}

	public String getEstado() {
		return String.valueOf(estado);
	}

	public void cambiaEstado() {
		this.estado = Estado.SERVIDA;
	}
	
	@Override
	public String toString() {
		String res = "";
		res += "Código: " + this.codigo + "\n";
		res += "Tamaño: " + this.tam + "\n";
		res += "Tipo: " + this.tipo + "\n";
		res += "Estado: " + this.estado + "\n";		
		return res;
	}
	
}
