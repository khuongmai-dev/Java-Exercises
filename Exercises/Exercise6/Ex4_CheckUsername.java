package Exercises.Exercise6;
import java.util.Scanner;
import java.io.File;
/*
* Name: Assignment Module 3 - Exercise 4
* Program: Business Information Technology
* Course: ADEV-1008 Programming 1
* Created: Oct 07, 2021
* Updated:
*/

/**
 * Description: Check username and password from the input
 * @author: Justin Mai
 * @version: 1.0
 */
public class Ex4_CheckUsername {
    /*
    * Main class, where I will execute operations
    */
    public static void main(String[] args)
    {
        // Scanner scanKeyboard = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String userName = scanKeyboard.nextLine();
        // System.out.print("Enter your password: ");
        // String password = scanKeyboard.nextLine();

        // //close Scanner
        // scanKeyboard.close();

        // //Same as Exercise 3. However, using String method .equals to compare 
        // //..2 values of strings as below.
        // if ((userName.equals("admin")) && (password.equals("open")))
        // {
        //     System.out.println("Welcome.");
        // }
        // else if ((userName.equals("admin")) && (!password.equals("open")))
        // {
        //     System.out.println("Wrong password.");
        // }
        // else if ((!userName.equals("admin")) && (password.equals("open")))
        // {
        //     System.out.println("Wrong user ID.");
        // }
        // else
        // {
        //     System.out.println("Sorry, wrong ID and password.");
        // }
    //     String sentence = "";
    //     String word;
    //     Scanner scanKeyboard = new Scanner(System.in);
    //     System.out.print("Enter your word: " + sentence);
    //    word = scanKeyboard.nextLine();
    //     // your code goes here
    //     while ( !word.equals( "end" ) )
    //     {
    //         sentence += word + " ";
    //         word = scanKeyboard.nextLine();
    //     }
    //     System.out.println( "The sentence is " + sentence
    //     );


        // int sum = 0;
        // File filename = new File("D:\text.txt");
        // Scanner fileReader = new Scanner(filename);
        // while(fileReader.hasNextInt())
        // {
        //     int number = fileReader.nextInt();
        //     sum += number;
        //     System.out.println(sum);
        // }
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter your word: ");

        // int number = scan.nextInt();
        // String binary = "";
        // while (number >= 0)
        // {   
        //     number = number / 2;
        //     binary = (number % 2) + binary;
        // }
        // System.out.println("Binary number is " + binary);


        // int i=3;
        // int sum = 6;
        // for (int count =0; count< 8; count++)
        // {
        //     sum +=i;
        // }
        // System.out.println(sum);

            // int i=2;
            // int e=5;
            // int product =1 ;
            // do{
            //     product *=e;
            //     i++;

            // }
            // while (i<4);
            // System.out.println(product);

            Scanner keyboard = new Scanner(System.in);
        int a = 4;
        int i = -1;

        while(i != -1)
        {
            System.out.print("Enter an int > ");
            i = keyboard.nextInt();

            a += i;
        }

        System.out.println(a);

        // int i=0;
        // while(i<3)
        //     System.out.println("Hello");

        // String company;
        // for (int i=0;i<3;i++)
        //     System.out.println("AWE");
    }
}