package Triangle;

import Shape.Shape;

public class Triangle extends Shape {
  public double getArea() {
    return (getHeight() * getWidth()) / 2;
  }
}
