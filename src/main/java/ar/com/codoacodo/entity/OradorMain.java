package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class OradorMain {

	public static void main(String[] args) {
		// simular que creamos un objeto de la clase Orador para grabar eb la db
		
		//Instancio un objeto de la clase Orador
		//crear un orador a partir de la clase Orador
		Orador nuevoOrador = new Orador("jonatan", "sequeira", "jonatansequeira@email.com", "java", LocalDate.now());
		
		//mostrar por consola nuevo orador
		System.out.println(nuevoOrador);
		
		//instancia de la clase orador "simulando" que viene desde la DB
		Orador nuevoFromDB = new Orador(1L, "jonatan", "sequeira", "jonatansequeira@email.com", "java", LocalDate.now());
		 
		//un tipo de polimorfismo es lasobrecarga: en la misma clase tengo 2 metodos o constructores
		//con el mismo nombre pero con distintos parametros
		
		//nuevoOrador.id = 1L; //problema de encapsulamiento
		
		nuevoOrador.serNombre("pipo");
		
	}

}
