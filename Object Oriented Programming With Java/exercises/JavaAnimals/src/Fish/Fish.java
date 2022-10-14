package Fish;

import Animal.Animal;

public class Fish extends Animal {
  private boolean liveInWater, hasGills;

  public Fish() {
    this.liveInWater = true;
    this.hasGills = true;
  }

  public Fish(boolean liveInWater, boolean hasGills, int height, double weight, String animalType, String bloodType) {
    super(height, weight, animalType, bloodType);
    this.liveInWater = liveInWater;
    this.hasGills = hasGills;
  }

  public boolean isLiveInWater() {
    return liveInWater;
  }

  public void setLiveInWater(boolean liveInWater) {
    this.liveInWater = liveInWater;
  }

  public boolean isHasGills() {
    return hasGills;
  }

  public void setHasGills(boolean hasGills) {
    this.hasGills = hasGills;
  }
}
