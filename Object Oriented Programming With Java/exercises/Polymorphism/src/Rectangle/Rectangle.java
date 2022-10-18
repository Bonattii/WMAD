package Rectangle;

import Shape.Shape;

public class Rectangle extends Shape {
  public double getArea() {
    return getHeight() * getWidth();
  }
}
