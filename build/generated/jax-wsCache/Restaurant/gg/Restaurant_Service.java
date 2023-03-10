
package gg;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Restaurant", targetNamespace = "http://GG/", wsdlLocation = "http://localhost:44097/CalculServices/Restaurant?WSDL")
public class Restaurant_Service
    extends Service
{

    private final static URL RESTAURANT_WSDL_LOCATION;
    private final static WebServiceException RESTAURANT_EXCEPTION;
    private final static QName RESTAURANT_QNAME = new QName("http://GG/", "Restaurant");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:44097/CalculServices/Restaurant?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RESTAURANT_WSDL_LOCATION = url;
        RESTAURANT_EXCEPTION = e;
    }

    public Restaurant_Service() {
        super(__getWsdlLocation(), RESTAURANT_QNAME);
    }

    public Restaurant_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), RESTAURANT_QNAME, features);
    }

    public Restaurant_Service(URL wsdlLocation) {
        super(wsdlLocation, RESTAURANT_QNAME);
    }

    public Restaurant_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RESTAURANT_QNAME, features);
    }

    public Restaurant_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Restaurant_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Restaurant
     */
    @WebEndpoint(name = "RestaurantPort")
    public Restaurant getRestaurantPort() {
        return super.getPort(new QName("http://GG/", "RestaurantPort"), Restaurant.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Restaurant
     */
    @WebEndpoint(name = "RestaurantPort")
    public Restaurant getRestaurantPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://GG/", "RestaurantPort"), Restaurant.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RESTAURANT_EXCEPTION!= null) {
            throw RESTAURANT_EXCEPTION;
        }
        return RESTAURANT_WSDL_LOCATION;
    }

}
