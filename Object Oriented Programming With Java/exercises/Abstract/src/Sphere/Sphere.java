package Sphere;

import Schape.Schape;

public class Sphere extends Schape {
  public double getVolume() {
    return (4 / 3) * Math.PI * Math.pow(getRadius(), 3);
  }
}
