package com.cc.java;

public class Cat {

  private String name;
  private String furColor;
  private int age;
  private boolean isFemale;
  private int counter;

  // Constructor:

  public Cat(String name, String furColor, int age, boolean isFemale) {
    this.name = name;
    this.furColor = furColor;
    this.age = age;
    this.isFemale = isFemale;
  }

  public String getStringAttributes(String op) {
    switch (op) {
      case "#name":
        return name;
      case "#color":
        return furColor;
      default:
        return "ERROR!";
    }
  }

  public String getAge() {
    if (isFemale) {
      return checkEscalationLevel();
    } else {
      return String.valueOf(age);
    }
  }

  private String checkEscalationLevel() {

    counter++; //+1
    if (counter > 3) {
      counter = 1;
    }
    switch (counter) {
      case 1:
        return "This is an inappropriate Question!";
      case 2:
        return "I've told you once!";
      case 3:
        return "I've told you twice!";
      case 4:
        return "Talk to the hand!";
      case 5:
        return "1#!*%";
      default:
        return "1#!?&&%";

    }
  }
}
    

