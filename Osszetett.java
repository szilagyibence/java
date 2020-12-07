/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osszetett;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Osszetett {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\n\tÖSSZETETT FELADAT\n");
        
        Scanner bemenet = new Scanner(System.in);
        char valasz; 
       
        do {
            //2. A tömbök elemszámát is véletlenszám generátorral állítsd elő 10 és 30 között.
            int elemSzam = (int) (Math.random() * 20) + 10;
            
            //1. Hozz létre két tömböt: szamok1, szamok2 néven!
            int[] szamok1 = new int[elemSzam];
            int[] szamok2 = new int[elemSzam];
            
            //3. Az elemek a -50 és +50 értéktartományba essenek.
            for (int i = 0; i < elemSzam; i++) {
                szamok1[i] = (int) (Math.random() * 100) - 50;
                szamok2[i] = (int) (Math.random() * 100) - 50;
            }
            
            //4. Írasd ki a két tömböt egy-egy sorban ügyelve, hogy az elemek helyiérték szerint egymás alá kerüljenek.
            System.out.print("\nszamok1 elemei: ");
            for (int i = 0; i < elemSzam; i++) {
                System.out.print(String.format("%,3d", szamok1[i]) + " ");
            }
            
            System.out.print("\nszamok2 elemei: ");
            for (int i = 0; i < elemSzam; i++) {
                System.out.print(String.format("%,3d", szamok2[i]) + " ");
            }
            
            int parosDb = 0;
            int[] ujTomb = new int[elemSzam];
            
            //5. Helyezd át a két tömb öttel osztható páros számait egy ujTomb nevű tömbbe és írasd ki az elemeket.
            for (int i = 0; i < elemSzam; i++) {
                
               
                if (szamok1[i] % 5 == 0 && szamok1[i] % 2 == 0) {
                    ujTomb[parosDb++] = szamok1[i];
                }
                
                if (szamok2[i] % 5 == 0 && szamok2[i] % 2 == 0) {
                    ujTomb[parosDb++] = szamok2[i];
                }
                 
            }
            
            boolean vanNulla = false;
            System.out.print("\n\nAz ujTomb elemei: ");
            for (int i = 0; i < parosDb; i++) {
                System.out.print(String.format("%,3d", ujTomb[i]) + " ");
            }
            
            //6. Írasd ki, hogy 0-át tartalmaz-e az ujTomb?
            for (int i = 0; i < parosDb; i++) { 
                 if(ujTomb[i] == 0) {
                    vanNulla = true;
                    break;
                }
            }
           
            if (vanNulla) System.out.println("\nAz ujTomb tartalmaz 0-t.");
            
            //7. Kérdezd meg, szeretné-e újrafuttatni a felhasználó a programot (i/n)! 
            System.out.print("\n\nSzeretnéd újra kipróbálni? (i/n) : ");
            valasz = bemenet.nextLine().toLowerCase().charAt(0);
            
        } while(valasz == 'i');
        bemenet.close();        
    }
   
}
