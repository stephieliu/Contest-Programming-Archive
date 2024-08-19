/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostfrequentnumber;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.util.Map.Entry;
public class MostFrequentNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Map<Integer, Integer> frequent = new TreeMap();
        int [] Integers = new int [N];
        for(int i = 0; i<N; i++){
            Integers[i] = input.nextInt();
        }
        for(int i = 0; i<N;i++){
            frequent.put(Integers[i], 1+frequent.getOrDefault(Integers[i],0));
        }
        int maxValueInMap=(Collections.max(frequent.values()));  // This will return max value in the Hashmap
        for (Entry<Integer, Integer> entry : frequent.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());
                break;// Print the key with max value
            }
        }
    }
    
}
