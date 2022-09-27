package Exercises.Exercise6;
import java.util.Scanner;

public class Ex5_Check_HTML_Sequence {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");

        // int number = scan.nextInt();
        // String binary = "";
        // while (number > 0)
        // {   
        //     binary = (number % 2) + binary;
        //     number = number / 2;
        // }
        // System.out.println("Binary number is " + binary);


        String input = scan.nextLine();
        int count = 0;
        for (int i=0; i < input.length(); i++)
        {
          char c = input.charAt(i);
          if (c == '<')
            {
                count += 1;
            }
            
          if (c == '>')
            {
                count -= 1;
            }
            
        }
        if (count == 0)
        {
            System.out.println("HTML sequence is correct");
        }
          
        else
          System.out.println("HTML sequence is not correct");
        
    }
}
