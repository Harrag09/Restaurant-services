
package gg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Coute_Total complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Coute_Total">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Meals" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Drinks" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coute_Total", propOrder = {
    "meals",
    "drinks"
})
public class CouteTotal {

    @XmlElement(name = "Meals")
    protected double meals;
    @XmlElement(name = "Drinks")
    protected double drinks;

    /**
     * Obtient la valeur de la propriété meals.
     * 
     */
    public double getMeals() {
        return meals;
    }

    /**
     * Définit la valeur de la propriété meals.
     * 
     */
    public void setMeals(double value) {
        this.meals = value;
    }

    /**
     * Obtient la valeur de la propriété drinks.
     * 
     */
    public double getDrinks() {
        return drinks;
    }

    /**
     * Définit la valeur de la propriété drinks.
     * 
     */
    public void setDrinks(double value) {
        this.drinks = value;
    }

}
