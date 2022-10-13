package Reptile;

import Animal.Animal;

public class Reptile extends Animal {
  public String skinType, bone, eggType;

  public Reptile(String skinType, String bone, String eggType, int height, double weight, String animalType,
      String bloodType) {
    super(height, weight, animalType, bloodType);
    this.skinType = skinType;
    this.bone = bone;
    this.eggType = eggType;
  }

  public String getSkinType() {
    return skinType;
  }

  public String getEggType() {
    return eggType;
  }

  public String getBone() {
    return bone;
  }
}
