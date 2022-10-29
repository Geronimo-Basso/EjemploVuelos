import java.io.IOException;

public class Principal {

	// Programa principal
	public static void main(String[] arg) throws IOException {
		ReservaVuelos reservas = new ReservaVuelos();
		reservas.inicializarVuelos();
		reservas.buclePrincipal();
	}

}
