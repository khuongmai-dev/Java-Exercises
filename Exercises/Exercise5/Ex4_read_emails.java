package Exercises.Exercise5;
import java.util.Scanner;
/*
* Name: Module 2 Assignment - Ex4
* Course: ADEV-1008 Programming 1
* Created: Sep 25, 2021
* Updated: -
*/

/**
 * Project: Read an email address and print user name and domain name
 * @author: Justin Mai
 * @version: 1.0
 */
public class Ex4_read_emails
{
    //public static void main(){} is a main method. All of the executions must be doing within {}
    public static void main(String[] args)
    {
        //Instantiate scanKeyboard object and associate the keyboard as its data source input
        Scanner scanKeyboard = new Scanner(System.in);

        //Using print function for the cursor remains after the printed text
        System.out.print("Enter your email address: ");

        //Using method .next() to scan String from input and is assigned its to the variable
        String emailAddress = scanKeyboard.next();

        //Close the Scanner
        scanKeyboard.close();

        //declare a integer indexOfAtSign
        //Find the position of symbols, substrings in the String and assign it to the variable.
        int indexOfAtSign = emailAddress.indexOf("@");

        //Username: extract all characters before the At Sign
        String userName = emailAddress.substring(0, indexOfAtSign);

        //DomainName: extract all characters after the At Sign
        String domainName = emailAddress.substring(indexOfAtSign + 1);

        //Print user name and domain name
        System.out.printf("The username is %s.",userName);
        System.out.printf("\nThe domain is %s.", domainName);
    }
}