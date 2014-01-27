/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marcopacheco;

/**
 *
 * @author Internet
 */
public class MarcoPacheco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Circulo c=new Circulo();
       System.out.println("Radio="+c.radio);
       
      
    
     if (c.radio < 0)
      
         System.out.println("No se permiten valores negativos");
         
     else
         System.out.println("Racio ="+c.radio);
     
         
         
    
        }
    
    
}
