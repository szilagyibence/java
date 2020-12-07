/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osszegzes10a;

/**
 *
 * @author DELL
 */
public class Osszegzes10a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println("\n\tÖSSZEGZÉS TÉTELE\n");
        
        int[] tomb = new int[5];
        int osszeg = 0;
        
        for (int i = 0; i < tomb.length; i++) {
            
            tomb[i] = (int)  (Math.random() * 99) + 1 ;
            osszeg = osszeg + tomb[i]; //osszeg
            
            if(i != tomb.length - 1)
                
             System.out.print(tomb[i] + ", ");
            
            else
                System.out.println(tomb[i]);
            
        }
        System.out.println("\n\nA számok összege: " + osszeg); 
        System.out.println("Átlag: " + (double) osszeg / tomb.length);
    }
    
}
