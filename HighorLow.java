import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        int randomNumber = 0;
        int userInput = 0;
        boolean done = false;


        do {
            System.out.print("Guess an int between 1 and 10: ");
            if (in.hasNextInt())
            {
                userInput = in.nextInt();
                in.nextLine();
                Random random = new Random();
                randomNumber = random.nextInt(10) + 1;
                System.out.println(" The random number is "+ randomNumber);
                if (userInput >= 1 && userInput <= 10) {

                    if (randomNumber == userInput) {
                        System.out.println("Congrats, On the Money");
                        done = true;
                    } else if (userInput >= randomNumber) {
                        System.out.println("You have a higher guess");
                        done = true;
                    } else {
                        System.out.println("Your guess is low");
                        done = true;
                    }
                }
                else
                {
                  System.out.println("Your guess is out of range ");
                }
            }
            else
            {
                System.out.println("Please enter a valid input");
                in.nextLine();
            }
            }
         while (!done);

    }
}
