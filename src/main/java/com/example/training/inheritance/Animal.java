package com.example.training.inheritance;

import java.awt.*;

public class Animal {
  public String breed;
  public Color color;
  public int age;

  public Animal(String breed, Color color, int age) {
    this.breed = breed;
    this.color = color;
    this.age = age;
  }
  public void eat() {
    System.out.println(this.breed + " is eating!");
  }
}
