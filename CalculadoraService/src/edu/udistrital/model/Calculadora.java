package edu.udistrital.model;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class Calculadora {

	@WebResult(name="Resultado")
	@WebMethod(operationName="Sumar")
	public int sumar(@WebParam(name="Numero1") int num1, @WebParam(name="Numero2") int num2){
		return num1+num2;
	}
	
}
