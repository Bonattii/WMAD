package Fish;

import Animal.Animal;

public class Fish extends Animal {
  public boolean liveInWater, hasGills;

  public Fish(boolean liveInWater, boolean hasGills, int height, double weight, String animalType, String bloodType) {
    super(height, weight, animalType, bloodType);
    this.liveInWater = liveInWater;
    this.hasGills = hasGills;
  }
}
