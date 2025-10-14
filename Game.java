import java.util.Scanner;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private Scanner scan;
    private int numGuesses;
    private int numRoundsWon;
    private boolean quitGame;

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        scan = new Scanner(System.in);
        numGuesses = 0;
        numRoundsWon = 0;
        quitGame = false;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Game(Scanner s)
    {
        // put your code here
        scan = s;
    }
    
    public Scanner getScan(){
        return scan;
    }
    
    public int getNumGuesses(){
        return numGuesses;
    }
    
    public int getNumRoundsWon(){
        return numRoundsWon;
    }
    
    public boolean getQuitGame(){
        return quitGame;
    }
    
    public void play(){
        while (!quitGame){
            Round round = new Round(scan);
            round.play();
            if(round.getWin()){
                numGuesses += round.getNumGuesses();
                numRoundsWon++;
            }
            playAgain();
        }
        System.out.println("Thanks for playing");
        System.out.println("Rounds Won: " + numRoundsWon);
        System.out.println("Average Guesses: " + getAverage());
        }
        
    private void playAgain(){
        System.out.println("Do you want to play again? Type y or n");
        String response = scan.next();
        if (response.equals("n")){
            quitGame = true;
        }
        
    }
    
    private double getAverage(){
        double avg = 0.0;
        if (numRoundsWon > 0){
            avg = (double) numGuesses / numRoundsWon;
        }
        return avg;
    } 
    
    
    }

