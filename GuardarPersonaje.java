import java.io.*;

public class GuardarPersonaje {
	
	public static void guardar(Personaje p) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personaje.dat"));
		oos.writeObject(p);
		oos.close();
	}
	
	public static Personaje cargar() throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personaje.dat"));
		Personaje p = (Personaje) ois.readObject();
		ois.close();
		return p;
	}
}
