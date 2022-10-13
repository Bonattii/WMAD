package Eel;

import Fish.Fish;

public class Eel extends Fish {
  public boolean releaseEletricCharge;

  public Eel(boolean releaseEletricCharge, boolean liveInWater, boolean hasGills, int height, double weight,
      String animalType, String bloodType) {
    super(liveInWater, hasGills, height, weight, animalType, bloodType);
    this.releaseEletricCharge = releaseEletricCharge;
  }

  public boolean getReleaseEletricCharge() {
    return releaseEletricCharge;
  }

  public void showInfo() {
    System.out.println(releaseEletricCharge + "-" + liveInWater + "-" + hasGills + "-" + height + "-" + weight + "-"
        + animalType + "-" + bloodType);
  }
}
