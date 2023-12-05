package ar.com.codoacodo.interfaces.log;

public class EmailLog implements ILog {

	@Override
	public void log() {
		System.out.println("Enviado por e-mail este mensaje");

	}

}
