import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<Integer>();
        boolean isNumberOnArray = false;
        int upperbound = 51;
        int arraySize = 10;

        for (int i = 0; i <= arraySize; i++) {
            list1.add(rand.nextInt(upperbound));
        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.println("Value on position " + i + " is " + list1.get(i));
        }

        System.out.print("Please give a integer: ");
        int userInput = sc.nextInt();

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == userInput) {
                isNumberOnArray = true;
                break;
            }
        }

        if (isNumberOnArray == true) {
            System.out.println("The number is on the arrayList!");
        } else {
            System.out.println("The number is not on the arrayList");
        }

        sc.close();
    }
}
