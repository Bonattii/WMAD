import java.util.*;

import AuxiliarOperations.AuxiliarOperations;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Initialize an scanner and ask the user the card number
        System.out.println("X====================================================X");
        System.out.println("Welcome to the Card Validator!");
        System.out.print("Please enter the card number: ");

        long creditCardNumber = sc.nextLong();
        // Create an AuxiliarOperations object
        AuxiliarOperations auxiliarClass = new AuxiliarOperations();
        // Set the value of the card on auxiliarClass to the cardNumber
        auxiliarClass.setCard(creditCardNumber);
        // Will check if the number is valid
        boolean checked = auxiliarClass.Luhn();

        // If it is valid will call the verificator method to verify which brand is the
        // card
        if (checked) {
            auxiliarClass.verificator();
        } else {
            System.out.println("Your credit card " + creditCardNumber + " is INVALID!");
        }

        System.out.println("X====================================================X");

        // Just close the scanner to deal with memory
        sc.close();
    }
}
