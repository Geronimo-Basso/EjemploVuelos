
public class Hora {

	private int hh;
	private int mm;
	
	
	public Hora(int hh, int mm) {
		//esto es otra forma de hacerlo, en vez de setrar el valoren y getear el valor en el main, lo hago todo aca
		//es una buena opcion para que quede más compacto en la clase, no le defino getters ni setters ahora. Solo quiero
		//chequear ahora
		checkHh(hh); 
		checkMm(mm);
		
	}

	private boolean checkHh(int hh) {
		boolean devolucion=false;
		if(hh<= 23 && hh>=0) {
			devolucion=true;
			this.hh=hh;
		}
		return devolucion;
		
	}
	
	
	private boolean checkMm(int mm) {
		boolean devolucion=true;
		if(hh<= 59 && hh>=0) {
			devolucion=true;
			this.mm=mm;
		}
	
		return devolucion;
		
	}

	@Override
	public String toString() {
		String sRet="Hora: "; //String return. 
		sRet+=(hh<=9)?"0":""; //formato distino de un if , me fijo si es menor o igual a 9, si lo es le pongo un cero, antes, sino lo es le pongo un espacio. 
		sRet+=hh;
		sRet+=":";
		sRet+=(mm<=9)?"0":""; //formato distino de un if, me fijo si es menor o igual a 9, si lo es le pongo un cero, antes, sino lo es le pongo un espacio. 
		sRet+=mm;
		
	
		return sRet;
	}
	
	
	
	
}
