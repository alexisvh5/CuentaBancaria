package ar.edu.pb2.dominio;

public class CuentaCorriente extends CuentaBancaria{
	
private static final double IMPORTE_DESCUBIERTO = 150; //  valor aleatorio tomado del enunciado


	@Override
	public Boolean extraer(Double importe) {
		
		if (this.getSaldo() < importe && IMPORTE_DESCUBIERTO + this.getSaldo() >= importe) {
			
			importe += IMPORTE_DESCUBIERTO*0.05;
			
		}
		
		
		return super.extraer(importe);
	}

	@Override
	public Boolean depositar(Double importe) {
	
		return super.depositar(importe);
	}
	
	
	


}
