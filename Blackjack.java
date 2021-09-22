
/**
 * Write a description of class Blackjack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
import java.util.Scanner;
public class Blackjack
{
    public static void draw(){
        int randomNum1 = (int)(Math.random()* 8 + 2);
        int randomNum2 = (int)(Math.random()* 8 + 2);
        int theirnum1 = (int)(Math.random()* 8 + 2);
        int theirnum2 = (int)(Math.random()* 8 + 2);
        int totalHand = randomNum1 + randomNum2;
        int theirTotal = theirnum1 + theirnum2;
        Scanner hand = new Scanner(System.in);
        System.out.println("Welcome to blackjack. Get 21 or a higher number than the server's hand to win.");
        System.out.println("Your hand is: " + randomNum1 + " and " + randomNum2 + " (" + totalHand + ")");
        System.out.println("The server's hand is: " + theirnum1 + " and ???");
        System.out.println("Hit or Stay?");
        String choice = hand.next();
        while (choice.equals("hit") || choice.equals("HIT") || choice.equals("Hit")){
            randomNum2 = (int)(Math.random()* 8 + 2);
            totalHand += randomNum2;
            System.out.println("You got a " + randomNum2 + " (" + totalHand + ")");
            if (totalHand > 21) {
                System.out.println("On no! You got busted. The server win!");
                break;
            } else if (totalHand == 21) {
                System.out.println("You got 21! You win!");
                break;
            } else {
                System.out.println("Hit or Stay?");;
                String verdict = hand.next();
                choice = verdict;
            }
        }
        if (choice.equals("stay") || choice.equals("STAY") || choice.equals("Stay")){
            System.out.println("The server's hand is actually: " + theirnum1 + " and " + theirnum2 + " (" + theirTotal + ")");
        }
        while (choice.equals("stay") || choice.equals("STAY") || choice.equals("Stay")){
            theirnum2 = (int)(Math.random()* 8 + 2);
            theirTotal += theirnum2;
            System.out.println("They got a " + theirnum2 + " (" + theirTotal + ")");
            if (theirTotal > 21) {
                System.out.println("On no! They got busted. You win!");
                break;
            } else if (theirTotal == 21) {
                System.out.println("They got 21! The server win!");
                break;
            } else if (theirTotal >= 17){
                if (totalHand == theirTotal){
                    System.out.println("It's a draw. Nobody win.");
                    break;
                } else if (totalHand > theirTotal){
                    System.out.println("You win!");
                    break;
                } else {
                    System.out.println("The server win. You lost.");
                    break;
                }
            } else {
                System.out.println("The server draws again.");
            }
        }
    }
}
