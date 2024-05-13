package org.example;

import java.util.ArrayList;
import java.util.List;

class Category {
  String name;
  List<Product> products;

  public Category(String name) {
    this.name = name;
    this.products = new ArrayList<>();
  }
}
