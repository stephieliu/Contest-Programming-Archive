package toweringtowers;
/**
 * @author Stephie
 */
import java.util.*;
import java.io.*;
public class ToweringTowers{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(input.readLine());
        StringTokenizer st = new StringTokenizer(input.readLine());
        int height[] = new int[N+1];
        int index[] = new int [N+1];
        int top = -1;
        top++;
        height[top] = Integer.MAX_VALUE;
        index[top] = 0;
        int [] towers = new int [N];
        for(int i = 0; i<N; i++){
            towers[i] = Integer.parseInt(st.nextToken());
            while(height[top] <=towers[i]){
                top--;
            }
            System.out.print(i - index[top]+ " ");
            top++;
            height[top] = towers[i];
            index[top] = i;
        }
//        result[0] = 0;
//        for(int i = 1; i<N; i++){
//            int count=0;//how many towers can be seen
//            //iterate through the things to the left of towers[i]
//            for(int j = i-1; j<i && j>-1; j--){
//                if(towers[j]<=towers[i]){
//                    count++;
//                }
//                else{
//                    count++;
//                    break;
//                }
//            }
//            result[i] = count;
//        }
//        for(int i = 0; i<N-1; i++){
//            System.out.print(result[i]+" ");
//        }
//        System.out.print(result[N-1]);
        //        Scanner input = new Scanner(System.in);
//        int N =input.nextInt();
//        int [] towers = new int [N];
//        int [] result = new int [N];
//        //collect input
//        for(int i = 0; i<N; i++){
//            towers[i] = input.nextInt();
//        }
//        for(int i = 0, j = 0; i<N; i++){
//            for(j = i-1; j>0; j--){
//                if(towers[j]>towers[i]){
//                    break;
//                }
//                result[i] = i-j;
//            }            
//        }
//        for(int i = 0; i<N-1; i++){
//            System.out.print(result[i]+" ");
//        }
//        System.out.print(result[N-1]);
//        Stack <Integer> tower = new Stack<>();
//        Stack <Integer> output = new Stack<>();
//        Stack <Integer> t = new Stack<>();
//       for(int i = 0;i<N; i++){
//            tower.push(input.nextInt());//store variables in tower
//        }
//        //for loop to iterate through all values of tower
//        for(int i = 0; i<N; i++){
//            //assign integer temp to be compared with all other heights of 
//            //towers
//            //assign integer count to keep count of how many towers a 
//            //certain tower can see
//            int temp = tower.pop();
//            int count = 0;
//            //check if tower.pop is less than or equal to temp; that means
//            //it is shorter and increase the count; otherwise break the
//            //loop
//            while(!tower.isEmpty()){
//                if(temp>=tower.peek()){
//                    count++;
//                    t.push(tower.pop());
//                }
//                else{
//                    count++;
//                    break;
//                }
//            }
//            //when you break out of loop, put the value of count into a
//            //stack called output to print out all the values together
//            //at the end
//            output.push(count);
//            //to get back the lost values, push the values in stack t 
//            //back into tower
//            while(!t.isEmpty()){
//                tower.push(t.pop());
//            }
//        }
//        while(output.size()>1){
//            System.out.print(output.pop()+" ");
//        }
//        System.out.print(output.pop());
    }
}