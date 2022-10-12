public class App {
    public static void main(String[] args) throws Exception {
        Fruits apple = new Fruits("apple", "red", true, 1, 0.5, 0.88);
        Fruits banana = new Fruits("banana", "yellow", true, 1, 0.7, 1);

        System.out.println(apple.name);
        System.out.println(banana.name);
        banana.addQuantity();
        banana.addQuantity();
        banana.addQuantity();
        banana.removeQuantity();
        apple.addQuantity();
        apple.addQuantity();
        System.out.println(apple.weigth);
        System.out.println(apple.quantity);
        System.out.println(banana.weigth);
        System.out.println(banana.quantity);
    }
}
