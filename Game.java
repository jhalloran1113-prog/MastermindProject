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

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        scan = new Scanner(System.in);
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
    
    public void play(){
        Round round = new Round(scan);
        round.play();
        }
    }

