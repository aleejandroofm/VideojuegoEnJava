import java.util.ArrayList;
import java.io.Serializable;


public class Partida implements Serializable {
	private String nombreJugador;
	private int nivel;
	private int puntuacion;
	private int vidas;
	private double posicionX, posicionY;
	private ArrayList<String> inventario;
	
	public Partida(String nombre) {
		this.nombreJugador = nombre;
		this.nivel = 1;
		this.puntuacion = 0;
		this.vidas = 3;
		this.posicionX = 0.0;
		this.posicionY = 0.0;
		this.inventario = new ArrayList<>();
	}
	
	public void mostrar() {
		System.out.println("Jugador: " + nombreJugador);
		System.out.println("Nivel: " + nivel + " | Puntos: " + puntuacion + " | Vidas: " + vidas);
		System.out.println("Posicion: (" + posicionX + ", " + posicionY + ")");
		System.out.println("Inventario: " + inventario);
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public double getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(double posicionX) {
		this.posicionX = posicionX;
	}

	public double getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(double posicionY) {
		this.posicionY = posicionY;
	}

	public ArrayList<String> getInventario() {
		return inventario;
	}

	public void setInventario(ArrayList<String> inventario) {
		this.inventario = inventario;
	}

}
