/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kettomb;

/**
 *
 * @author DELL
 */
public class KETTOMB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          System.out.println("\n\tÖSSZEGZÉS TÉTELE\n");
        
        int[] tomb1 = new int[10];
        int[] tomb2 = new int[10];
        int osszeg1 = 0;
        int osszeg2 = 0;
        
       
        
        System.out.print("\nA tomb1 elemei: ");
        
        for (int i = 0; i < tomb1.length; i++) {
            
            
            tomb1[i] = (int)  (Math.random() * 99) + 1 ;
            osszeg1 = osszeg1 + tomb1[i]; 
            
            if(i != tomb1.length - 1)
                
             System.out.print(tomb1[i] + ", ");
            
            else
                System.out.println(tomb1[i]);
            
        }
        
        System.out.print("A tomb2 elemei: ");
        
        for (int i = 0; i < tomb2.length; i++) {
            
            tomb2[i] = (int) (Math.random() * 99) + 1;
            osszeg2 = osszeg2 + tomb2[i];
            
            if (i != tomb2.length - 1)           
                System.out.print(tomb2[i] + ", ");
            else
                    System.out.print(tomb2[i]);
        }
        
        double atlag1 = (double) osszeg1 / tomb1.length;  
        double atlag2 = (double) osszeg2 / tomb2.length;  

        
        System.out.println("\n\nA tomb1 elemeinek összege: " + osszeg1); 
        System.out.println("A tomb2 elemeinek összege: " + osszeg2);
        
        System.out.println("\nA tomb1 elemeinek átlaga: " + atlag1);
        System.out.println("A tomb2 elemeinek átlaga: " + atlag2);
        
      
    }
    
}
