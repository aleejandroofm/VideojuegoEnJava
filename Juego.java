
public class Juego {

	public static void main(String[] args) throws Exception {
		Personaje p = new Personaje("Link", 5, 100, 250);
		GuardarPersonaje.guardar(p);
		//Personaje cargado = GuardarPersonaje.cargar();
		//cargado.mostrar();
	}

}
