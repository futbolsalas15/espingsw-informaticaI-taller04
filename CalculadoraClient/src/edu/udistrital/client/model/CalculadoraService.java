package edu.udistrital.client.model;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-03-15T15:10:31.119-05:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "CalculadoraService", 
                  wsdlLocation = "http://localhost:8080/CalculadoraService/Calculadora?wsdl",
                  targetNamespace = "http://model.udistrital.edu/") 
public class CalculadoraService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://model.udistrital.edu/", "CalculadoraService");
    public final static QName CalculadoraPort = new QName("http://model.udistrital.edu/", "CalculadoraPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/CalculadoraService/Calculadora?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CalculadoraService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/CalculadoraService/Calculadora?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CalculadoraService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CalculadoraService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculadoraService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CalculadoraService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CalculadoraService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CalculadoraService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns Calculadora
     */
    @WebEndpoint(name = "CalculadoraPort")
    public Calculadora getCalculadoraPort() {
        return super.getPort(CalculadoraPort, Calculadora.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Calculadora
     */
    @WebEndpoint(name = "CalculadoraPort")
    public Calculadora getCalculadoraPort(WebServiceFeature... features) {
        return super.getPort(CalculadoraPort, Calculadora.class, features);
    }

}
