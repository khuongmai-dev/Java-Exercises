package Exercises.Exercise2;
/*
* Name: Module 1 Assignment - Ex2
* Course: ADEV-1008 Programming 1
* Created: 2021-09-09
* Updated:
 */

/**
 * Calculate the average of a given numbers
 * @author Khuong(Justin) Mai
 * @version 1.0
 */
//define a public class named as Exercise2
public class Exercise2 {
    //Main() method 
    public static void main(String[] args)
    {
        //declare the variables as required with integer type
        //declare multiple variables with the same data type integer
        //first number as described in Sample Output.
        int firstNumner = 1,
        //second number as described in Sample Output.
        secondNumber = 7, 
        //third number as described in Sample Output.
        thirdNumber = 9, 
        //fourth number as described in Sample Output.
        fourthNumber = 34; 

        //declare a variable averageNumber with data type double because the output showed 12.75, which is decimal number.
        //the right side of the calculation. I calculate average number by total of 4 numbers, and then divide by 4  as the average result
        //Because the calculation in integer type, and I use explicit type casting: (dataType) (expression). The expression will be converted to the data type specified.
        double averageNumber = (firstNumner + secondNumber + thirdNumber + fourthNumber) / 4.0;

        //Output of result.
        //Using method println, with String concatenation operator along with variables to show the same as Sample Output.
        System.out.println("The average of the values " + firstNumner + ", " + secondNumber + ", " + 
                            thirdNumber + ", " + fourthNumber + " is " + averageNumber + ".");
    }
}
