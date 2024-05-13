package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // Creating products
    Product product1 = new Product("Milk", 25.0, 4);
    Product product2 = new Product("Bread", 10.0, 5);
    Product product3 = new Product("Apples", 30.0, 4);

    // Creating categories
    Category groceries = new Category("Groceries");
    groceries.products.add(product1);
    groceries.products.add(product2);

    Category fruits = new Category("Fruits");
    fruits.products.add(product3);

    // Creating a user
    User user1 = new User("armin", "password");

    // Saving product information to a file
    List<Product> allProducts = new ArrayList<>();
    allProducts.add(product1);
    allProducts.add(product2);
    allProducts.add(product3);

    saveToFile(allProducts);
  }

  public static void saveToFile(List<Product> products) {
    try {
      FileWriter writer = new FileWriter("products.txt");
      for (Product product : products) {
        writer.write("Name: " + product.name + ", Price: " + product.price + ", Rating: " + product.rating + "\n");
      }
      writer.close();
      System.out.println("Product information saved to products.txt file");
    } catch (IOException e) {
      System.out.println("Error writing to file: " + e.getMessage());
    }
  }
}