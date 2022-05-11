package comunicacion;

import java.util.ArrayList;

public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen,String[] letras,String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}

	public String[] getLetras() {
		return letras;
	}
	
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	
	
	public void setLInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String interpretacion () {
		return interpretacion;
	}
	
	public String toString() {
		String retorno = "";
		for(String letra:letras) {
			retorno += letra+", ";
		}
		return retorno.substring(0, retorno.length()-2);
	}
	
	public int cantidadLetras() {
		return letras.length;
	}

	
	
}
