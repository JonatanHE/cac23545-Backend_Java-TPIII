package ar.com.codoacodo.herencia;

import java.util.Arrays;

public class Musica extends Articulo {
	
	private String[] temas;

	//como musica es una subclase de articulo
	// y articulo tiene constructor 1= al default
	
	public Musica(
			String titulo,
			Float precio,
			String img) {
		//la primer linea de codigo del constructor
		//de una clase hija debe invocar al constructor del padre
		
		super(titulo, precio, img);
		//despues que nace el pader puedo setear atributos propios
	}
	
	public void setTemas(String[] temas) {
		this.temas = temas;
		
	}
	
	public String[] getTemas() {
		return this.temas;
		
	}

	@Override
	public String toString() {
		return super.toString() + ",Musica [temas=" + Arrays.toString(temas) + "]";
	}
	
	
}
