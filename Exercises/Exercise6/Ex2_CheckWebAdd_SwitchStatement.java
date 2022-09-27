package Exercises.Exercise6;
import java.util.Scanner;
/*
* Name: Assignment Module 3 - Exercise 2
* Program: Business Information Technology
* Course: ADEV-1008 Programming 1
* Created: Oct 07, 2021
* Updated:
*/

/**
 * Description: Check a valid web address from entered input by the user using switch statement
 * @author: Justin Mai
 * @version: 1.0
 */
public class Ex2_CheckWebAdd_SwitchStatement {
    /*
    * Main class, where I will execute operations: prompt text, print the web address typed,
    * and show the output whether it is from gov or edu or com or org
    */
    public static void main(String[] args)
    {
        //instantiate scanKeyboard and associate the keyboard as its data for input
        Scanner scanKeyboard = new Scanner(System.in);

        //Using print for the cursor remains after the printed text
        System.out.print("Enter a web address: ");

        //Using .nextLine to scan string from data input source and assign to a string variable.
        String webAddress = scanKeyboard.nextLine();
        
        //using .lastIndexOf to locate location of "." and assign to an int variable.
        int indexOfDot = webAddress.lastIndexOf(".");

        //cut the string after "."
        String domain = webAddress.substring(indexOfDot + 1);

        //Using switch statement compare with the value of sub string
        switch (domain)
        {
            case "gov":
                System.out.println("You entered a government web address.");
            break;
            case "edu":
                System.out.println("You entered an university web address.");
            break;
            case "com":
                System.out.println("You entered a business web address.");
            break;
            case "org":
                System.out.println("You entered an organization web address.");
            break;    
            default:
                System.out.println("The web address is for another entity.");
        }           
    }
}