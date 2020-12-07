/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megszamlalas;
import java.util.Scanner;


/**
 *
 * @author DELL
 */
public class Megszamlalas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\n\r MEGSZÁMLÁLÁS TÉTELE\n");
       
        Scanner bekeres = new Scanner(System.in);
        
        System.out.print("Hány elemet tartalmazzon a tömb: ");
         
        int tombSzam = bekeres.nextInt();
           
        int[] tomb = new int[tombSzam];
        int szamokDb = 0;
           
        bekeres.close();

        System.out.print("A tömb elemei: ");
         
         for (int i = 0; i < tombSzam; i++) {
             
             tomb[i] = (int)  (Math.random() * 999) + 1;
             szamokDb++;

             System.out.print(tomb[i] + " ");
            
        }
         
         int parosSzamDb = 0;
         for (int i = 0; i < tombSzam; i++) {
             
             if (tomb[i] % 2 == 0) {
                 parosSzamDb++;
             }
            
        }
         
         System.out.println("\n Elemek száma: " + tombSzam + " = " + tomb.length + " = " + szamokDb);
         System.out.println("Páros számok db száma: " + parosSzamDb);
        
        
    }
    
}
