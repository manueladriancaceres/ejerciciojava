package digitalhouse.edu.servicios;

public class DesdeHasta <T1,T2>{

	private T1 desde;
	private T2 hasta;
	
		
	public DesdeHasta(T1 desde, T2 hasta) {
		super();
		this.desde = desde;
		this.hasta = hasta;
	}
	public DesdeHasta() {
		// TODO Auto-generated constructor stub
	}
	public T1 getDesde() {
		return desde;
	}
	public void setDesde(T1 desde) {
		this.desde = desde;
	}
	public T2 getHasta() {
		return hasta;
	}
	public void setHasta(T2 hasta) {
		this.hasta = hasta;
	}
	
	
	
}
