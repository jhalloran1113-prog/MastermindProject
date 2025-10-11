import java.util.Scanner;
/**
 * Write a description of class Round here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Round
{
    // instance variables - replace the example below with your own
    private int secret;
    private int numGuesses;
    private boolean win;
    private boolean quit;
    private Scanner scan;

    /**
     * Constructor for objects of class Round
     */
    public Round(Scanner s)
    {
        // initialise instance variables
        secret = 12345;
        numGuesses = 0;
        win = false;
        quit = false;
        scan = s;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getSecret()
    {
        // put your code here
        return secret;
    }
    public int getNumGuesses(){
        return numGuesses;
    }
    public boolean getWin(){
        return win;
    }
    public boolean getQuit(){
        return quit;
    }
    public Scanner getScan(){
        return scan;
    }
    
    private int askForGuess(){
        System.out.println("Enter your guess or type -1 to quit");
        int guess = scan.nextInt();
        scan.nextLine();
        
        if (guess == -1){
            quit = true;
        } else {
            numGuesses++;
        }
        return guess;
    }
    
    private void checkWin(int g){
        if (g == secret){
            win = true;
        }           
    }
        
    public void play(){
        while (!win && !quit){
            int guess = askForGuess();
            System.out.println("You guessed " + guess);
            checkWin(guess);
        }
        if (win){
            System.out.println("You win! You guessed the number in " + numGuesses + " guesses");
        } else if (quit){
            System.out.println("You quit after " + numGuesses +" guesses");
        }
    }
    }
    

