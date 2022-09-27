package Exercises.Exercise6;
import java.util.Scanner;
/*
* Name: Assignment Module 3 - Exercise 1
* Program: Business Information Technology
* Course: ADEV-1008 Programming 1
* Created: Oct 07, 2021
* Updated:
*/

/**
 * Description: Check a valid web address from entered input by the user
 * @author: Justin Mai
 * @version: 1.0
 */
public class Ex1_CheckWebAddress {
    /*
    * Main class, where I will execute operations: prompt text, print the web address typed,
    * and show the output whether it is from gov, edu, com, org
    */
    public static void main(String[] args)
    {

        //instantiate scanKeyboard and associate the keyboard as its data for input
        Scanner scanKeyboard = new Scanner(System.in);

        //Using print for the cursor remains after the printed text
        System.out.print("Enter a web address: ");
        
        //Using .nextLine to scan string from data input source and assign to a string variable.
        String webAddress = scanKeyboard.nextLine();

        //instantiate a boolean variable
        boolean isFound;

        //using .indexOf method to locate location of name domain.
        //and then compared to value -1, if it's not equal -1 
        // => .gov or .com or .edu or .org exist =>isFound = true
        //Otherwise, go to next else if/ else
        if (isFound = webAddress.indexOf(".gov") != -1 ? true: false)
        {          
            System.out.println("You entered a government web address.");
        }
        else if (isFound = webAddress.indexOf(".edu") != -1 ? true: false)
        {
            System.out.println("You entered an university web address.");
        }
        else if (isFound = webAddress.indexOf(".com") != -1 ? true: false)
        {
            System.out.println("You entered a business web address.");
        }
        else if (isFound = webAddress.indexOf(".org") != -1 ? true: false)
        {
            System.out.println("You entered an organization web address.");
        }
        else
        {
            System.out.println("The web address is for another entity.");
        }       
    }
}