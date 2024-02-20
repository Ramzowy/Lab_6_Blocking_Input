import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double Ctemp = 0;
        double Ftemp = 0;
        boolean done = false;

        do {
            System.out.print("Enter the temperature in Celcius: ");
            if (in.hasNextDouble())
            {
                Ctemp = in.nextDouble();
                in.nextLine();

                Ftemp = (Ctemp * (9.0/5.0)) + 32;
                done = true;
            }
            else
            {
                System.out.println("Please enter a Valid input !");
                in.nextLine();

            }


        }
        while (!done);
        System.out.println("The temperature in F is " + Ftemp);

    }

}