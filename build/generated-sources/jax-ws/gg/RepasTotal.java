
package gg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RepasTotal complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RepasTotal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Meals_1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Meals_2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Meals_3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Meals_4" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Meals_5" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepasTotal", propOrder = {
    "meals1",
    "meals2",
    "meals3",
    "meals4",
    "meals5"
})
public class RepasTotal {

    @XmlElement(name = "Meals_1")
    protected double meals1;
    @XmlElement(name = "Meals_2")
    protected double meals2;
    @XmlElement(name = "Meals_3")
    protected double meals3;
    @XmlElement(name = "Meals_4")
    protected double meals4;
    @XmlElement(name = "Meals_5")
    protected double meals5;

    /**
     * Obtient la valeur de la propriété meals1.
     * 
     */
    public double getMeals1() {
        return meals1;
    }

    /**
     * Définit la valeur de la propriété meals1.
     * 
     */
    public void setMeals1(double value) {
        this.meals1 = value;
    }

    /**
     * Obtient la valeur de la propriété meals2.
     * 
     */
    public double getMeals2() {
        return meals2;
    }

    /**
     * Définit la valeur de la propriété meals2.
     * 
     */
    public void setMeals2(double value) {
        this.meals2 = value;
    }

    /**
     * Obtient la valeur de la propriété meals3.
     * 
     */
    public double getMeals3() {
        return meals3;
    }

    /**
     * Définit la valeur de la propriété meals3.
     * 
     */
    public void setMeals3(double value) {
        this.meals3 = value;
    }

    /**
     * Obtient la valeur de la propriété meals4.
     * 
     */
    public double getMeals4() {
        return meals4;
    }

    /**
     * Définit la valeur de la propriété meals4.
     * 
     */
    public void setMeals4(double value) {
        this.meals4 = value;
    }

    /**
     * Obtient la valeur de la propriété meals5.
     * 
     */
    public double getMeals5() {
        return meals5;
    }

    /**
     * Définit la valeur de la propriété meals5.
     * 
     */
    public void setMeals5(double value) {
        this.meals5 = value;
    }

}
