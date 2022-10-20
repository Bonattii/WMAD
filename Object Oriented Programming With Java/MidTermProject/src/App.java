import java.util.*;
import Sum.Sum;
import Sub.Sub;
import Div.Div;
import Times.Times;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double number1, number2, result;

        System.out.print("Please enter the first number: ");
        while (!sc.hasNextDouble()) {
            System.out.println("That's not a number!");
            sc.next();
        }
        number1 = sc.nextDouble();

        System.out.print("Please enter the second number: ");
        while (!sc.hasNextDouble()) {
            System.out.println("That's not a number!");
            sc.next();
        }
        number2 = sc.nextDouble();

        System.out.print("Please enter the type of the operation(sum - sub - times - div): ");
        String operation = sc.next();

        switch (operation) {
            case "sum":
                Sum sm = new Sum();
                sm.setNum1(number1);
                sm.setNum2(number2);
                result = sm.calc();
                System.out.printf("The result is: %.2f", result);
                break;
            case "sub":
                Sub sb = new Sub();
                sb.setNum1(number1);
                sb.setNum2(number2);
                result = sb.calc();
                System.out.printf("The result is: %.2f", result);
                break;
            case "times":
                Times ti = new Times();
                ti.setNum1(number1);
                ti.setNum2(number2);
                result = ti.calc();
                System.out.printf("The result is: %.2f", result);
                break;
            case "div":
                if (number2 == 0) {
                    System.out.println("Impossible to divide one number per 0");
                    break;
                }
                Div dv = new Div();
                dv.setNum1(number1);
                dv.setNum2(number2);
                result = dv.calc();
                System.out.printf("The result is: %.2f", result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

        sc.close();
    }
}
