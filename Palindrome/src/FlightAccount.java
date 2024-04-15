import java.util.*;

public class FlightAccount extends PassengerAccount {
    //common attributes

    private String origin;
    private String departureTime;
    private String destination;
    private String returnTime;
    private double price;

    //default constructor
    public FlightAccount() {

    }

    //constructor for creating passenger object with initial attributes
    public FlightAccount(String origin, String departureTime, String destination, String returnTime, double price) {
        this.origin = origin;
        this.departureTime = departureTime;
        this.destination = destination;
        this.returnTime = returnTime;
        this.price = price;
    }


    //gives and assigns flight options
    public static FlightAccount assignFlight(Scanner scanner) {
        System.out.println("*****************************************"
                + "\nAvailable Flights:");
        FlightAccount flight1 = new FlightAccount("JFK", "2023-10-25 12:00", "LAX", "2023-10-28 14:00", 600.0);
        FlightAccount flight2 = new FlightAccount("BNA", "2023-10-26 14:30", "JFK", "2023-10-29 16:30", 1200.0);
        FlightAccount flight3 = new FlightAccount("LAX", "2023-10-27 17:40", "BNA", "2023-10-23 19:40", 2000.0);
        System.out.println("Flight 1" + ": " + flight1);
        System.out.println("Flight 2" + ": " + flight2);
        System.out.println("Flight 3" + ": " + flight3);


        System.out.print("Select a flight (enter the flight number): ");

        int choice;
        try {
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Flight assigned successfully!");
                return flight1;
            } else if (choice == 2) {
                System.out.println("Flight assigned successfully!");
                return flight2;
            } else if (choice == 3) {
                System.out.println("Flight assigned successfully!");
                return flight3;
            } else {
                System.out.println("Invalid choice. Please select a valid flight.");
                return assignFlight(scanner);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid flight number.");
            return assignFlight(scanner);
        }
    }

    //display method
    public void displayInfo() {
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Return Time: " + returnTime);
        System.out.println("Price: $" + price);
    }
}


