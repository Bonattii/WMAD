import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>(10);
        int upperbound = 51;
        int arraySize = 10;

        for (int i = 0; i <= arraySize; i++) {
            list1.add(rand.nextInt(upperbound));
        }

        for (int i = 0; i < list1.size(); i++) {
            list2.add(list1.get(i));
        }

        int arrayLastPosition = list1.size() - 1;
        list1.set(arrayLastPosition, -5);

        System.out.println(list1);
        System.out.println(list2);
    }
}
