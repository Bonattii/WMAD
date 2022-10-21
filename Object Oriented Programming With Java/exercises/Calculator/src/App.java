import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int userChoice = 0;
        int number1 = 1;
        int number2 = 1;
        int output = 0;

        while (true) {
            try {
                System.out.println("==============================");
                System.out.println("Type 1 : For Adding");
                System.out.println("Type 2 : For Subtraction");
                System.out.println("Type 3 : For Division");
                System.out.println("==============================");
                System.out.println("PLease enter a choice : ");
                userChoice = sc.nextInt(); // Waiting for a user to enter the input

                System.out.println("Please enter First number : ");
                number1 = sc.nextInt();

                System.out.println("Please enter Second number : ");
                number2 = sc.nextInt();

                if (userChoice == 1) {
                    output = number1 + number2;
                } else if (userChoice == 2) {
                    output = number1 - number2;
                } else if (userChoice == 3) {
                    output = number1 / number2;
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a number which is valid meaning integer");
            } catch (IllegalStateException e) {
                System.out.println("Sorry, scanner is closed now");
            } catch (ArithmeticException e) {
                System.out.println("You cannot divide a number by 0");
            } catch (Exception e) {
                System.out.println("Something Went Wrong Sorry");
            } finally {
                System.out.println("Your final output is: " + output);
            }

            System.out.print("Do you want to use the calculator again? (yes - no) ");
            String userChoiceContinue = sc.next();

            if (userChoiceContinue.equals("no")) {
                break;
            }
        }
        sc.close();
        System.out.println("Thank you for choosing the calculator, BYE BYE!");
    }
}
