package Animal;

public class Animal {
  private int height;
  private double weight;
  private String animalType, bloodType;

  public Animal() {
    this.height = 0;
    this.weight = 0;
    this.animalType = "Unknown";
    this.bloodType = "Unknown";
  }

  public Animal(int height, double weight, String animalType, String bloodType) {
    this.height = height;
    this.weight = weight;
    this.animalType = animalType;
    this.bloodType = bloodType;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public String getBloodType() {
    return bloodType;
  }

  public void setBloodType(String bloodType) {
    this.bloodType = bloodType;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}
