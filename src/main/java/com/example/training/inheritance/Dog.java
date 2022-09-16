package com.example.training.inheritance;

import java.awt.*;

public class Dog extends Animal{
  public int id;

  public Dog(String breed, Color color, int age, int id) {
    super(breed, color, age);
    this.id = id;
  }
}
