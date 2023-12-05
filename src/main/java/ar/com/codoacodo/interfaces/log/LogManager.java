package ar.com.codoacodo.interfaces.log;

public class LogManager {
	//static: un metodo que es de la clase, NO de un objeto
	public static ILog getLogger(String target) {
		//Interface i = new ClaseQueImplmenta();
		ILog i;
		switch (target) {
			case "A":
				i = new FsLog();
				break;
			case "B": {
				i = new EmailLog();
				break;
			}
			case "C":{
				i = new SmsLog();
				break;
			}
			default:
				i = null;
			}
		//un solo return
		return i;
	}
}
