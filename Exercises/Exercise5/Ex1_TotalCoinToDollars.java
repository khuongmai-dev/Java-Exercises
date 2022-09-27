package Exercises.Exercise5;
import java.util.Scanner;
import java.text.NumberFormat;
import java.lang.Character;
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

//Define a public class named as Ex1
public class Ex1_TotalCoinToDollars
{
    public static void main(String[] args)
    {
        //instantiate scanKeyboard object and associate the keyboard as its data source for input
        Scanner scanKeyboard = new Scanner( System.in);

        //Using print for the cursor remains after the printed text
        System.out.print("Enter the number of quarters: ");

        //Using method nextInt() to scan int number from data input souce and then is assigned 
        // its to the variable numberOfQuarters
        int numberOfQuarters = scanKeyboard.nextInt();

        //For Dimes
        System.out.print("Enter the number of dimes: ");
        int numberOfDimes = scanKeyboard.nextInt();

        //For Nickels
        System.out.print("Enter the number of nickels: ");
        int numberOfNickels = scanKeyboard.nextInt();

        //Close Scanner
        scanKeyboard.close();

        //Consider a Quarter = 25 cents = $0.25; a Dime = 10 cents = $0.1 cents; a nickel = 5 cents = $0.05
        //Total amount money in dollars as calculated below
        //And then calculated value is assigned to a double variable totalOfMoney (decimal number)
        double totalOfMoney = numberOfQuarters*0.25 + numberOfDimes*0.1 + numberOfNickels*0.05;

        //get a NumberFormat object for printing currency
        NumberFormat priceFormat = NumberFormat.getCurrencyInstance();
        
        //Call format method using the NumberFormat object (priceFormat), and then assigned it
        String formattedTotalOfMoney = priceFormat.format(totalOfMoney);

        //Print total of money
        System.out.println("The amount of money is " + formattedTotalOfMoney + ".");
    }
}
