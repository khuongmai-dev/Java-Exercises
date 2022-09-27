package Exercises.Exercise5;
import java.text.NumberFormat;
import java.util.Scanner;
/*
* Name: Module 2 Assignment - Ex3
* Course: ADEV-1008 Programming 1
* Created: 2021-09-24
* Updated: -
*/

/**
 * Project: Calculate future value of the investment - Ex3
 * @author: Justin Mai
 * @version: 1.0
 */
public class Ex3_Future_Investment
{
    //public static void main(){} is a main method. All of the executions must be doing within {}
    public static void main(String[] args)
    {
        //Instantiate scanKeyboard object and associate the keyboard as its data source input
        Scanner scanKeyboard = new Scanner(System.in);

        //Using print function for the cursor remains after the printed text
        System.out.print("Enter the investment amount: ");

        //Using method .nextDouble() to scan double number from data input source
        //and then is assigned its to amountOfInvestment variable.
        double amountOfInvestment = scanKeyboard.nextDouble();

        //Same for Interest Rate, prompt text for users to input the Interest Rate,
        // and then after users Entered, invoke scanKeyboard to save input value to interestRate in double data type.
        System.out.print("Enter the annual interest rate: ");
        double interestRate = scanKeyboard.nextDouble();

        //use close() method to close this Scanner.
        scanKeyboard.close();

        //Use class Math and method .pow(a, b) = a^b, with b = number of years
        //And then are assigned to double variables to calculate Interest Rate for 5, 10, 20 years.
        double interestRate5Years = Math.pow(1 + interestRate, 5);
        double interestRate10Years = Math.pow(1 + interestRate, 10);
        double interestRate20Years = Math.pow(1 + interestRate, 20);

        //Calculate futureValue of 5, 10, 20 years by taking amountOfInvestMetn multiple with Interest Rate
        double futureValueAfter5Years = amountOfInvestment * interestRate5Years;
        double futureValueAfter10Years = amountOfInvestment * interestRate10Years;
        double futureValueAfter20Years = amountOfInvestment * interestRate20Years;

        //get a NumberFormat object for printing currency
        NumberFormat priceFormat = NumberFormat.getCurrencyInstance();

        //Print Future value after 5, 10, 20 years
        System.out.printf("The future value after 5 years is %s.", priceFormat.format(futureValueAfter5Years));
        System.out.printf("\nThe future value after 10 years is %s.", priceFormat.format(futureValueAfter10Years));
        System.out.printf("\nThe future value after 20 years is %s.", priceFormat.format(futureValueAfter20Years));
    }
}
