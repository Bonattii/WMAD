package Animal;

public class Animal {
  public int height;
  public double weight;
  public String animalType, bloodType;

  public Animal(int height, double weight, String animalType, String bloodType) {
    this.height = height;
    this.weight = weight;
    this.animalType = animalType;
    this.bloodType = bloodType;
  }

  public String getAnimalType() {
    return animalType;
  }

  public String getBloodType() {
    return bloodType;
  }

  public int getHeight() {
    return height;
  }

  public double getWeight() {
    return weight;
  }
}
