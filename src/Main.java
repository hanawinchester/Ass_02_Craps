import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        String playAgain = "Y";

        do {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;
            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 7)
            {
                System.out.println("Die1 value is " + die1 + ". Die2 value is " + die2 + ". The sum is " + crapsRoll + ". \nCraps! You lost, game over.");
            }
            else if (crapsRoll == 7 || crapsRoll == 11)
            {
                System.out.println("Die1 value is " + die1 + ". Die2 value is " + die2 + ". The sum is " + crapsRoll + ". \nNatural, You won!");
            }
            else
            {
                int crapsRoll1 = 0;
                int thePoint = crapsRoll;
                System.out.println("Die1 value is " + die1 + ". Die2 value is " + die2 + ". The sum is " + crapsRoll + ".");
                System.out.println("Trying again for point.");
                while (thePoint != crapsRoll1 || thePoint != 7)
                {
                    int die01 = rnd.nextInt(6) + 1;
                    int die02 = rnd.nextInt(6) + 1;
                    crapsRoll1 = die01 + die02;

                    System.out.println("\nNew roll sum = " + crapsRoll1);
                    if (crapsRoll1 != 7)
                    {
                    System.out.println("Trying for point.");
                    }

                    if (crapsRoll1 == 7)
                    {
                        System.out.println("Die1 value is " + die01 + ". Die2 value is " + die02 + ". The sum is " + crapsRoll1 + ". \nSorry, you lose.");
                        break;
                    }
                    else if (crapsRoll1 == thePoint)
                    {
                        System.out.println("Die1 value is " + die01 + ". Die2 value is " + die02 + ". The sum is " + crapsRoll1 + ". That is equal to " + thePoint + " (The Point) \nYou win!");
                        break;
                    }
                }
            }
            Scanner in = new Scanner (System.in);
            System.out.print("Play again? (Y or N): ");
            playAgain = in.nextLine();

        } while (playAgain.equalsIgnoreCase("Y"));
    }
}