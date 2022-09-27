package Exercises.Exercise4;
/*
* Name: Module 1 Assignment - Ex4
* Course: ADEV-1008 Programming 1
* Created: 2021-09-09
* Updated:
 */

/**
 * Calculate the circumference of a circle with a given radius value
 * 
 * @author Khuong(Justin) Mai
 * @version 1.0
 */
// define a public class named as Exercise3
public class Exercise4 {
  // Always use Main() method.
  public static void main(String[] args) {
    // Because the input values are decimal numbers, use double data type.
    double PI = 3.14;
    double radius = 3.2;

    // this is formula of circumference of circle
    double circumferenceOfCircle = radius * 2 * PI;

    // Output of the result
    System.out.println("The circumference of circle with a radius of " + radius + " is " +
        circumferenceOfCircle + ".");
  }
}