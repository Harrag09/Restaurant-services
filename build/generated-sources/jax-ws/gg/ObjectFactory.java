
package gg;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gg package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CouteTotalResponse_QNAME = new QName("http://GG/", "Coute_TotalResponse");
    private final static QName _CouteTotal_QNAME = new QName("http://GG/", "Coute_Total");
    private final static QName _RepasTotalResponse_QNAME = new QName("http://GG/", "RepasTotalResponse");
    private final static QName _BoissonTotal_QNAME = new QName("http://GG/", "Boisson_total");
    private final static QName _BoissonTotalResponse_QNAME = new QName("http://GG/", "Boisson_totalResponse");
    private final static QName _RepasTotal_QNAME = new QName("http://GG/", "RepasTotal");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gg
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RepasTotal }
     * 
     */
    public RepasTotal createRepasTotal() {
        return new RepasTotal();
    }

    /**
     * Create an instance of {@link BoissonTotalResponse }
     * 
     */
    public BoissonTotalResponse createBoissonTotalResponse() {
        return new BoissonTotalResponse();
    }

    /**
     * Create an instance of {@link CouteTotal }
     * 
     */
    public CouteTotal createCouteTotal() {
        return new CouteTotal();
    }

    /**
     * Create an instance of {@link RepasTotalResponse }
     * 
     */
    public RepasTotalResponse createRepasTotalResponse() {
        return new RepasTotalResponse();
    }

    /**
     * Create an instance of {@link BoissonTotal }
     * 
     */
    public BoissonTotal createBoissonTotal() {
        return new BoissonTotal();
    }

    /**
     * Create an instance of {@link CouteTotalResponse }
     * 
     */
    public CouteTotalResponse createCouteTotalResponse() {
        return new CouteTotalResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CouteTotalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GG/", name = "Coute_TotalResponse")
    public JAXBElement<CouteTotalResponse> createCouteTotalResponse(CouteTotalResponse value) {
        return new JAXBElement<CouteTotalResponse>(_CouteTotalResponse_QNAME, CouteTotalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CouteTotal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GG/", name = "Coute_Total")
    public JAXBElement<CouteTotal> createCouteTotal(CouteTotal value) {
        return new JAXBElement<CouteTotal>(_CouteTotal_QNAME, CouteTotal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepasTotalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GG/", name = "RepasTotalResponse")
    public JAXBElement<RepasTotalResponse> createRepasTotalResponse(RepasTotalResponse value) {
        return new JAXBElement<RepasTotalResponse>(_RepasTotalResponse_QNAME, RepasTotalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoissonTotal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GG/", name = "Boisson_total")
    public JAXBElement<BoissonTotal> createBoissonTotal(BoissonTotal value) {
        return new JAXBElement<BoissonTotal>(_BoissonTotal_QNAME, BoissonTotal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoissonTotalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GG/", name = "Boisson_totalResponse")
    public JAXBElement<BoissonTotalResponse> createBoissonTotalResponse(BoissonTotalResponse value) {
        return new JAXBElement<BoissonTotalResponse>(_BoissonTotalResponse_QNAME, BoissonTotalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepasTotal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GG/", name = "RepasTotal")
    public JAXBElement<RepasTotal> createRepasTotal(RepasTotal value) {
        return new JAXBElement<RepasTotal>(_RepasTotal_QNAME, RepasTotal.class, null, value);
    }

}
