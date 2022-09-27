
/*
* Name: Module 1 Assignment - Ex1
* Course: ADEV-1008 Programming 1
* Created: 2021-09-09
* Updated:
 */

/**
 * given a sequence of numbers, Output is the square of given numbers.
 * @author Khuong(Justin) Mai
 * @version 1.0
 */

//define a public class named as Exercise1, it has to be the same name as the file name Exercise1.java
public class Exercise1
{
    //public static void main(){} is a main method. All of the executions must be doing within {}
    public static void main(String[] args)
    {
        //declare 9 variables with integer date type and assign to values from 1 to 9 , instead of declaring 9 varibles separately, 
        //I use comma "," between each variable and finishing with semicolon ";" or declare multiple variables of the same data type
        //Place the comment here
        int givenNumber1 = 1,
        givenNumber2 = 2, 
        givenNumber3 = 3,
        givenNumber4 = 4,
        givenNumber5 = 5,
        givenNumber6 = 6,
        givenNumber7 = 7,
        givenNumber8 = 8,
        givenNumber9 = 9;

        //declare varibles to hold values with integer data type and assign variables to the calculating of square of numbers.
        //I can combine with only declaring integer date type one time and use "," between each variable and finishing with ";" or declare multiple variables of the same data type
        int squareOfNumber1 = givenNumber1* givenNumber1, //calculate square of given number 1 and assign to the variable squareOfNumber1 with data type integer
        squareOfNumber2 = givenNumber2 * givenNumber2, //same as above
        squareOfNumber3 = givenNumber3 * givenNumber3,
        squareOfNumber4 = givenNumber4 * givenNumber4,
        squareOfNumber5 = givenNumber5 * givenNumber5,
        squareOfNumber6 = givenNumber6 * givenNumber6,
        squareOfNumber7 = givenNumber7 * givenNumber7,
        squareOfNumber8 = givenNumber8 * givenNumber8,
        squareOfNumber9 = givenNumber9 * givenNumber9;
       int a = (13+6) / 2;
        System.out.println(a);

        //Output of the result. 
        //using built-in method println, print each object within () in each line. 
        //To show the result as the assignment, I use String literals: "The square of", and String concatenation operator with assigned values to variables.
        System.out.println("The square of " + givenNumber1 + " is " + squareOfNumber1 + ".");
        System.out.println("The square of " + givenNumber2 + " is " + squareOfNumber2 + ".");
        System.out.println("The square of " + givenNumber3 + " is " + squareOfNumber3 + ".");
        System.out.println("The square of " + givenNumber4 + " is " + squareOfNumber4 + ".");
        System.out.println("The square of " + givenNumber5 + " is " + squareOfNumber5 + ".");
        System.out.println("The square of " + givenNumber6 + " is " + squareOfNumber6 + ".");
        System.out.println("The square of " + givenNumber7 + " is " + squareOfNumber7 + ".");
        System.out.println("The square of " + givenNumber8 + " is " + squareOfNumber8 + ".");
        System.out.println("The square of " + givenNumber9 + " is " + squareOfNumber9 + ".");
    }
}