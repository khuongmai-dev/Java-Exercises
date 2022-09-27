package Exercises.Exercise6;
import java.util.Scanner;
/*
* Name: Assignment Module 3 - Exercise 3
* Program: Business Information Technology
* Course: ADEV-1008 Programming 1
* Created: Oct 07, 2021
* Updated:
*/

/**
 * Description: Check temperature value and show a result.
 * @author: Justin Mai
 * @version: 1.0
 */
public class Ex3_CheckTempValue {
    /*
    * Main class, where I will execute operations: check input temperature and show a result
    */    public static void main(String[] args)
    {
        Scanner scanKeyboard = new Scanner(System.in);
        System.out.print("Enter a temperature: ");
        int temp = scanKeyboard.nextInt();

        //using if, else if, else to cover all cases as the requirements
        if ((temp >= -5) && (temp < 50))
        {
            System.out.println("The season is winter.");
        }
        else if ((temp >= 50) && (temp < 70))
        {
            System.out.println("The season is fall.");
        }
        else if ((temp >= 70) && (temp < 90))
        {
            System.out.println("The season is spring.");
        }
        else if ((temp >= 90) && (temp <= 110))
        {
            System.out.println("The season is summer.");
        }
        else
        {
            System.out.println("The temperature is out of range.");
        }
    }
}