import java.util.*;
import Sum.Sum;
import Sub.Sub;
import Div.Div;
import Times.Times;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Please enter the second number: ");
        double number2 = sc.nextDouble();

        System.out.print("Please enter the type of the operation(sum - sub - times - div): ");
        String operation = sc.next();

        if (operation == "sum") {
            Sum sm = new Sum();
            sm.setNum1(number1);
            sm.setNum2(number2);
            double result = sm.calc();
            System.out.printf("The result is: %.2f", result);
        } else if (operation == "sub") {
            Sub sb = new Sub();
            sb.setNum1(number1);
            sb.setNum2(number2);
            double result = sb.calc();
            System.out.printf("The result is: %.2f", result);
        } else if (operation == "div") {
            Div dv = new Div();
            dv.setNum1(number1);
            dv.setNum2(number2);
            double result = dv.calc();
            System.out.printf("The result is: %.2f", result);
        } else if (operation == "times") {
            Times ti = new Times();
            ti.setNum1(number1);
            ti.setNum2(number2);
            double result = ti.calc();
            System.out.printf("The result is: %.2f", result);
        }

        sc.close();
    }
}
