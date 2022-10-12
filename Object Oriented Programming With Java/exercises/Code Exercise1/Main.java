import java.util.*;

/**
 * codeExercise1_1007_RodrigoBonatti
 */
public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter a number: ");

    int number = myObj.nextInt();
    number *= 10;

    System.out.println("Result: " + number);

    myObj.close();
  
  }
}