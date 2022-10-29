
public class Reserva {
	
	private Cliente cliente;
	
	private Vuelo vuelo;

	public Reserva(Cliente cliente, Vuelo vuelo) {
		this.cliente = cliente;
		this.vuelo = vuelo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	
	
	
	

}
