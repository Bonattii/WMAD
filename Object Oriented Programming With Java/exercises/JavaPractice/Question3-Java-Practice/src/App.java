import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String makeUser, modelUser, userDecision;
        int yearsUser;

        record Cars(String make, String model, int year) {
            public Cars(String make, String model, int year) {
                this.make = make;
                this.model = model;
                this.year = year;
            }

            public int getYear() {
                return this.year;
            }
        }

        List<Cars> list1 = new ArrayList<Cars>();

        while (true) {
            System.out.print("Give the car make: ");
            makeUser = sc.next();
            System.out.print("Give the car model: ");
            modelUser = sc.next();
            System.out.print("Give the car year: ");
            yearsUser = sc.nextInt();

            list1.add(new Cars(makeUser, modelUser, yearsUser));

            System.out.print("Did you want to add one more object? (yes - no): ");
            userDecision = sc.next();

            if (userDecision.equals("no")) {
                break;
            }
        }

        // Need to make a new comparator to compare the int year
        // But since int its not a class i need to encapsulate the int into the Integer class
        // Than i was allowed to use the CompareTo to compare the years
        Collections.sort(list1, new Comparator<Cars>() {
            public int compare(Cars o1, Cars o2) {
                Integer i = Integer.valueOf(o1.getYear());
                return i.compareTo(o2.getYear());
            }
        });

        System.out.println(list1);

        sc.close();
    }
}
