/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombmuveletek;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Tombmuveletek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           Scanner bekeres = new Scanner(System.in);
           int tombOsszeg1 = 0;
           int tombOsszeg2 = 0;     
           int tombOsszertek = 0;
           
           System.out.println("\n\tTÖMBMŰVELETEK\n"); 
           System.out.print("Hány elemet tartalmazzanak a tömbök: ");
           
           int tombSzam = bekeres.nextInt();
           
           int[] tomb1 = new int[tombSzam];
           int[] tomb2 = new int[tombSzam];
           
           bekeres.close();
           
           System.out.println("A tömbök elemei: ");
           
           for (int i = 0; i < tomb1.length; i++) {
            
            
            tomb1[i] = (int)  (Math.random() * 999) + 1;
            tomb2[i] = (int) (Math.random() * 999) + 1;
            int osszeg = tomb1[i] + tomb2[i];
            tombOsszeg1 += tomb1[i];
            tombOsszeg2 += tomb2[i];
            
            System.out.println(i+1 + ".: " + String.format("%,3d", tomb1[i]) + " + " + String.format("%,3d", tomb2[i]) + " = " + String.format("%,5d", osszeg));
            
        }
           tombOsszertek = tombOsszeg1 + tombOsszeg2;
           double tomb1Atlag = (double) tombOsszeg1 / tomb1.length;
           double tomb2Atlag =  (double) tombOsszeg2 / tomb2.length;  
           double tombOsszatlag = (double) tombOsszertek / (tomb1.length + tomb2.length);
           
           System.out.println("\nTomb1 összege: " + tombOsszeg1);
           System.out.println("Tomb1 összegének átlaga: " + tomb1Atlag +"\n");
           
           System.out.println("Tomb2 összege: " + tombOsszeg2);
           System.out.println("Tomb2 összegének átlaga: " + tomb2Atlag+"\n");
           
           System.out.println("A két tömb összértéke: " + tombOsszertek);
           System.out.println("A két tömb összátlaga: " + tombOsszatlag);

                   
    }
    
}
