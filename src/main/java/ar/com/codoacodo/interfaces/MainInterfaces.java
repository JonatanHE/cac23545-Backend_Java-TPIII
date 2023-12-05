package ar.com.codoacodo.interfaces;

public class MainInterfaces {

	public static void main(String[] args) {
		//forma de instanciar
		ConsolaInformableImpl obj1 = new ConsolaInformableImpl();
		//obj1
		
		//Interface nombre = ClaseQueImplementa();
		Informable i = new ConsolaInformableImpl();			
		i.informar();
		
		//down casting
		//quiero la onsolaInformableImpl que esta dentro de i
		ConsolaInformableImpl ci = (ConsolaInformableImpl)i;
		
	}
		
}
