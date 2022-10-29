
public class Vuelo {
	
	//Atributos de vuelo
	private String origen;
	private String destino;
	private Hora hora;
	private double precio;
	
	//Constructor 
	public Vuelo(String origen, String destino, Hora hora, double precio) {
		this.origen = origen;
		this.destino = destino;
		this.hora = hora;
		this.precio = precio;
	}
	
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Vuelo orígen: " + origen + "\n" +
				"Destino: " + destino + "\n" +
				hora + "\n" + //define the format of the hour changing the to string in Hora class. 
				"Precio: " + precio  + "\n";
	}
	
	
}
