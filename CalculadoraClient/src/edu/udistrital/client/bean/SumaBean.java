package edu.udistrital.client.bean;

import java.net.URL;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.xml.namespace.QName;

import edu.udistrital.client.model.Calculadora;
import edu.udistrital.client.model.CalculadoraService;

@Named
@RequestScoped
public class SumaBean {

	private int num1;
	private int num2;
	private int resultado;

	private static final QName SERVICE_NAME = new QName("http://model.udistrital.edu/", "CalculadoraService");

	public void sumar() {
		URL wsdlURL = CalculadoraService.WSDL_LOCATION;
		CalculadoraService ss = new CalculadoraService(wsdlURL, SERVICE_NAME);
		Calculadora port = ss.getCalculadoraPort();
		this.resultado = port.sumar(this.num1, this.num2);
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

}
