/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eldontes;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Eldontes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("\n\tELDÖNTÉS TÉTELE");
        
        //Bemeneti változó létrehozása
        Scanner bemenet = new Scanner(System.in);
        
        System.out.print("Add meg hány elemből álljon a tömb: ");
        
        //A "szamok" tömb elemszámának bekérése a felhasználótól
        int tombDb = bemenet.nextInt();
        
        //A "szamok" tömb létrehozása a felhasználó által megadott elemszámmal/hosszal
        int[] szamok = new int[tombDb];
        
        System.out.print("Tömbök elemei: ");
        //A tömb i. elemeinek értékadása és kiiratása
        for (int i = 0; i < tombDb; i++) {
            
            szamok[i] = (int) (Math.random() * 40) - 20; //Random érték -20 és +20 között
            
            System.out.print(szamok[i] + " ");
        }
        
        boolean szerepelNulla = false;
        //Tömb elemenkénti megvizsgálása, hogy tartalmaz-e nullát
        for (int i = 0; i < tombDb; i++) {
            
            if (szamok[i] == 0) {
                szerepelNulla = true;
                break;
            }
        }
        
        //Ha a tömbben található 0, akkor ez a feltétel igaz.
        if (szerepelNulla) {
            System.out.println("\n\nA tömbben található 0.");
        }
        
        System.out.println("\n");
    }
    
}
