import java.util.Scanner;

public class FuelCosts{

public static void main (String[] args){
    Scanner in = new Scanner(System.in);

    double gallon = 0;
    double fuelEfficiency = 0;
    double pricePerGallon = 0;
    double costperMiles = 0;
    double travelMiles = 0;
    boolean done = false;
               // number of gallons
                do {
                    System.out.print("Plese enter the number of gallons in the tank: ");

                    if (in.hasNextDouble())
                    {
                        gallon = in.nextDouble();
                        in.nextLine();

                        done = true;
                    }
                    else
                    {
                        System.out.println("Please enter a valid input!");
                        in.nextLine();

                    }


                }
                while (!done);

                // Fuel efficiency
                            done = false;
                        do {
                            System.out.print("Please enter the fuel efficieny ");

                            if (in.hasNextDouble()) {
                                fuelEfficiency = in.nextDouble();
                                in.nextLine();
                                done = true;
                            }
                            else
                            {
                                System.out.println("Please enter a valid input !");
                                in.nextLine();

                            }

                        } while (!done);

//                        // The price of gas per gallon
                          done = false;
                           do {
                               System.out.print("Please enter the price of gas per gallon ");

                               if (in.hasNextDouble()) {
                                   pricePerGallon = in.nextDouble();
                                   in.nextLine();
                                   done = true;
                               }
                               else
                               {
                                System.out.println("Please enter a valid input !");
                                in.nextLine();
                               }


                           } while (!done);
                           // The cost per 100 miles
                             costperMiles = (pricePerGallon/fuelEfficiency) * 100;
                             travelMiles = gallon * fuelEfficiency;

                             System.out.printf("The cost per 100 miles is %4.2f%n " ,costperMiles);
                             System.out.println("The car can travel " + travelMiles + " miles");


























      }

}
