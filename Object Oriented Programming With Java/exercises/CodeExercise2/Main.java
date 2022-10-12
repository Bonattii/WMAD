class Fruits {
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

public class Main {
  public static void main(String[] args) {
    Fruits apple = new Fruits("apple", "red", true, 1, 0.5, 0.88);
    Fruits banana = new Fruits("banana", "yellow", true, 1, 0.7, 1);

    System.out.println(apple.name);
    System.out.println(banana.name);
    banana.addQuantity();
    banana.addQuantity();
    banana.addQuantity();
    banana.removeQuantity();
    apple.addQuantity();
    apple.addQuantity();
    System.out.println(apple.weigth);
    System.out.println(apple.quantity);
    System.out.println(banana.weigth);
    System.out.println(banana.quantity);
  }
}