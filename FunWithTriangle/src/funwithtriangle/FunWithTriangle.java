/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithtriangle;

/**
 *
 * @author Stephie
 */
import java.util.*;
import static java.lang.Math.PI;
import static java.lang.Math.acos;
import java.text.DecimalFormat;
public class FunWithTriangle {

    /**
     * @param args the command line arguments
     */
    static void printAngle(double A, double B, double C){ 
    DecimalFormat df = new DecimalFormat("###.#");
    double a = Math.pow(A, 2), b = Math.pow(B, 2), c = Math.pow(C, 2);
    // From Cosine law 
    double alpha = (double) acos((b + c - a)/(2*B*C)); 
    double betta = (double) acos((a + c - b)/(2*A*C)); 
    double gamma = (double) acos((a + b - c)/(2*A*B)); 
      
    // Converting to degree 
    alpha = (float) (alpha * 180 / PI); 
    betta = (float) (betta * 180 / PI); 
    gamma = (float) (gamma * 180 / PI); 
      
    // printing all the angles 
    System.out.print(df.format(alpha)+" "); 
    System.out.print(df.format(betta)+" "); 
    System.out.print(df.format(gamma)+"\n"); 
    } 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.#");
        int [][] coordinates = new int [3][2];
        double [] length = new double [3];
        for(int i = 0; i<3; i++){
            for(int j = 0; j<2; j++){
                coordinates[i][j]= input.nextInt();
            }
        }
        //lengths
        length[0] = Math.sqrt(Math.pow(coordinates[0][0] - coordinates[1][0],2)+
                Math.pow(coordinates[0][1] - coordinates[1][1],2));
        length[1] = Math.sqrt(Math.pow(coordinates[1][0] - coordinates[2][0],2)+
                Math.pow(coordinates[1][1] - coordinates[2][1],2));
        length[2] = Math.sqrt(Math.pow(coordinates[2][0] - coordinates[0][0],2)+
                Math.pow(coordinates[2][1] - coordinates[0][1],2));
        //Perimeter
        double perimeter = length[0]+length[1]+length[2];
        //Area
        double S = perimeter/2;
        double area = Math.sqrt(S*(S-length[0])*(S-length[1])*(S-length[2]));
        System.out.println(df.format(length[0])+" "+df.format(length[1])
                +" "+df.format(length[2]));
        //angles
        printAngle(length[0], length[1], length[2]);
        System.out.println(df.format(perimeter));
        System.out.println(df.format(area));
    }
    
}
