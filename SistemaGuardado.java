import java.io.*;

public class SistemaGuardado {
	
	public static void guardarPartida(Partida p, int slot) throws FileNotFoundException {
		String fichero = "save_" + slot + ".dat";
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
			oos.writeObject(p);
			System.out.println("Partida guardada en slot " + slot);
		} catch (IOException e) {
			System.err.println("No se pudo guardar: " + e.getMessage());
		}
	}
	
	public static Partida cargarPartida(int slot) {
		String fichero = "save_" + slot + ".dat";
		Partida p = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
			p = (Partida) ois.readObject();
			System.out.println("Partida cargada desde slot " + slot);
		} catch (FileNotFoundException f) {
			System.out.println("No hay partida en slot " + slot);
		} catch (Exception e) {
			System.err.println("Error al cargar: " + e.getMessage());
		}
		return p;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// Primera sesión de juego
		Partida partida = new Partida("Jugador 1");
		// El jugador avanza, consigue objetos...
		partida.setNivel(5);
		partida.getInventario().add("Espada elfica");
		guardarPartida(partida, 1);
		
		// Segunda sesión - cargamos la partida guardada
		Partida cargada = cargarPartida(1);
		if (cargada != null) {
			cargada.mostrar();
		}
	}

}
