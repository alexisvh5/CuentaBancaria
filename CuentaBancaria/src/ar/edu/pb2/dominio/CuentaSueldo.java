package ar.edu.pb2.dominio;

public class CuentaSueldo extends CuentaBancaria {

	@Override
	public Boolean extraer(Double importe) {
		
		return super.extraer(importe);
	}

	@Override
	public Boolean depositar(Double importe) {
	
		return super.depositar(importe); /// super referencia a CuentaBancaria
	}
	


}
