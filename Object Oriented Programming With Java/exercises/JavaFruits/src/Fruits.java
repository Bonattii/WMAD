package exercises.JavaFruits.src;

public class Fruits {
  public String name, color;
  public boolean isTasty;
  public int quantity;
  public double weigth, price;

  public Fruits(String name, String color, boolean isTasty, int quantity, double weigth, double price) {
    this.name = name;
    this.color = color;
    this.isTasty = isTasty;
    this.quantity = quantity;
    this.weigth = weigth;
    this.price = price;
  }

  public void addQuantity() {
    this.quantity += 1;
    if (this.name == "apple") {
      this.weigth += 0.5;
      this.price += 0.88;
    } else if (this.name == "banana") {
      this.weigth += 0.7;
      this.price += 1;
    }
  }

  public void removeQuantity() {
    this.quantity -= 1;
    if (this.name == "apple") {
      this.weigth -= 0.5;
      this.price -= 0.88;
    } else if (this.name == "banana") {
      this.weigth -= 0.7;
      this.price -= 1;
    }
  }
}