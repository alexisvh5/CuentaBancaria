package ar.edu.pb2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.pb2.dominio.CajaDeAhorro;
import ar.edu.pb2.dominio.CuentaBancaria;
import ar.edu.pb2.dominio.CuentaCorriente;
import ar.edu.pb2.dominio.CuentaSueldo;

public class TestBanco {

	@Test
	public void quePuedaCrearCuentasBancarias() {
		
		CuentaBancaria cuentaBanc = new CuentaBancaria();
		
		CajaDeAhorro cajaAhorro = new CajaDeAhorro();
		
		CuentaSueldo cuentaSaldo = new CuentaSueldo();
		
		CuentaCorriente cuentaCorriente = new CuentaCorriente();
		
		assertNotNull(cuentaBanc);
		assertNotNull(cajaAhorro);
		assertNotNull(cuentaSaldo);
		assertNotNull(cuentaCorriente);

		
	}

}
