/* Name: Jayden Cruz
# Date: 10/23/2023
# Class: CSC 1120
# Pledge: I have neither given nor received unauthorized aid on this
program.
# Description: The Palindrome Project is a Java program designed to create
a simulated airline account. It allows users to create their passenger accounts by providing their name, birthdate, password, and a PIN.
The entered account information is then stored for future access.
# Input: The user interacts with the program by providing their name, birthdate, password, and PIN during the account
creation process. The user is also prompted to enter a string to check for palindrome status.
# Output: The program displays a welcome message and clear instructions for the user to follow.
It also provides feedback to the user throughout the process, indicating whether their password is a
palindrome or not.
*/

import java.util.*;
import java.util.Stack;

public class PassengerAccount {
    //common attributes
    private String name;
    private String birthdate;
    private String password;
    private int pin;

    //default constructor
    public PassengerAccount() {

    }

    //constructor for creating passenger object with initial attributes
    public PassengerAccount(String name, String birthdate, String password, int pin) {
        this.name = name;
        this.birthdate = birthdate;
        this.password = password;
        this.pin = pin;
    }

    //setter method for pin
    public void setPin(int pin) {
        this.pin = pin;
    }

    //setter method for password
    public void setPassword(String password) {
        this.password = password;
    }

    //setter method for birthday
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    //setter method for name
    public void setName(String name) {
        this.name = name;
    }

    //getter method for birthday
    public String getBirthdate() {
        return birthdate;
    }

    //getter method for password
    public String getPassword() {
        return password;
    }

    //getter method for pin
    public int getPin() {
        return pin;
    }

    //getter method for name
    public String getName() {
        return name;
    }

    //creates passenger account with the input from user
    public static PassengerAccount createAccount(Scanner scanner) {
        System.out.println("\n" + "*****************************************"
                + "\nWelcome to Benito's Private Airline Corporation\n"
                + "*****************************************");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your birthdate (YYYY-MM-DD): ");
        String birthdate = scanner.nextLine();

        System.out.print("Create a password: ");
        String password = scanner.nextLine();

        System.out.print("Create a 4-digit PIN: ");
        int pin = scanner.nextInt();

        if (checkPalindrome(password)) {
            System.out.println("Your password is a palindrome!");
        } else {
            System.out.println("Warning: Your password is not a palindrome;(");
        }

        System.out.println("Account created successfully!");
        return new PassengerAccount(name, birthdate, password, pin);
    }

    //method to display account details including name and birthdate
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Birthdate: " + birthdate);
    }

    //method that checks if the password is a palindrome
    public static boolean checkPalindrome(String isPal) {
        isPal = isPal.toLowerCase();
        Stack<Character> word = new Stack<>();
        for (int i = 0; i < isPal.length(); i++) {
            word.push(isPal.charAt(i));
        }
        for (int i = 0; i < isPal.length(); i++) {
            if (word.pop() != isPal.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

