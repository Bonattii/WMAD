package Crocodile;

import Reptile.Reptile;

public class Crocodile extends Reptile {
  private boolean hardShelledEggs;

  public Crocodile() {
    this.hardShelledEggs = true;
  }

  public Crocodile(boolean hardShelledEggs, String skinType, String bone, String eggType, int height, double weight,
      String animalType,
      String bloodType) {
    super(skinType, bone, eggType, height, weight, animalType, bloodType);
    this.hardShelledEggs = hardShelledEggs;
  }

  public boolean getHardShelledEggs() {
    return hardShelledEggs;
  }

  public void setHardShelledEggs(boolean hardShelledEggs) {
    this.hardShelledEggs = hardShelledEggs;
  }
}
