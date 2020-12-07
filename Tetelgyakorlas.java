
package tetelgyakorlas;

/**
 *
 * @author DELL
 */
public class Tetelgyakorlas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\n\tTÉTELGYAKORLÁS\n"); 

        
        int elemSzam = (int)(Math.random()*10) + 10;  
        int[] tomb1 = new int[elemSzam];
        int[] tomb2 = new int[elemSzam];
        int tombDarab = elemSzam;
        int tombOsszeg = 0;
        
        
        System.out.println("A tömbök elemei: ");
        for (int i = 0; i < elemSzam; i++) {
            
            tomb1[i] = (int) (Math.random() * 200) - 100;
            tomb2[i] = (int) (Math.random() * 200) - 100;
            tombOsszeg += tomb2[i];

             System.out.println(String.format("%,3d", i+1) +  ".: " + String.format("%,3d", tomb1[i]) + "  " + String.format("%,3d", tomb2[i]));
        }
        
        double tombAtlag = (double) tombOsszeg / elemSzam;
        
        System.out.println("\nAz első tömb ennyi elemből áll: " + tombDarab);
        System.out.println("A második tömb összege: " + tombOsszeg);
        System.out.println("A második tömb átlaga: " + tombAtlag);
        System.out.println("\n");
    }
    
}
