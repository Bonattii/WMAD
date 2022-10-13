package Birds;

import Animal.Animal;

public class Birds extends Animal {
  public boolean hasFeathers, canFly;

  public Birds(boolean hasFeathers, boolean canFly, int height, double weight, String animalType, String bloodType) {
    super(height, weight, animalType, bloodType);
    this.hasFeathers = hasFeathers;
    this.canFly = canFly;
  }
}
