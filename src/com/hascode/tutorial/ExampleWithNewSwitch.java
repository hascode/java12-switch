package com.hascode.tutorial;


import static com.hascode.tutorial.ExampleWithNewSwitch.Month.*;

public class ExampleWithNewSwitch {
  enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
  }

  public static void main(String[] args) {
    System.out.printf("%s is winter: %b%n", DECEMBER, isWinter(DECEMBER));
    System.out.printf("%s is winter: %b%n", AUGUST, isWinter(AUGUST));
    System.out.printf("%s is winter: %b%n", NOVEMBER, isWinter(NOVEMBER));
    System.out.printf("%s is winter: %b%n", JUNE, isWinter(JUNE));
  }

  static boolean isWinter(Month month){
    return switch(month){
      case NOVEMBER, DECEMBER, JANUARY -> true;
      default -> false;
    };
  }
}
