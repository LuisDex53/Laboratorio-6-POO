
public class TV extends Dispositivo implements Control{
	public String  encender() {
		return "El tele esta encendido";
	}
	public String apagar() {
		return "El tele esta apagado";
	}
	@Override
	public  String subirVolumen() {
		return "Subiendo Volumen";
	}
	@Override
	public  String bajarVolumen() {
		return "Bajando volumen";
	}
	@Override
	public  String subirCanal() {
		return "Subiendo de Canal";
	}
	@Override
	public  String bajarCanal() { 
		return "Bajando de Canal";
	}
	public TV() {
		super();
	}
}
