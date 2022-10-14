package Birds;

import Animal.Animal;

public class Birds extends Animal {
  private boolean hasFeathers, canFly;

  public Birds() {
    this.hasFeathers = true;
    this.canFly = true;
  }

  public Birds(boolean hasFeathers, boolean canFly, int height, double weight, String animalType, String bloodType) {
    super(height, weight, animalType, bloodType);
    this.hasFeathers = hasFeathers;
    this.canFly = canFly;
  }

  public boolean isHasFeathers() {
    return hasFeathers;
  }

  public void setHasFeathers(boolean hasFeathers) {
    this.hasFeathers = hasFeathers;
  }

  public boolean isCanFly() {
    return canFly;
  }

  public void setCanFly(boolean canFly) {
    this.canFly = canFly;
  }
}
