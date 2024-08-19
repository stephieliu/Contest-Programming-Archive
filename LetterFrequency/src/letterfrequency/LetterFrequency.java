/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letterfrequency;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.util.Map;
import java.util.HashMap;
public class LetterFrequency {

    public static int LetterFrequency(Map<String, Integer> myMap){
        int maxFreq = 0;
        for(String K : myMap.keySet()){
            if(myMap.get(K)>=maxFreq){
                maxFreq = myMap.get(K);
            }
        }
        return maxFreq;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strsen = input.next();
        String strPunc = ",.;'?//%^&*#@";
        Map<String, Integer>myMap = new HashMap<String, Integer>();
        strsen = strsen.replaceAll(" ", "");
        strsen = strsen.toLowerCase();
        for(int i = 0; i<strsen.length(); i++){
            if(strPunc.indexOf(strsen.charAt(i))<0){
                
            }
        }
//        int max = frequentNumber(myMap);
//        for(String K:myMap.keySet()){
//            
//        }
//        String[] messages = new String [5];
//        int a = 0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0;
//        for(int counter = 0; counter<5; counter++){
//            messages[counter] = input.next();
//        }
//        for(int counter = 0; counter<5; counter++){
//            for(int random=0;random<messages[counter].length();random++){
//                switch (messages[counter].charAt(random)) {
//                    case 'a':
//                    case 'A':
//                        a++;
//                        break;
//                    case 'b':
//                    case 'B':
//                        b++;
//                        break;
//                    case 'c':
//                    case 'C':
//                        c++;
//                        break;
//                    case 'd':
//                    case 'D':
//                        d++;
//                        break;
//                    case 'e':
//                    case 'E':
//                        e++;
//                        break;
//                    case 'f':
//                    case 'F':
//                        f++;
//                        break;
//                    case 'g':
//                    case 'G':
//                        g++;
//                        break;
//                    case 'h':
//                    case 'H':
//                        h++;
//                        break;
//                    case 'i':
//                    case 'I':
//                        i++;
//                        break;
//                    case 'j':
//                    case 'J':
//                        j++;
//                        break;
//                    case 'k':
//                    case 'K':
//                        k++;
//                        break;
//                    case 'l':
//                    case 'L':
//                        l++;
//                        break;
//                    case 'm':
//                    case 'M':
//                        m++;
//                        break;
//                    case 'n':
//                    case 'N':
//                        n++;
//                        break;
//                    case 'o':
//                    case 'O':
//                        o++;
//                        break;
//                    case 'p':
//                    case 'P':
//                        p++;
//                        break;
//                    case 'q':
//                    case 'Q':
//                        q++;
//                        break;
//                    case 'r':
//                    case 'R':
//                        r++;
//                        break;
//                    case 's':
//                    case 'S':
//                        s++;
//                        break;
//                    case 't':
//                    case 'T':
//                        t++;
//                        break;
//                    case 'u':
//                    case 'U':
//                        u++;
//                        break;
//                    case 'v':
//                    case 'V':
//                        v++;
//                        break;
//                    case 'w':
//                    case 'W':
//                        w++;
//                        break;
//                    case 'x':
//                    case 'X':
//                        x++;
//                        break;
//                    case 'y':
//                    case 'Y':
//                        y++;
//                        break;
//                    case 'z':
//                    case 'Z':
//                        z++;
//                        break;
//                    default:
//                        break;
//                }
//            }
//        }
//        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "
//                +j+" "+k+" "+l+" "+m+" "+n+" "+o+" "+p+" "+q+" "+r+" "+s+" "+t+" "
//                +u+" "+v+" "+w+" "+x+" "+y+" "+z);
        
    }
    
}
