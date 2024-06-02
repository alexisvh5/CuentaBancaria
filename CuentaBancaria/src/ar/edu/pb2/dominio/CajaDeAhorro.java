package ar.edu.pb2.dominio;

public class CajaDeAhorro extends CuentaBancaria{
	
	
	private int cantidadExtracciones;
	private static final int IMPORTE_RECARGO = 6;
	private static final int CANTIDAD_MAXIMA_EXT = 5;
	
	public CajaDeAhorro() {
		this.cantidadExtracciones = 0;
	}
	

	@Override
	public Boolean extraer(Double importe) {
	
		
		if (this.cantidadExtracciones> CANTIDAD_MAXIMA_EXT) {
			importe += IMPORTE_RECARGO;
		}

		if (super.extraer(importe)) {
			this.cantidadExtracciones++;
			return true;
		}
		
		return false;
	}
	
	

	@Override
	public Boolean depositar(Double importe) {

		return super.depositar(importe);
	}

	
	
}
