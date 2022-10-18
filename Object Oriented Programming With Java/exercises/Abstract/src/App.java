import Cylinder.Cylinder;
import Sphere.Sphere;

public class App {
    public static void main(String[] args) throws Exception {
        Cylinder cy = new Cylinder();
        Sphere sp = new Sphere();

        cy.setHeight(2);
        cy.setRadius(5);

        sp.setRadius(10);

        System.out.println(cy.getVolume());
        System.out.println(sp.getVolume());
    }
}
