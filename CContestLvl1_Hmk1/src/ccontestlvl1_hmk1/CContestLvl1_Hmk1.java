/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccontestlvl1_hmk1;

import java.util.*;

/**
 *
 * @author Stephie
 */
public class CContestLvl1_Hmk1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angles1 = input.nextInt();
        int angles2 = input.nextInt();
        int angles3 = input.nextInt();
        int Sum = angles1+angles2+angles3;
        if(Sum == 180){
            if(angles1==60 && angles2 == 60 && angles3 == 60){                
                System.out.println("Equilateral");
            }
            else if(angles1 == angles2 || angles1 == angles3){
                System.out.println("Isosceles");                                
            }
            else{
                System.out.println("Scalene");
            }
        }
        else{
            System.out.println("Error");
            if(Sum<180){
                int increase = 180-Sum;
                System.out.println("You should increase your smallest angle by "+increase+" degrees.");
                if(angles1<angles2&&angles1<angles3){
                    int Angles1 = angles1+increase;
                    if(Angles1==60 && angles2 == 60 && angles3 == 60){                
                        System.out.println("Equilateral");
                    }
                    else if(Angles1 == angles2 || Angles1 == angles3){
                        System.out.println("Isosceles: "+Angles1+" "+angles2+" "+angles3);
                        if(Angles1<60){
                            int Diffangles1 = 60-Angles1;
                            System.out.println("Add "+Diffangles1+" degrees to the first angle.");
                        }
                        else if(Angles1>60){
                            int Addangles1 = Angles1-60;
                            System.out.println("Subtract "+Addangles1+" degrees from the first angle.");
                        }
                        else{
                            System.out.println("Don't change the first angle.");
                        }
                        if(angles2<60){
                            int Diffangles2 = 60-angles2;
                            System.out.println("Add "+Diffangles2+" degrees to the second angle.");
                        }
                        else if(angles2>60){
                            int Addangles2 = angles2-60;
                            System.out.println("Subtract "+Addangles2+" degrees from the second angle.");
                        }
                        else{
                            System.out.println("Don't change the second angle.");
                        }
                        if(angles3<60){
                            int Diffangles3 = 60-angles3;
                            System.out.println("Add "+Diffangles3+" degrees to the third angle.");
                        }
                        else if(angles3>60){
                            int Addangles3 = angles3-60;
                            System.out.println("Subtract "+Addangles3+" degrees from the third angle.");
                        }
                        else{
                            System.out.println("Don't change the third angle.");
                        }
                        System.out.println("Equilateral.");
                    }
                    else{
                        System.out.println("Scalene: "+Angles1+" "+angles2+" "+angles3);
                        if(Angles1<60){
                            int Diffangles1 = 60-Angles1;
                            System.out.println("Add "+Diffangles1+" degrees to the first angle.");
                        }
                        else if(Angles1>60){
                            int Addangles1 = Angles1-60;
                            System.out.println("Subtract "+Addangles1+" degrees from the first angle.");
                        }
                        else{
                            System.out.println("Don't change the first angle.");
                        }
                        if(angles2<60){
                            int Diffangles2 = 60-angles2;
                            System.out.println("Add "+Diffangles2+" degrees to the second angle.");
                        }
                        else if(angles2>60){
                            int Addangles2 = angles2-60;
                            System.out.println("Subtract "+Addangles2+" degrees from the second angle.");
                        }
                        else{
                            System.out.println("Don't change the second angle.");
                        }
                        if(angles3<60){
                            int Diffangles3 = 60-angles3;
                            System.out.println("Add "+Diffangles3+" degrees to the third angle.");
                        }
                        else if(angles3>60){
                            int Addangles3 = angles3-60;
                            System.out.println("Subtract "+Addangles3+" degrees from the third angle.");
                        }
                        else{
                            System.out.println("Don't change the third angle.");
                        }
                        System.out.println("Equilateral.");
                    }
                }
                else if(angles2<angles1&&angles2<angles3){
                    int Angles2 = angles2+increase;
                    if(angles1==60 && Angles2 == 60 && angles3 == 60){                
                    System.out.println("Equilateral");
                    }
                    else if(angles1 == Angles2 || angles1 == angles3){
                        System.out.println("Isosceles: "+angles1+" "+Angles2+" "+angles3);
                        if(Angles2<60){
                            int Diffangles2 = 60-Angles2;
                            System.out.println("Add "+Diffangles2+" degrees to the second angle.");
                        }
                        else if(Angles2>60){
                            int Addangles2 = Angles2-60;
                            System.out.println("Subtract "+Addangles2+" degrees from the second angle.");
                        }
                        else{
                            System.out.println("Don't change the second angle.");
                        }
                        if(angles1<60){
                            int Diffangles1 = 60-angles1;
                            System.out.println("Add "+Diffangles1+" degrees to the first angle.");
                        }
                        else if(angles1>60){
                            int Addangles1 = angles1-60;
                            System.out.println("Subtract "+Addangles1+" degrees from the first angle.");
                        }
                        else{
                            System.out.println("Don't change the first angle.");
                        }
                        if(angles3<60){
                            int Diffangles3 = 60-angles3;
                            System.out.println("Add "+Diffangles3+" degrees to the third angle.");
                        }
                        else if(angles3>60){
                            int Addangles3 = angles3-60;
                            System.out.println("Subtract "+Addangles3+" degrees from the third angle.");
                        }
                        else{
                            System.out.println("Don't change the third angle.");
                        }
                        if(angles1==Angles2&&angles1==angles3){
                        System.out.println("Equilateral.");
                        }
                    }
                    else{
                        System.out.println("Scalene: "+angles1+" "+Angles2+" "+angles3);
                        if(Angles2<60){
                            int Diffangles2 = 60-Angles2;
                            System.out.println("Add "+Diffangles2+" degrees to the second angle.");
                        }
                        else if(Angles2>60){
                            int Addangles2 = Angles2-60;
                            System.out.println("Subtract "+Addangles2+" degrees from the second angle.");
                        }
                        else{
                            System.out.println("Don't change the second angle.");
                        }
                        if(angles1<60){
                            int Diffangles1 = 60-angles1;
                            System.out.println("Add "+Diffangles1+" degrees to the first angle.");
                        }
                        else if(angles1>60){
                            int Addangles1 = angles1-60;
                            System.out.println("Subtract "+Addangles1+" degrees from the first angle.");
                        }
                        else{
                            System.out.println("Don't change the first angle.");
                        }
                        if(angles3<60){
                            int Diffangles3 = 60-angles3;
                            System.out.println("Add "+Diffangles3+" degrees to the third angle.");
                        }
                        else if(angles3>60){
                            int Addangles3 = angles3-60;
                            System.out.println("Subtract "+Addangles3+" degrees from the third angle.");
                        }
                        else{
                            System.out.println("Don't change the third angle.");
                        }
                        if(angles1==Angles2&&angles1==angles3){
                        System.out.println("Equilateral.");
                        }
                    }
                }
                else{
                    int Angles3 = angles3+increase;
                    if(angles1==60 && angles2 == 60 && Angles3 == 60){                
                        System.out.println("Equilateral");
                    }
                    else if(angles1 == angles2 || angles1 == Angles3){
                        System.out.println("Isosceles: "+angles1+" "+angles2+" "+Angles3);
                        if(Angles3<60){
                            int Diffangles3 = 60-Angles3;
                            System.out.println("Add "+Diffangles3+" degrees to the third angle.");
                        }
                        else if(Angles3>60){
                            int Addangles3 = Angles3-60;
                            System.out.println("Subtract "+Addangles3+" degrees from the third angle.");
                        }
                        else{
                            System.out.println("Don't change the third angle.");
                        }
                        if(angles1<60){
                            int Diffangles1 = 60-angles1;
                            System.out.println("Add "+Diffangles1+" degrees to the first angle.");
                        }
                        else if(angles1>60){
                            int Addangles1 = angles1-60;
                            System.out.println("Subtract "+Addangles1+" degrees from the first angle.");
                        }
                        else{
                            System.out.println("Don't change the first angle.");
                        }
                        if(angles2<60){
                            int Diffangles2 = 60-angles2;
                            System.out.println("Add "+Diffangles2+" degrees to the second angle.");
                        }
                        else if(angles2>60){
                            int Addangles2 = angles2-60;
                            System.out.println("Subtract "+Addangles2+" degrees from the second angle.");
                        }
                        else{
                            System.out.println("Don't change the second angle.");
                        }
                        if(angles1==Angles3&&angles1==angles2){
                        System.out.println("Equilateral.");
                        }
                    }
                    else{
                        System.out.println("Scalene: "+angles1+" "+angles2+" "+Angles3);
                        if(Angles3<60){
                            int Diffangles3 = 60-Angles3;
                            System.out.println("Add "+Diffangles3+" degrees to the third angle.");
                        }
                        else if(Angles3>60){
                            int Addangles3 = Angles3-60;
                            System.out.println("Subtract "+Addangles3+" degrees from the third angle.");
                        }
                        else{
                            System.out.println("Don't change the third angle.");
                        }
                        if(angles1<60){
                            int Diffangles1 = 60-angles1;
                            System.out.println("Add "+Diffangles1+" degrees to the first angle.");
                        }
                        else if(angles1>60){
                            int Addangles1 = angles1-60;
                            System.out.println("Subtract "+Addangles1+" degrees from the first angle.");
                        }
                        else{
                            System.out.println("Don't change the first angle.");
                        }
                        if(angles2<60){
                            int Diffangles2 = 60-angles2;
                            System.out.println("Add "+Diffangles2+" degrees to the second angle.");
                        }
                        else if(angles2>60){
                            int Addangles2 = angles2-60;
                            System.out.println("Subtract "+Addangles2+" degrees from the second angle.");
                        }
                        else{
                            System.out.println("Don't change the second angle.");
                        }
                        if(angles1==Angles3&&angles1==angles2){
                        System.out.println("Equilateral.");
                        }
                    }
                }
            }
            else{
                int decrease = Sum-180;
                System.out.println("You should decrease your largest angle by "+decrease+" degrees.");
                if(angles1>angles2 && angles1>angles3){
                    int Angles1 = angles1-decrease;
                    if(Angles1==60 && angles2 == 60 && angles3 == 60){                
                        System.out.println("Equilateral");
                    }
                    else if(Angles1 == angles2 || Angles1 == angles3){
                        System.out.println("Isosceles:"+Angles1+" "+angles2+" "+angles3);
                        if(Angles1<60){
                            int Diffangles1 = 60-Angles1;
                            System.out.println("Add "+Diffangles1+" degrees to the first angle.");
                        }
                        else if(Angles1>60){
                            int Addangles1 = Angles1-60;
                            System.out.println("Subtract "+Addangles1+" degrees from the first angle.");
                        }
                        else{
                            System.out.println("Don't change the first angle.");
                        }
                        if(angles2<60){
                            int Diffangles2 = 60-angles2;
                            System.out.println("Add "+Diffangles2+" degrees to the second angle.");
                        }
                        else if(angles2>60){
                            int Addangles2 = angles2-60;
                            System.out.println("Subtract "+Addangles2+" degrees from the second angle.");
                        }
                        else{
                            System.out.println("Don't change the second angle.");
                        }
                        if(angles3<60){
                            int Diffangles3 = 60-angles3;
                            System.out.println("Add "+Diffangles3+" degrees to the third angle.");
                        }
                        else if(angles3>60){
                            int Addangles3 = angles3-60;
                            System.out.println("Subtract "+Addangles3+" degrees from the third angle.");
                        }
                        else{
                            System.out.println("Don't change the third angle.");
                        }
                        System.out.println("Equilateral.");
                    }
                    else{
                        System.out.println("Scalene: "+Angles1+" "+angles2+" "+angles3);
                        if(Angles1<60){
                            int Diffangles1 = 60-Angles1;
                            System.out.println("Add "+Diffangles1+" degrees to the first angle.");
                        }
                        else if(Angles1>60){
                            int Addangles1 = Angles1-60;
                            System.out.println("Subtract "+Addangles1+" degrees from the first angle.");
                        }
                        else{
                            System.out.println("Don't change the first angle.");
                        }
                        if(angles2<60){
                            int Diffangles2 = 60-angles2;
                            System.out.println("Add "+Diffangles2+" degrees to the second angle.");
                        }
                        else if(angles2>60){
                            int Addangles2 = angles2-60;
                            System.out.println("Subtract "+Addangles2+" degrees from the second angle.");
                        }
                        else{
                            System.out.println("Don't change the second angle.");
                        }
                        if(angles3<60){
                            int Diffangles3 = 60-angles3;
                            System.out.println("Add "+Diffangles3+" degrees to the third angle.");
                        }
                        else if(angles3>60){
                            int Addangles3 = angles3-60;
                            System.out.println("Subtract "+Addangles3+" degrees from the third angle.");
                        }
                        else{
                            System.out.println("Don't change the third angle.");
                        }
                        System.out.println("Equilateral.");
                    }
                }
                
                    
                
                else if(angles2>angles1 && angles2>angles3){
                    int Angles2 = angles2-decrease;
                    if(angles1==60 && Angles2 == 60 && angles3 == 60){                
                        System.out.println("Equilateral");
                    }
                    else if(angles1 == Angles2 || angles1 == angles3){
                        System.out.println("Isosceles: "+angles1+" "+Angles2+" "+angles3);
                        if(angles1<60){
                            int Diffangles1 = 60-angles1;
                            System.out.println("Add "+Diffangles1+" degrees to the first angle.");
                        }
                        else if(angles1>60){
                            int Addangles1 = angles1-60;
                            System.out.println("Subtract "+Addangles1+" degrees from the first angle.");
                        }
                        else{
                            System.out.println("Don't change the first angle.");
                        }
                        if(Angles2<60){
                            int Diffangles2 = 60-Angles2;
                            System.out.println("Add "+Diffangles2+" degrees to the second angle.");
                        }
                        else if(Angles2>60){
                            int Addangles2 = Angles2-60;
                            System.out.println("Subtract "+Addangles2+" degrees from the second angle.");
                        }
                        else{
                            System.out.println("Don't change the second angle.");
                        }
                        if(angles3<60){
                            int Diffangles3 = 60-angles3;
                            System.out.println("Add "+Diffangles3+" degrees to the third angle.");
                        }
                        else if(angles3>60){
                            int Addangles3 = angles3-60;
                            System.out.println("Subtract "+Addangles3+" degrees from the third angle.");
                        }
                        else{
                            System.out.println("Don't change the third angle.");
                        }
                        System.out.println("Equilateral.");
                    }
                    else{
                        System.out.println("Scalene: "+angles1+" "+Angles2+" "+angles3);
                        if(angles1<60){
                            int Diffangles1 = 60-angles1;
                            System.out.println("Add "+Diffangles1+" degrees to the first angle.");
                        }
                        else if(angles1>60){
                            int Addangles1 = angles1-60;
                            System.out.println("Subtract "+Addangles1+" degrees from the first angle.");
                        }
                        else{
                            System.out.println("Don't change the first angle.");
                        }
                        if(Angles2<60){
                            int Diffangles2 = 60-Angles2;
                            System.out.println("Add "+Diffangles2+" degrees to the second angle.");
                        }
                        else if(Angles2>60){
                            int Addangles2 = Angles2-60;
                            System.out.println("Subtract "+Addangles2+" degrees from the second angle.");
                        }
                        else{
                            System.out.println("Don't change the second angle.");
                        }
                        if(angles3<60){
                            int Diffangles3 = 60-angles3;
                            System.out.println("Add "+Diffangles3+" degrees to the third angle.");
                        }
                        else if(angles3>60){
                            int Addangles3 = angles3-60;
                            System.out.println("Subtract "+Addangles3+" degrees from the third angle.");
                        }
                        else{
                            System.out.println("Don't change the third angle.");
                        }
                        System.out.println("Equilateral.");
                    }
                }
                else{
                    int Angles3 = angles3-decrease;
                    if(angles1==60 && angles2 == 60 && Angles3 == 60){                
                        System.out.println("Equilateral");
                    }
                    else if(angles1 == angles2 || angles1 == Angles3){
                        System.out.println("Isosceles: "+angles1+" "+angles2+" "+Angles3); 
                        if(angles1<60){
                            int Diffangles1 = 60-angles1;
                            System.out.println("Add "+Diffangles1+" degrees to the first angle.");
                        }
                        else if(angles1>60){
                            int Addangles1 = angles1-60;
                            System.out.println("Subtract "+Addangles1+" degrees from the first angle.");
                        }
                        else{
                            System.out.println("Don't change the first angle.");
                        }
                        if(angles2<60){
                            int Diffangles2 = 60-angles2;
                            System.out.println("Add "+Diffangles2+" degrees to the second angle.");
                        }
                        else if(angles2>60){
                            int Addangles2 = angles2-60;
                            System.out.println("Subtract "+Addangles2+" degrees from the second angle.");
                        }
                        else{
                            System.out.println("Don't change the second angle.");
                        }
                        if(Angles3<60){
                            int Diffangles3 = 60-Angles3;
                            System.out.println("Add "+Diffangles3+" degrees to the third angle.");
                        }
                        else if(Angles3>60){
                            int Addangles3 = Angles3-60;
                            System.out.println("Subtract "+Addangles3+" degrees from the third angle.");
                        }
                        else{
                            System.out.println("Don't change the third angle.");
                        }
                        System.out.println("Equilateral.");
                    }
                    else{
                        System.out.println("Scalene: "+angles1+" "+angles2+" "+Angles3);
                        if(angles1<60){
                            int Diffangles1 = 60-angles1;
                            System.out.println("Add "+Diffangles1+" degrees to the first angle.");
                        }
                        else if(angles1>60){
                            int Addangles1 = angles1-60;
                            System.out.println("Subtract "+Addangles1+" degrees from the first angle.");
                        }
                        else{
                            System.out.println("Don't change the first angle.");
                        }
                        if(angles2<60){
                            int Diffangles2 = 60-angles2;
                            System.out.println("Add "+Diffangles2+" degrees to the second angle.");
                        }
                        else if(angles2>60){
                            int Addangles2 = angles2-60;
                            System.out.println("Subtract "+Addangles2+" degrees from the second angle.");
                        }
                        else{
                            System.out.println("Don't change the second angle.");
                        }
                        if(Angles3<60){
                            int Diffangles3 = 60-Angles3;
                            System.out.println("Add "+Diffangles3+" degrees to the third angle.");
                        }
                        else if(Angles3>60){
                            int Addangles3 = Angles3-60;
                            System.out.println("Subtract "+Addangles3+" degrees from the third angle.");
                        }
                        else{
                            System.out.println("Don't change the third angle.");
                        }
                        System.out.println("Equilateral.");
                    }
                }
            }        
        }    
    }        
}