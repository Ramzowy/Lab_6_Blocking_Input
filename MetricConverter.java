import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double meters = 0;
        double miles = 100;
        double feet = 0;
        double inches = 0;
        final double FEET_CONSTANT = 3.28084;
        final double INCHES_CONSTANT = 39.3701;
        final double MILES_CONSTANT = 0.000621371;
        boolean done = false;

        do
        {
          System.out.print("Please enter the metric in meters ");

            if (in.hasNextDouble()) {
                meters = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                System.out.println("Please enter a valid input !");
                in.nextLine();
            }
        } while (!done);

               miles = meters * MILES_CONSTANT;
               feet = meters * FEET_CONSTANT;
               inches = meters * INCHES_CONSTANT;
               System.out.printf("The metric in miles is %1.4f%n" , miles);
               System.out.printf("The metric in feet is %1.4f%n" , feet);
               System.out.printf("The metric in inches is %1.4f", inches);


    }
}
