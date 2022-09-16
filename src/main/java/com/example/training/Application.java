package com.example.training;

import com.example.training.abstraction.Football;
import com.example.training.encapsulation.Person;
import com.example.training.inheritance.Dog;
import com.example.training.polymorphism.Shape;
import com.example.training.polymorphism.Rectangle;

import java.awt.*;

public class Application {
  public static void main(String[] args) {
    //inheritance class
    Dog dog = new Dog("beagle", Color.BLACK, 1, 1);
    dog.eat();

    //encapsulation class
    Person person = new Person();
    person.setAge(22);
    person.setFirstName("John");
    person.setLastName("Doe");
    System.out.println(person.getDisplayName());

    //polymorphism
    Shape shape = new Shape();
    shape.draw();
    Rectangle rectangle = new Rectangle();
    rectangle.draw();
    rectangle.draw("red");
    rectangle.draw("red", "black");

    //abstraction
    Football football = new Football();
    football.play();
  }
}
