
public class Estereo extends Dispositivo implements Control {
	public String  encender() {
		return "El estereo esta encendido";
	}
	public String apagar() {
		return "El estereo esta apagado";
	}
	public String subirVolumen() {
		return "Subiendo Volumen";
	}
	@Override
	public String bajarVolumen() {
		return "Bajando volumen";
	}
	@Override
	public String subirCanal() {
		return "Subiendo de Emisora";
	}
	@Override
	public String bajarCanal() { 
		return "Bajando de Emisora";
	}
	public Estereo() {
		super();
	}
}
