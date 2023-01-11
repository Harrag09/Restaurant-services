
package gg;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Restaurant", targetNamespace = "http://GG/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Restaurant {


    /**
     * 
     * @param meals5
     * @param meals4
     * @param meals1
     * @param meals3
     * @param meals2
     * @return
     *     returns double
     */
    @WebMethod(operationName = "RepasTotal")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "RepasTotal", targetNamespace = "http://GG/", className = "gg.RepasTotal")
    @ResponseWrapper(localName = "RepasTotalResponse", targetNamespace = "http://GG/", className = "gg.RepasTotalResponse")
    @Action(input = "http://GG/Restaurant/RepasTotalRequest", output = "http://GG/Restaurant/RepasTotalResponse")
    public double repasTotal(
        @WebParam(name = "Meals_1", targetNamespace = "")
        double meals1,
        @WebParam(name = "Meals_2", targetNamespace = "")
        double meals2,
        @WebParam(name = "Meals_3", targetNamespace = "")
        double meals3,
        @WebParam(name = "Meals_4", targetNamespace = "")
        double meals4,
        @WebParam(name = "Meals_5", targetNamespace = "")
        double meals5);

    /**
     * 
     * @param drinks1
     * @param drinks2
     * @param drinks3
     * @param drinks4
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Boisson_total")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Boisson_total", targetNamespace = "http://GG/", className = "gg.BoissonTotal")
    @ResponseWrapper(localName = "Boisson_totalResponse", targetNamespace = "http://GG/", className = "gg.BoissonTotalResponse")
    @Action(input = "http://GG/Restaurant/Boisson_totalRequest", output = "http://GG/Restaurant/Boisson_totalResponse")
    public double boissonTotal(
        @WebParam(name = "Drinks_1", targetNamespace = "")
        double drinks1,
        @WebParam(name = "Drinks_2", targetNamespace = "")
        double drinks2,
        @WebParam(name = "Drinks_3", targetNamespace = "")
        double drinks3,
        @WebParam(name = "Drinks_4", targetNamespace = "")
        double drinks4);

    /**
     * 
     * @param drinks
     * @param meals
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Coute_Total")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Coute_Total", targetNamespace = "http://GG/", className = "gg.CouteTotal")
    @ResponseWrapper(localName = "Coute_TotalResponse", targetNamespace = "http://GG/", className = "gg.CouteTotalResponse")
    @Action(input = "http://GG/Restaurant/Coute_TotalRequest", output = "http://GG/Restaurant/Coute_TotalResponse")
    public double couteTotal(
        @WebParam(name = "Meals", targetNamespace = "")
        double meals,
        @WebParam(name = "Drinks", targetNamespace = "")
        double drinks);

}