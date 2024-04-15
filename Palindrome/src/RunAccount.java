import java.util.*;

public class RunAccount {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        PassengerAccount passenger = PassengerAccount.createAccount(scan);
        FlightAccount selectedFlight = FlightAccount.assignFlight(scan);
        //Display Account infromation
        System.out.println("*****************************************" +
                "\nPassenger Information:");
        passenger.displayInfo();

        System.out.println("Selected Flight:");
        selectedFlight.displayInfo();

    }
}