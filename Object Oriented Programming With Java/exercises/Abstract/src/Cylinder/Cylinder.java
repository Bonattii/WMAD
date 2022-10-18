package Cylinder;

import Schape.Schape;

public class Cylinder extends Schape {
  public double getVolume() {
    return Math.PI * Math.pow(getRadius(), 2) * getHeight();
  }
}
