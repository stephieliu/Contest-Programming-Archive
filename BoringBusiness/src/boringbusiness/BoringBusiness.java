/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boringbusiness;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class BoringBusiness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	boolean [][] plan = new boolean [200][401];
	plan[4][199] = true;
	plan[5][199]= true;
	plan[6][199] = true;
	plan[0][200] = true;
	plan[1][200] = true;
	plan[2][200] = true;
	plan[6][200] = true;
	plan[2][201] = true;
	plan[6][201] = true;
	plan[2][202] = true;
	plan[6][202] = true;
	plan[2][203] = true;
	plan[3][203] = true;
	plan[4][203] = true;
	plan[6][203] = true;
	plan[4][204] = true;
	plan[6][204] = true;
	plan[2][205] = true;
	plan[3][205] = true;
	plan[4][205] = true;
	plan[6][205] = true;
	plan[2][206] = true;
	plan[6][206] = true;
	plan[2][207] = true;
	plan[3][207] = true;
	plan[4][207] = true;
	plan[5][207] = true;
	plan[6][207] = true;
	String dir = input.next();
	int row =4;
	int column = 199;
	boolean safe = true;
	while(!dir.equals("q")&&safe) {
            int dr =0;
            int dc =0;
            if(dir.equals("l")){
                dc=-1;
            }
            else if(dir.equals("u")){
                dr = -1;
            }
            else if(dir.equals("r")){
                dc= 1;
            }
            else if(dir.equals("d")){
                dr = 1;
            }
            int length = input.nextInt();
            while(length>0) {
                    row = row+dr;
                    column = column+dc;
                    if(plan[row][column]){
                        safe = false;
                    }
                    else{
                        plan[row][column] = true;
                    }
                    length--;
            }
            if(safe){
                System.out.println((column-200+" "+(row+1)*-1+" safe"));
            }
            else {
                    System.out.println((column-200)+" "+(row+1)*-1+" DANGER");
            }
            dir = input.next();
	}
    }
}
