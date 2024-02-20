import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double length = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        boolean done = false;
            // Asking for the width.
        do {
            System.out.print("Please enter the width ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                System.out.println("Please enter a valid input !");
                in.nextLine();
            }
        } while (!done);
        // Asking for the lenghth.
              done = false;
        do {
            System.out.print("Please enter the length ");
            if (in.hasNextDouble()) {
                length = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
              System.out.println("Please enter a valid input !");
              in.nextLine();
            }

        } while (!done);


           area = length * width;
           perimeter = ((2*length) + (2*width));
           length = Math.pow(length,2);
           width = Math.pow(width,2);
           diagonal = Math.sqrt(length + width);
           System.out.println("The area of the rectangle is " + area);
           System.out.println("The perimeter of the rectangle is  " + perimeter );
           System.out.println("The diagonal of the rectangle is " + diagonal);


























    }
}
