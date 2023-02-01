package com.cc.java;

public class Cat {

  private String name;
  private String furColor;
  private int age;
  private boolean isFemale;

  
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
    return "This is an inappropriate question!";
  }
}
    

