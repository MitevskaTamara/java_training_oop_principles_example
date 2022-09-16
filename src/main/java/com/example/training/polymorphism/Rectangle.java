package com.example.training.polymorphism;

public class Rectangle extends Shape {
  public Rectangle(){}

  @Override
  public void draw() {
    System.out.println("Drawing rectangle....");
  }

  public void draw(String backgroundColor) {
    System.out.println("Drawing " + backgroundColor + " rectangle....");
  }

  public void draw(String backgroundColor, String borderColor) {
    System.out.println("Drawing " + backgroundColor + " rectangle with " + borderColor + " borders....");
  }
}
