package Exercises.Exercise3;

/*
* Name: Module 1 Assignment - Ex3
* Course: ADEV-1008 Programming 1
* Created: 2021-09-09
* Updated:
 */

/**
 * Calculate the average of a given numbers.
 * 
 * @author Khuong(Justin) Mai
 * @version 1.0
 */
// define a public class named as Exercise3
public class Exercise3 {
  // Use Main() as default.
  public static void main(String[] args) {
    // declare the variables as required with integer type
    // declare multiple variables with the same data type integer
    // input varibles are 10, 50, 100.
    int kilograms10 = 10,
        kilograms50 = 50,
        kilograms100 = 100;

    // Use the calculation 1 pound = 1 kilogram multiple with 2.2026431718061673
    // declare variables poundsInKilograms10, poundsInKilograms50,
    // poundsInKilograms50 to hold values after the calculating.
    // on the right side of the calculation, after calculating, use explicit type
    // casting: (dataType) (expression) to convert to the data type specificed.
    // use correct fomula here /0.454
    double poundsInKilograms10 = kilograms10 / 0.454,
        poundsInKilograms50 = kilograms50 / 0.454,
        poundsInKilograms100 = kilograms100 / 0.454;

    // Output of result.
    System.out.println(kilograms10 + " kilograms is " + poundsInKilograms10 + ".");
    System.out.println(kilograms50 + " kilograms is " + poundsInKilograms50 + ".");
    System.out.println(kilograms100 + " kilograms is " + poundsInKilograms100 + ".");
  }
}
