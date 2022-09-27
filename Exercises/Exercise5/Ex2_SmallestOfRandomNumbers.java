package Exercises.Exercise5;
import java.util.Random;
/*
* Name: Module 2 Assignment - Ex1
* Course: ADEV-1008 Programming 1
* Created: 2021-09-23
* Updated: 
*/

/**
 * Project: Three values from the keyboard, respectively, a number of quarters, 
 * dimes, and nickels. Calculate total coin amount to dollars.
 * @author Justin Mai
 * @version 1.0
 */

//Define a public class named as Ex2_SmallestOfRandomNumbers

public class Ex2_SmallestOfRandomNumbers
{
    public static void main(String[] args)
    {
        //Declare objects referece: randomeNumber1 ... 5, and then
        //instantiate the objects by calling a constructor of the class Random()
        //Call method .nextInt to return integer values
        //To specify a range of random values from start number to end number, 
        //using nextInt(end - start + 1) + start.
        int randomNumber1 = new Random().nextInt(100 - 60 + 1) + 60;
        int randomNumber2 = new Random().nextInt(100 - 60 + 1) + 60;
        int randomNumber3 = new Random().nextInt(100 - 60 + 1) + 60;
        int randomNumber4 = new Random().nextInt(100 - 60 + 1) + 60;
        int randomNumber5 = new Random().nextInt(100 - 60 + 1) + 60;

        //Declare objects reference: smallestNumber..
        //Instantiate the objects by calling constructors of the class Math
        //Call method .min compare two integer values, and then is assigned min value to objects
        //Compare min value of the first two numbers, and continue getting min value to compare 
        //to third number... continue to the end of the compared number.
        int smallestNumberFrom1To2 = Math.min(randomNumber1, randomNumber2);
        int smallestNumberFrom1To3 = Math.min(smallestNumberFrom1To2, randomNumber3);
        int smallestNumberFrom1To4 = Math.min(smallestNumberFrom1To3, randomNumber4);
        int smallestNumberFrom1To5 = Math.min(smallestNumberFrom1To4, randomNumber5);

        //Using print format to print 5 random numbers and smallestNumber from number 1 to 5.
        System.out.printf("Random numbers: %d, %d, %d, %d, %d", randomNumber1,randomNumber2,randomNumber3,randomNumber4,randomNumber5);
        System.out.printf("\nThe smallest value is %d.", smallestNumberFrom1To5);
    }
}