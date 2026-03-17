import java.io.Serializable;

public class Personaje implements Serializable {
	private String nombre;
	private int nivel;
	private int vida;
	private int oro;
	
	public Personaje(String nombre, int nivel, int vida, int oro) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.vida = vida;
		this.oro = oro;
	}
	
	public void mostrar() {
		System.out.println(nombre + " | Nivel: " + nivel + " | Vida: " + vida + " | Oro: " + oro);
	}
	
	
}
