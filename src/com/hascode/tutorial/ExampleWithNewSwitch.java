package com.hascode.tutorial;

import static com.hascode.tutorial.Example2.Month.AUGUST;
import static com.hascode.tutorial.Example2.Month.DECEMBER;
import static com.hascode.tutorial.Example2.Month.JUNE;
import static com.hascode.tutorial.Example2.Month.NOVEMBER;

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
    boolean winter = false;
    switch(month){
      case NOVEMBER:
        winter = true;
        break;
      case DECEMBER:
        winter = true;
        break;
      case JANUARY:
        winter = true;
        break;
      default:

    }

    return winter;
  }
}
