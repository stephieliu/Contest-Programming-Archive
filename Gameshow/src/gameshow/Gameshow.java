/*
 * Stephie Liu
 * 2022-03-08
 * A text program to simulate Deal or No Deal! There is a timer for tracking how
 * long it takes for the user to finish the game, as well as music/sound effects.
 */
package gameshow;

/**
 *
 * @author steph
 */
//imports for the program
import java.util.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.text.DecimalFormat;
import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class Gameshow {

    //declare the scanner here so that methods can access it
    static Scanner sc = new Scanner(System.in);
    
    //array to store all the cases
    public static double [] cases = {0.01, 1, 5, 10, 25, 50, 75, 100, 200, 300, 400, 
        500, 750, 1000, 5000, 10000, 25000, 50000, 75000, 100000, 200000, 300000, 
        400000, 500000, 750000, 1000000};
    
    //array for resetting the cases array
    public static double [] constant = {0.01, 1, 5, 10, 25, 50, 75, 100, 200, 300, 400, 
        500, 750, 1000, 5000, 10000, 25000, 50000, 75000, 100000, 200000, 300000, 
        400000, 500000, 750000, 1000000};
    
    //tracks the final amount that you obtain
    public static double finalAmount = 0.0;
    
    //tracks the number of cases remaining
    public static int remainingCases = 26;
    
    //tracks whether the banker's offer is accepted or not
    public static boolean acceptedOffer = false;
    
    //decimalformat for formatting money when printing the output
    static DecimalFormat d1 = new DecimalFormat("0.00");
    
    //decimalformat for formatting time when printing the time passed
    static DecimalFormat t1 = new DecimalFormat("0");
    
    //METHOD TO SHUFFLE THE VALUES INSIDE THE CASES
    public static void shuffleCases(double[] arr){
        Random r = new Random();//use the Random class
        for(int i = 0; i<arr.length; i++){
            int swapIndex1 = r.nextInt(arr.length);
            //swaps two array values by assigning one of them to a temp int
            //and then exchanging
            double temp = arr[swapIndex1];
            arr[swapIndex1] = arr[i];
            arr[i] = temp;
        }
    }
    
    //METHOD TO RESET THE CASES VALUES
    public static void resetCases(double [] arr){
        for(int i = 0; i<26; i++){
            cases[i] = constant[i];
        }
    }
    
    //DELAYS OUTPUT FOR A SET AMOUNT OF SECONDS
    //takes long l to determine how long the delay will be (in milliseconds)
    public static void delay(long l){
        try{
            Thread.sleep(l);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
    
    //METHOD CALLED TO PRINT THE CASES
    //cases look like this:
//    |====|
//    [    ] <-- the number related to the case is printed here
//    |====|
    //if the case is already chosen, the value case[i] is set to -1
    public static void printCases(){
        //split the cases like so:
        //1 2 3 4 5 6
        //7 8 9 10 11 12
        //13 14 15 16 17 18
        //19 20 21 22 23 24
        //25 26

        //PRINT THE FIRST FOUR ROWS OF CASES:
        int index = 0;
        for(int i = 0; i<4; i++){
            //top of the cases:
            System.out.println("|====| |====| |====| |====| |====| |====|");
            for(; index<6*(i+1); index++){
                if(cases[index]!=-1 && index<9){//single digit case formatting
                    System.out.print("[  "+(index+1)+" ] ");
                }
                else if (cases[index] != -1 && index >= 9){ //double digit case formatting
                    System.out.print("[ " + (index + 1) + " ] ");
                }
                else if (cases[index] == -1){//formatting if it's already been chosen
                    System.out.print("[    ] ");
                }
            }
            //bottom of the cases:
            System.out.println("\n|====| |====| |====| |====| |====| |====|\n");
        }
        
        //PRINT THE LAST TWO CASES:
        System.out.println("|====| |====|");//top of the cases
        for(int i = 24; i<26; i++){
            if (cases[i] != -1 && i >= 9) { //double digit case formatting
                System.out.print("[ " + (i + 1) + " ] ");
            }
            else if (cases[i] == -1) {//formatting if it's already been chosen
                System.out.print("[    ] ");
            }
        }
        System.out.println("\n|====| |====|");//bottom of the cases
    }
    
    //METHOD USED TO OPEN 5 CASES
    public static void openCases(){
        //ask user for input and try-catch all 5
        System.out.println("Please choose 5 unopened cases, one at a time when prompted.\n");
        //delay for 1s
        delay(1000);
        
        for (int i = 0; i < 5; i++) {
            //display the remaining cases
            System.out.println("Here are the remaining cases:\n");
            printCases();
            
            int choice3 = 0;
            while (true) {
                //delay for 1s so the user can read the messages
                delay(1000);
                System.out.print("\nEnter the number of one of the cases you would like to choose: ");
                String choice4 = sc.nextLine();
                //try catch to make sure the value is proper
                try {
                    choice3 = Integer.parseInt(choice4);
                    //check whether the case has money in it, and is a valid number
                    if (cases[choice3 - 1] == -1 || choice3 < 1 || choice3 > 26) {
                        System.out.println("Please enter a valid case number.");
                    }
                    else {
                        break;
                    }
                }
                catch (NumberFormatException e) { //error shows if the user doesn't enter an integer
                    System.out.println("Please enter an integer.");
                }
                catch (Exception e) {
                    System.out.println("Please enter a valid case number.");
                }
            }
            //delay for 1s so the user can read the messages
            delay(1000);
            System.out.println("You have chosen to open case " + choice3 + ".\n");
            chooseCase(choice3);
            //delay for 1s so the user can read the messages
            delay(1000);
            System.out.println("The money contained in this case is $" + d1.format(cases[choice3 - 1]));
            cases[choice3 - 1] = -1;//set this case to empty
            remainingCases--;//subtract 1 from the remaining cases counter
            
            //let the user choose when to continue
            System.out.print("\n\nPRESS ENTER TO CONTINUE: ");
            String keys = sc.nextLine();
            
            //clear the screen
            clrScreen();
        }
    }
    
    //METHOD TO GIVE AN OFFER FROM THE BANK
    //asks whether the user would like to accept the deal
    public static void banker(){
        //clear the screen
        clrScreen();
        
        System.out.println("You have an offer from the banker!");
        //delay for 1s
        delay(1000);
        
        double offer = offerValue();
        System.out.println("The value is: $"+d1.format(offer));
        //delay for 1s
        delay(1000);
        System.out.println("\nDEAL or NO DEAL?\n");
        
        //try catch for the user's answer
        String ans = "";
        while(true){
            ans = sc.nextLine();
            if(!ans.equals("DEAL") && !ans.equals("NO DEAL")){
                System.out.println("Please enter either DEAL or NO DEAL.\n");
            }
            else break;
        }
        
        //user accepts the deal
        if(ans.equals("DEAL")){
            finalAmount = offer;
            acceptedOffer = true;
        }
    }
    
    //METHOD THAT CALCULATES THE OFFER VALUE
    //the algorithm used is to take the average of the remaining values, then to
    //subtract a random number between (0) and the (average of the values/10)
    public static double offerValue(){
        //calculate the average
        double average = 0.0;
        for(int i = 0; i<26; i++){//take the sum of money remaining first
            if(cases[i]!=-1){
                average+=cases[i];
            }
        }
        average = average/remainingCases;//divide by the counter
        
        //calculate the final offer
        average -= Math.random()*(average/10+1);//subtracts a random value between
        //0 and the average/10, inclusive
        
        return average;
    }
    
    //METHOD FOR CHOOSING A CASE
    //this method prints an image of the case that is chosen
    public static void chooseCase(int choice){
        System.out.println("|====|");//top of the case
        if(choice>9)//one digit formatting
            System.out.println("[ "+choice+" ]");
        else if(choice<10)//two digit formatting
            System.out.println("[  "+choice+" ]");
        System.out.println("|====|\n");//bottom of the case
    }
    
    //METHOD TO PRINT THE RULES & INSTRUCTIONS
    //lets you skip back whenever you want by typing S or s
    public static String printRules(){
        //instructions to play the game
        System.out.println("There are 26 cases, numbered 1 to 26, as shown below.\n");
        printCases();//prints out the cases

        //delay for 2s so the user can go through the messages
        delay(2000);

        System.out.println("\nEach of these cases contains a sum of money,"
                + " ranging from $0.01 to $1000000.\nThese values are randomly sorted "
                + "into the cases at the start of the game.\n\n");

        //delay for 2s so the user can go through the messages
        delay(2000);

        //let the user choose when to continue
        System.out.print("PRESS S TO SKIP BACK TO THE GAME OR ENTER TO CONTINUE: ");
        String keys = sc.nextLine();

        //clear the screen
        clrScreen();
        
        if(keys.equals("S")){
            return "";//return back to the game
        }

        System.out.println("At the start of the game, you will be allowed to "
                + "choose a case at random. You will not know how much "
                + "\nmoney this case contains.\n\nThen, you will open five cases during "
                + "each turn. These cases will display the "
                + "amount they contain.\n");

        //delay for 3s so the user can go through the messages
        delay(3000);

        System.out.println("Throughout the game, you will be offered an amount of money"
                + " to quit. If every single deal is rejected, "
                + "\nthen you keep the amount of money from your original case."
                + "\n\nOtherwise, you may take the amount offered by the banker.");

        //delay for 2s so the user can go through the messages
        delay(2000);

        System.out.println("\nIt is up to you and your luck to make the best decision!"
                + " GOOD LUCK!\n\n");

        //delay for 2s so the user can go through the messages and get ready
        delay(2000);

        //let the user choose when to continue
        System.out.print("PRESS ENTER TO CONTINUE: ");
        keys = sc.nextLine();

        //clear the screen
        clrScreen();
        return "";
    }
    
    //METHOD TO CLEAR THE SCREEN
    public static void clrScreen(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        //MAIN MENU
        int flag = 0;
        while(true){
            //clear the screen
            clrScreen();
            
            //start music
            Sound mySound = new Sound("bkgmusic.wav");//music filename
            mySound.play();
            
            //start the timer
            Stopwatch stopwatch = new Stopwatch();
            stopwatch.start();
            
            //reset the values in the case array
            resetCases(cases);
            
            //reset the value of acceptedOffer, finalAmount and remainingCases
            acceptedOffer = false;
            remainingCases = 26;
            finalAmount = 0.0;

            //title slide & introduction to the game
            System.out.println("==================================================");
            System.out.println("\nWelcome to Deal or No Deal JAVA Ver 4.5.6.7.9.2.0!\n\n");
            System.out.println("OPTIONS:\n\n1) PLAY\n2) QUIT\n");
            System.out.println("==================================================");

            //delay for 1s so the user can see the message
            delay(1000);
            
            //try-catch for the first choice:
            String choice1 = "";
            while(true){
                System.out.print("\nEnter 1 to play or 2 to quit: ");
                choice1 = sc.nextLine();
                try{
                    flag = Integer.parseInt(choice1);//check that it is an integer
                    if(flag==1 || flag == 2)//if the value is 1 or 2, it is a proper value
                        break;
                    else System.out.println("Please enter a valid option.");
                }
                catch(Exception e){
                    System.out.println("Please enter a valid option.");
                }
            }
            
            //exit the game if the user chooses option 2
            if(flag == 2){
                System.out.println("\nGoodbye! Thank you for playing Deal or No Deal!");
                //show the time taken
                System.out.println("\nTime taken: "+t1.format(stopwatch.getElapsedTimeSeconds())+" seconds.");
                break;
            }
            
            //introduction for the game
            System.out.println("\nWhat is your name? ");
            String name = sc.nextLine();

            System.out.println("\nHello, "+name+ "!\n");

            //delay for 1s so the user can see the messages
            delay(1000);
            System.out.println("I am HelloWorld, your host.");
            delay(1000);
            System.out.println("Please pay attention. I will now explain the rules of the game.");
            System.out.println("\n\n");//spacing

            //delay for 1s so the user can see the messages
            delay(1000);
            
            //let the user choose when to continue
            System.out.print("PRESS S TO SKIP OR ENTER TO CONTINUE: ");
            String keys = sc.nextLine();
            
            //clear the screen
            clrScreen();
            
            if(!keys.toUpperCase().equals("S")){//don't skip the instructions
                printRules();
            }
            
            //shuffles the cases at the start of the game
            shuffleCases(cases);

            //allow the user to choose their assigned case
            System.out.println("Let's begin. First, choose a case from"
                    + " the following:\n");
            printCases();

            //delay for 1s so the user can see the cases
            delay(1000);

            //try catch for choosing the case number
            int choice2 = 0;
            while(true){
                System.out.print("\nEnter the case number that you would like to choose: ");
                String temp = sc.nextLine();
                try{
                    choice2 = Integer.parseInt(temp);
                    if (choice2 > 0 && choice2 <27) {//is a valid case number
                        break;//break out of the try catch
                    }
                    else{
                        System.out.println("Please enter a valid case number.");
                        //delay for 1s so the user can see the messages
                        delay(1000);
                    }
                }
                catch(Exception e){
                    System.out.println("Please enter a valid case number.\n");
                    //delay for 1s so the user can see the messages
                    delay(1000);
                }
            }
            System.out.println("You have chosen Case "+choice2 +".\n");
            chooseCase(choice2);//display the case chosen
            //delay for 1s so the user can see the message
            delay(1000);
            
            //let the user choose when to continue
            System.out.print("\nPRESS ENTER TO CONTINUE: ");
            keys = sc.nextLine();
            
            //clear the screen
            clrScreen();
            
            //update the value in case [choice2] to show that it has been chosen
            double myChoice = cases[choice2-1];//contains the value in your case
            cases[choice2-1] = -1;//mark it as empty
            remainingCases--;//subtract 1 from the remaining cases counter
            
            //if there are still more than 0 remaining cases, and the banker's
            //offer has not been accepted then keep opening cases
            while(remainingCases>0 && !acceptedOffer){
                //ask the user to open 5 cases
                openCases();
                
                if(remainingCases==0) break;//no more cases left, don't go to the banker
                
                //take the user to the banker for an offer
                banker();
                
                if(acceptedOffer) break;//if the offer has been accepted
                
                //delay for 1s
                delay(1000);
                
                //clear the screen
                clrScreen();
            }
            
            //final print statements to conclude the game
            //if you have not accepted the banker's deals at all:
            if(!acceptedOffer){
                //delay for 1s
                delay(1000);
                
                //clear the screen
                clrScreen();
                
                //print final messages
                System.out.println("You have not accepted any of the "
                        + "banker's deals. The money that you have won is "
                        + "\nthe amount from your original chosen case.");
                //delay for 1s
                delay(1000);
                System.out.println("\nCongratulations, "+name+"! You have won $"+d1.format(myChoice)+".");
            }
            else{
                //delay for 1s
                delay(1000);
                
                //clear the screen
                clrScreen();
                
                //print final messages
                System.out.println("You have accepted the banker's deal."
                        + " Congratulations, "+name+"! You have won $" + d1.format(finalAmount)+".");
                System.out.println("The value in your original case was $" + d1.format(myChoice)+".");
            }
            
            //print the time taken for the user to finish the game
            System.out.println("\nTime taken: "+t1.format(stopwatch.getElapsedTimeSeconds())+" seconds.\n\n");
            
            //delay for 2s so the user can see the messages
            delay(2000);
            
            //let the user choose when to continue
            System.out.print("PRESS ENTER TO RETURN TO THE MENU: ");
            keys = sc.nextLine();
        }
        //close the scanner after the program is all done
        sc.close();
    }
}

//CLASS STOPWATCH
//class used to track the time it takes for the user to finish the game
class Stopwatch{
    private long startTime;
    public void start(){//starts the stopwatch
        startTime = System.currentTimeMillis();
    }
    public float getElapsedTimeSeconds(){//returns how much time has passed
        return (System.currentTimeMillis()-startTime)/1000f;
    }
}

//CLASS SOUND
//class used to play music in the background
class Sound {
    private URL url;
    private Clip clip;
    public Sound(String requestedSound) {
        url = this.getClass().getResource(requestedSound);
        if (url != null) {
            try {
                // open an audio input stream
                // get a sound clip resource
                // open audio clip and load samples from the audio input stream
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(url);
                clip = AudioSystem.getClip();
                clip.open(audioInput);

            } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
                e.printStackTrace();
            }
        }
    }

    //plays the music
    public void play() {
        clip.setFramePosition(0);
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);//loops the music continuously
    }
}