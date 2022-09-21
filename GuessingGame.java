import java.util.Scanner;
import java.util.Random;

public class GuessingGame
{
    public static void main(String[] args)
    {
        boolean correctGuess = false;
        int guess, increment = 0;
        int randomNum;
        String name;
        Scanner input = new Scanner(System.in);

        System.out.println("Hello User! What is your name? ");
        name = input.nextLine();

        System.out.print("Hello " +name + "! I am thinking of a number between 1 and 100\n");
        System.out.print("Try guessing my number! ");

        Random random = new Random();
        randomNum = random.nextInt(100); //100 limits the numbers to 100

        while(correctGuess == false)
        {
            increment++;

            try
            {
                guess = input.nextInt();
            }
            catch(Exception e)
            {
                int badInput = input.nextInt();
                System.out.println(badInput + " is not an integer");
                continue;
            }

            if ((guess < 1 || guess > 100))
                System.out.println("Your guess is out of range. Please try again");
            else if(guess > randomNum)
                System.out.println("Your guess is too high. Please try again");
            else if (guess < randomNum)
                System.out.println("Your guess is too low. Please try again");
            else
            {
                System.out.println("Well done! You found my number in " + increment + " tries!");
                correctGuess = true;
            }

        }
    }
}
