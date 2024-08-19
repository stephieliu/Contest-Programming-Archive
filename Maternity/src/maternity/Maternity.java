/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maternity;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Maternity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mom = input.next();
        String dad = input.next();
        int X = input.nextInt();
        for(int i = 0; i<X; i++){
            String baby = input.next();
            if(isBaby(mom, dad, baby)){
                System.out.println("Possible baby.");
            }
            else{
                System.out.println("Not their baby!");
            }
        }
    }
    public static boolean isBaby(String m, String d, String b){
        boolean result = true;
	for (int i = 0 ; i <= 4 && result ; i++)
	    if (b.charAt (i) >= 'A' && b.charAt (i) <= 'E')
		result = (m.charAt (i * 2) >= 'A' && m.charAt (i * 2) <= 'E') ||
		    (m.charAt (i * 2 + 1) >= 'A' && m.charAt (i * 2 + 1) <= 'E') ||
		    (d.charAt (i * 2) >= 'A' && d.charAt (i * 2) <= 'E') ||
		    (d.charAt (i * 2 + 1) >= 'A' && d.charAt (i * 2 + 1) <= 'E');
	    else
		result = ((m.charAt (i * 2) >= 'a' && m.charAt (i * 2) <= 'e') ||
			(m.charAt (i * 2 + 1) >= 'a' && m.charAt (i * 2 + 1) <= 'e')) &&
		    ((d.charAt (i * 2) >= 'a' && d.charAt (i * 2) <= 'e') ||
			(d.charAt (i * 2 + 1) >= 'a' && d.charAt (i * 2 + 1) <= 'e'));
	return result;
    }
}
