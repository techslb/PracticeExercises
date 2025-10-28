### Java Exercises
### October 28th 2025
### Platform: Codecademy


### Exercise 1:

public class Store {
  // instance fields
  String productType;
    
  // constructor method
  public Store(String product) {
    productType = product;
  }
    
  // Creating a new method to advertise products
  public void advertise(){
    System.out.println("Come spend some money!");
    System.out.println("Selling " + productType);

  }
    

}


## Exercise 2:

public class Main {
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade");

    // Calling the advertise method from Store.java
    lemonadeStand.advertise();
  }
}


## Exercise 3:

/* 
Store.java class
*/

public class Store {
  // instance fields
  String productType;
    
  // constructor method
  public Store(String product) {
    productType = product;
  }
    
  // advertise method
  public void advertise() {
    String message = "Selling " + productType + "!";
    System.out.println(message);
  }
    
  // greetCustomer() method
  public void greetCustomer(String customerName){
    System.out.println("Welcome to the store, " + customerName + "!");

  }
    
}

/*
Main.java class
*/

public class Main{
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade");
    // calling the greetCustomer() method
    lemonadeStand.greetCustomer("Geralt of Rivia");
    
  }
}

## Exercise 4:

// Store.java

public class Store {
  // instance fields
  String productType;
  public double price;
    
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
    
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice; // instance variable update
      
  }
    
}

// Main.java

public class Main {
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    // calling and outputting the increasePrice method
    lemonadeStand.increasePrice(1.50);
    System.out.println(lemonadeStand.price);
  }
}

## Exercise 5:

// Store.java

public class Store {
  // instance fields
  String productType;
  double price;
  double tax = 0.08;
    
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
    
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
    
  // get price with tax method
  public double getPriceWithTax(){
    double totalPrice = price + price * tax;
    return totalPrice;
  }
}

// Main.java

public class Main {
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);

    // Outputting getPriceWithTax as a variable
    double lemonadePrice = lemonadeStand.getPriceWithTax();
    System.out.println(lemonadePrice);

  }
}

## Exercise 6:

// Store.java

public class Store {
  // instance fields
  public String productType;
  public double price;
    
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }

  // to give our objects meaningful descriptions
  public String toString(){
    return "This store sells " + productType + " at a price of " + price + ".";
  } 
}

// Main.java

public class Main {
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    Store cookieShop = new Store("Cookies", 5);

    // Step 1:
    System.out.println(lemonadeStand);
    System.out.println(cookieShop);
  }
}