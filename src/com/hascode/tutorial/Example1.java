package com.hascode.tutorial;

public class Example1 {

  public static void main(String[] args) {
    String in = "three";

    int x = switch (in) {
      case "three" -> 3;
      default -> 0;
    };

    System.out.println(x);
  }
}
