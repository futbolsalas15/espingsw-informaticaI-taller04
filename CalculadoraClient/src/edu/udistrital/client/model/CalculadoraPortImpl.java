
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package edu.udistrital.client.model;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-03-15T15:10:31.087-05:00
 * Generated source version: 3.1.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "CalculadoraService",
                      portName = "CalculadoraPort",
                      targetNamespace = "http://model.udistrital.edu/",
                      wsdlLocation = "http://localhost:8080/CalculadoraService/Calculadora?wsdl",
                      endpointInterface = "edu.udistrital.client.model.Calculadora")
                      
public class CalculadoraPortImpl implements Calculadora {

    private static final Logger LOG = Logger.getLogger(CalculadoraPortImpl.class.getName());

    /* (non-Javadoc)
     * @see edu.udistrital.client.model.Calculadora#sumar(int  numero1 ,)int  numero2 )*
     */
    public int sumar(int numero1,int numero2) { 
        LOG.info("Executing operation sumar");
        System.out.println(numero1);
        System.out.println(numero2);
        try {
            int _return = 29720536;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
