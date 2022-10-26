import java.util.*;

import AuxiliarOperations.AuxiliarOperations;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("X====================================================X");
        System.out.println("Welcome to the Card Validator!");
        System.out.print("Please enter the card number: ");

        long creditCardNumber = sc.nextLong();
        AuxiliarOperations auxiliarClass = new AuxiliarOperations();
        auxiliarClass.setCard(creditCardNumber);
        boolean checked = auxiliarClass.Luhn();

        if (checked) {
            auxiliarClass.verificator();
        } else {
            System.out.println("Your credit card " + creditCardNumber + " is INVALID!");
        }

        System.out.println("X====================================================X");

        sc.close();
    }
}
