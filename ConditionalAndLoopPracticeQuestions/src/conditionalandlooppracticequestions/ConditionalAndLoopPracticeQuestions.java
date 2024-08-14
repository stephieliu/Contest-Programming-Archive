/*
 * =====================
 * Stephie Liu
 * 2022-02-10
 * Programs to answer conditions and loop practice questions
 */
package conditionalandlooppracticequestions;

/**
 *
 * @author steph
 */
import java.util.*;
public class ConditionalAndLoopPracticeQuestions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //BEGINNER:
        //Question 1
//        System.out.println("Please enter 1 to count up, or 2 to count down.");
//        int choice = sc.nextInt();
//        if(choice == 1){
//            for(int i = 1; i<5; i++){
//                System.out.print(i+", ");
//            }
//            System.out.print(5);
//        }
//        else if(choice == 2){
//            for(int i = 5; i>1; i--){
//                System.out.print(i+ ", ");
//            }
//            System.out.print(1);
//        }
        //Question 2
//        System.out.println("Please enter an integer number.");
//        int input = sc.nextInt();
//        if(input == 0) System.out.println("Zero.");
//        else if(input%2 == 0) System.out.println("Even.");
//        else if(input%2 == 1) System.out.println("Odd.");
        
        //Question 3
//        for(int i = 1; i<=100; i+=2){
//            System.out.println(i);
//        }
        
        //INTERMEDIATE:
        //Question 4
//        System.out.println("Please enter 1 for the area of a square, and"
//                + " 2 for the area of a triangle.");
//        int choice = sc.nextInt();
//        if(choice == 1){
//            System.out.println("Please enter the side length.");
//            int side = sc.nextInt();
//            System.out.println(side*side);
//        }
//        else if (choice == 2){
//            System.out.println("Please enter the base and height.");
//            int b = sc.nextInt(), h = sc.nextInt();
//            System.out.println(b*h*0.5);
//        }
        
        //Question 5
//        System.out.println("Please enter a positive integer.");
//        int input = sc.nextInt(), sum = 0;
//        for(int i = 1; i<=input; i++){
//            System.out.println(input);
//            sum+=i;
//        }
//        System.out.println(sum);
        
        //Question 6
//        System.out.println("Odd numbers or even numbers?");
//        String choice = sc.nextLine();
//        if(choice.toLowerCase().equals("odd")){
//            for(int i = 1; i<=100; i+=2){
//                System.out.println(i);
//            }
//        }
//        else if(choice.toLowerCase().equals("even")){
//            for(int i = 2; i<=100; i+=2){
//                System.out.println(i);
//            }
//        }

        //Question 7
//        System.out.println("Odd numbers or even numbers?");
//        String choice = sc.nextLine();
//        System.out.println("What is the starting value?");
//        int start = sc.nextInt();
//        System.out.println("What is the ending value?");
//        int end = sc.nextInt();
//        if(choice.toLowerCase().equals("odd")){
//            int first = Math.min(start, end);
//            int last = Math.max(start, end);
//            if(first%2==0) first+=1;
//            for(int i = first; i<=last; i+=2){
//                System.out.println(i);
//            }
//        }
//        else if(choice.toLowerCase().equals("even")){
//            int first = Math.min(start, end);
//            int last = Math.max(start, end);
//            if(first%2==1) first+=1;
//            for(int i = first; i<=last; i+=2){
//                System.out.println(i);
//            }
//        }
        
        //Question 8
//        Random rand = new Random();
//        int min = 1, max = 10;
//        int random = (int) (Math.floor(Math.random() * (max - min + 1)) + min);
//        boolean correct = false;
//        while(!correct){
//            System.out.println("Guess a number between 1 and 10:");
//            int user = sc.nextInt();
//            if(user>10 || user<1){
//                System.out.println("Invalid guess! Try again.");
//            }
//            else if(user == random){
//                System.out.println("Correct!!");
//                correct = true;
//            }
//            else if(user<random){
//                System.out.println("Higher! Try again.");
//            }
//            else if(user>random){
//                System.out.println("Lower! Try again.");
//            }
//        }
        
        //Question 9
//        System.out.println("Please enter a series of marks between 1 and 100%. "
//                + "Enter 0 to end the series.");
//        int avg = 0, count = 0;
//        for(;;){
//            int mark = sc.nextInt();
//            if(mark==0) break;
//            else if(mark>=50){
//                avg+=mark;
//                count++;
//            }
//        }
//        if(count==0) System.out.println(0);
//        else System.out.println((double)avg/count);

        //ADVANCED:
        //Question 10
//        System.out.println("Please enter a positive integer.");
//        int input = sc.nextInt();
//        boolean isPrime = true;
//        for(int i = 1; i<=Math.sqrt(input); i++){
//            if(input%i == 0 && i != 1){
//                isPrime = false; break;
//            }
//        }
//        if(input == 1) System.out.println("Not prime.");
//        else if(isPrime) System.out.println("Prime.");
//        else System.out.println("Not prime.");
        
        //Question 11
//        System.out.println("Please enter a positive integer.");
//        int input = sc.nextInt();
//        int counter = 1;
//        while(input>1){
//            counter++;
//            if(input%counter==0){
//                System.out.println(counter);
//                input/=counter;
//                counter = 1;
//            }
//        }
        
        //Question 12
        System.out.println("FIBONACCI SEQUENCE\n==================\n"
                + "Please enter a value for x.");
        int x = sc.nextInt();
        int prev1 = 0, prev2 = 1, n = 0;
        for(int i = 2; i<=x; i++){
            n = prev1 + prev2;
            prev1 = prev2;
            prev2 = n;
        }
        if(x == 1) System.out.println(1);
        else System.out.println(n);
        
        sc.close();
    }
    
}
