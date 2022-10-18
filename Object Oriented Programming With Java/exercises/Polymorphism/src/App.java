import Triangle.Triangle;
import Rectangle.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        Rectangle rec = new Rectangle();
        rec.setHeight(2);
        rec.setWidth(2);

        Triangle tr = new Triangle();
        tr.setHeight(4);
        tr.setWidth(4);

        System.out.println(rec.getArea());
        System.out.println(tr.getArea());
    }
}
