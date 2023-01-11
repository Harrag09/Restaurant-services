/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Oussama
 */
public class SuperClass_Parent {
    
    public double  Meals_1;
    public double  Meals_2;
    public double  Meals_3;
    public double  Meals_4;
    public double  Meals_5;
    
     public double  Drinks_1;
    public double  Drinks_2;
    public double  Drinks_3;
    public double  Drinks_4;
    
    
    public double  Meals;
    public double  Drinks;
    public double  TotalofMD;
    public double  AllTotalofMD;
    
    
    
    
    public double  getAmount()
    {
        Meals=Meals_1+Meals_2+Meals_3+Meals_4+Meals_5; 
        Drinks =Drinks_1+Drinks_2+Drinks_3+Drinks_4;   
        TotalofMD =Meals+Drinks;
        AllTotalofMD =  TotalofMD ; 
        return  AllTotalofMD ; 
    }
    
    private JFrame frame ;
    
    /**
     *
     */
    public  void iExitsystem(){
      frame = new JFrame("Exit");
      if(JOptionPane.showConfirmDialog(frame,"confirm if u want to exit ", " Restaurant Management System ",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
      {
          System.exit(0);
      }
  }
    
    
    
    public double  pMeals_1 = 4.5;
    public double  pMeals_2 = 4;
    public double  pMeals_3 = 6;
    public double  pMeals_4 = 7;    
    public double  pMeals_5 = 5;
    
    public double  pDrinks_1 = 3;
    public double  pDrinks_2 = 4;
    public double  pDrinks_3 = 7;
    public double  pDrinks_4 = 3; 
    
   public double mcTax=0.950;
   
   public Double cFindTax(double cAmount)
   {
       double FindTax = cAmount - (cAmount * mcTax);
       return  FindTax ;
   }

 
  
   
    
    
    
}
