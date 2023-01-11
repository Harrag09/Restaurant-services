
package gg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Boisson_total complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Boisson_total">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Drinks_1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Drinks_2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Drinks_3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Drinks_4" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Boisson_total", propOrder = {
    "drinks1",
    "drinks2",
    "drinks3",
    "drinks4"
})
public class BoissonTotal {

    @XmlElement(name = "Drinks_1")
    protected double drinks1;
    @XmlElement(name = "Drinks_2")
    protected double drinks2;
    @XmlElement(name = "Drinks_3")
    protected double drinks3;
    @XmlElement(name = "Drinks_4")
    protected double drinks4;

    /**
     * Obtient la valeur de la propriété drinks1.
     * 
     */
    public double getDrinks1() {
        return drinks1;
    }

    /**
     * Définit la valeur de la propriété drinks1.
     * 
     */
    public void setDrinks1(double value) {
        this.drinks1 = value;
    }

    /**
     * Obtient la valeur de la propriété drinks2.
     * 
     */
    public double getDrinks2() {
        return drinks2;
    }

    /**
     * Définit la valeur de la propriété drinks2.
     * 
     */
    public void setDrinks2(double value) {
        this.drinks2 = value;
    }

    /**
     * Obtient la valeur de la propriété drinks3.
     * 
     */
    public double getDrinks3() {
        return drinks3;
    }

    /**
     * Définit la valeur de la propriété drinks3.
     * 
     */
    public void setDrinks3(double value) {
        this.drinks3 = value;
    }

    /**
     * Obtient la valeur de la propriété drinks4.
     * 
     */
    public double getDrinks4() {
        return drinks4;
    }

    /**
     * Définit la valeur de la propriété drinks4.
     * 
     */
    public void setDrinks4(double value) {
        this.drinks4 = value;
    }

}
