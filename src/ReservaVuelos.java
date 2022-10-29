import java.io.*;
import java.util.Vector;

public class ReservaVuelos {
	// Acceso a la entrada est�ndar
	private BufferedReader br;
	// Almacenador de c�digos de clientes
	private Vector<Cliente> clientes;
	// Almacenador de c�digos de clientes
	// Almacenador de reservas
	private Vector<Vuelo> vuelos; //Vector que tiene 
	
	private Vector<Reserva> reservas;

	
	// Constructor
	public ReservaVuelos() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		clientes = new Vector();
		reservas = new Vector();
		vuelos=new Vector(); //recordar inicializar el vector. 
	}
	
	// Inicializaci�n del catalogo de vuelos
	public void inicializarVuelos() {
		Vuelo vuelo1=new Vuelo("Madrid","Londres",new Hora(9,00), 150d);
		vuelos.add(vuelo1);
		Vuelo vuelo2=new Vuelo("Praga","Budapest",new Hora(12,30), 70d);
		vuelos.add(vuelo2);
		Vuelo vuelo3=new Vuelo("Roma","Vienna",new Hora(22,00), 15d);
		vuelos.add(vuelo3);
		

	}

	// Cat�logo de vuelos
	public String catalogoVuelos() {
		String listado = "--------- Vuelos ---------" + "\n";
		for (int i = 0; i < vuelos.size(); ++i) {
			listado += "\n--- Vuelo Número " + (i+1) + " ---\n";
			listado+=vuelos.elementAt(i);
			listado += "\n----------------------";
		}
		listado += "\n------- Fin Vuelos -------\n";
		return listado;
	}
	
	// Reserva un vuelo para un c�digo de cliente, indicando la posici�n del vuelo en la lista, en reservas
	public void reservarVuelo(int codigoCliente, int codigoVuelo) {
		Cliente cliente= new Cliente (codigoCliente);
		clientes.addElement(cliente);
		
		reservas.addElement(new Reserva(cliente,vuelos.elementAt(codigoVuelo)));
	}
	
	// Listado de reservas
	public String listadoReservas() {
		String listado = "--------- Reservas ---------";
		for (int i = 0; i < reservas.size(); ++i) {
	
			listado += "\n--- Reserva Número " + (i+1) + " ---\n";
			listado += reservas.elementAt(i).getCliente() + "\n";
			listado +=reservas.elementAt(i).getVuelo();
			listado += "\n------------------------";
		}
		listado += "\n------ Fin Reservas ------\n";
		return listado;
	}
	
	// Lectura de datos para hacer reservas
	public int leerCodigoCliente() throws IOException {
		String entrada;
		int codigo;
		System.out.print("Codigo cliente: ");
		entrada = br.readLine();
		codigo = Integer.parseInt(entrada);
		return codigo;
	}
	
	public int leerNumeroVuelo() throws IOException {
		String entrada;
		int numeroVuelo;
		System.out.print("Numero Vuelo: ");
		entrada = br.readLine();
		numeroVuelo = Integer.parseInt(entrada);
		return numeroVuelo;
	}
	
	
	// Menu principal
	public int menuPrincipal() throws IOException {
		int opcion = 0;
		String entrada;
		System.out.println("[1] Mostrar catálogo de vuelos.");
		System.out.println("[2] Realizar reserva.");
		System.out.println("[3] Listado de reservas.");
		System.out.println("[0] Salir.");
		System.out.print("Elige una opcion: ");
		entrada = br.readLine();
		opcion = Integer.parseInt(entrada);
		return opcion;
	}
	
	// M�todo principal de gesti�n
	public void buclePrincipal() throws IOException {
		boolean salir = false;
		int opcion;
		int codigo, numeroVuelo;
		while (!salir) {
			opcion = menuPrincipal();
			switch (opcion) {
				case 1:		System.out.println(this.catalogoVuelos());
							break;
				case 2:		codigo = this.leerCodigoCliente();
							numeroVuelo = this.leerNumeroVuelo();
							this.reservarVuelo(codigo,numeroVuelo-1);
							break;
				case 3:		System.out.println(this.listadoReservas());
							break;
				default:	salir = true;
			}
		}
	}
	

}