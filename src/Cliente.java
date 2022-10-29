
public class Cliente {
	
	private int idCliente;

	public Cliente(int idCliente) {
		checkCliente(idCliente);
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "Cliente: " + (idCliente + 1)  ; //No se si esta bien el +1
	}
	
	
	private boolean checkCliente(int idCliente) {
		boolean devolucion= false;
		
		if(idCliente<=0) {
			devolucion=true;
			this.idCliente=idCliente;
		}
		
		return devolucion;
		
	}

}
