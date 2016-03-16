package edu.udistrital.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.udistrital.model.Calculadora;

public class TestSuma {

	@Test
	public void testSumasSimples() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.sumar(10, 1);
		assertEquals(11, resultado);
	}

	
	@Test
	public void testSumasNumerosGrandes() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.sumar(10000000, 10000000);
		assertEquals(20000000, resultado);
	}

}
