
/**
 * Write a description of class numbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Number
{
    public static void printRandomNumber(){
        double randomNum = Math.random();
        System.out.println(randomNum);
    }

    /**Print a random number from 0-9.
     * 
     */
    public static void zeroToNine(){
        double randomNum = Math.random() * 10; //Goes from [0,10) instead of [0,1)
        int randint = (int) randomNum; //Turns it into an int, deleting decimals
        System.out.println(randint);

    }

    public static void oneToTen(){
        int randomNum = (int)(Math.random()* 10 + 1);
        System.out.println(randomNum);
    }

    public static void oneToHundred(){
        int randomNum = (int)(Math.random()*101); //101 refers to the number of possibilities
        System.out.println(randomNum);
    }

    public static void n27to79(){
        int randomNum = (int)(Math.random()*53 + 27);
        System.out.println(randomNum);
    }

    public static void n465to780(){
        // for (start; end; increment){

        //}

        for(int i = 0; i < 17;i++){
            int randomNum = (int)(Math.random()*316 + 465);
            System.out.println(randomNum);
        }
    }
}