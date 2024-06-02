package ar.edu.pb2.dominio;

public class CuentaBancaria {

//private Integer numeroDeCuenta;
	private Double saldo;
	
	public CuentaBancaria() {
		this.saldo = 0.0;
	}

// como no es parametrizado ya tiene un valor x def desde java

	public Boolean extraer(Double importe) {

		if (importe <= this.saldo) {
			this.saldo -= importe;
			return true;
		}
		
		return false;

	}
	
	public Boolean depositar(Double importe) {
		
		if (importe > 0) {
			this.saldo += importe;
			return true;
		}
		
		return false;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	

}
