
public class Lavadora implements Control {
	
	public String encender() {
		return "La lavadora esta encendida";
	}
	public String apagar() {
		return "La lavadora esta apagada";
	}
	public String lavar() {
		return "Se inicia el ciclo de lavado";
	}
	public Lavadora() {
		super();
	}

}
