/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivalogatas;

/**
 *
 * @author DELL
 */
public class Kivalogatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println("\n\tKIVÁLOGATÁS TÉTELE\n");

        
        int[] erdemjegyek = new int[5];
        int[] masolat = new int[5];
        
        System.out.println("Érdemjegyek:");
        for (int i = 0; i < 5; i++) {
            erdemjegyek[i] = (int) (Math.random() * 5) + 1;
            System.out.println(i+1 + ". jegy: " + erdemjegyek[i]);
        }
        
        int kettesekDb = 0;
        for (int i = 0; i < 5; i++) {
            if (erdemjegyek[i] == 2) {
                masolat[kettesekDb++] = erdemjegyek[i];
            }
        }
        
        System.out.print("\nA másolat tömb elemei: ");
        for (int i = 0; i < kettesekDb; i++) {
            System.out.print(masolat[i] + " ");
        }
        
        System.out.print("\nA kettesek darabszáma: " + kettesekDb + "\n");
    }
    
}
