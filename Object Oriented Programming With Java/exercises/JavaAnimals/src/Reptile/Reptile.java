package Reptile;

import Animal.Animal;

public class Reptile extends Animal {
  private String skinType, bone, eggType;

  public Reptile() {
    this.skinType = "Soft";
    this.bone = "Backbone";
    this.eggType = "Soft Shell";
  }

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

  public void setSkinType(String skinType) {
    this.skinType = skinType;
  }

  public void setBone(String bone) {
    this.bone = bone;
  }

  public void setEggType(String eggType) {
    this.eggType = eggType;
  }
}
