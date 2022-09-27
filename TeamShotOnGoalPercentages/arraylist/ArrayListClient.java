import java.util.ArrayList;
import java.util.Scanner;

/*
 * Name: Justin Mai
 * Program: Business Information Technology
 * Course: ADEV-1008 Programming 1
 * Created: November 10, 2021
 * Updated: December 6, 2021
 */

 /**
 * The client application with ArrayList
 * @author Justin Mai
 * @version 1.0
 */
public class ArrayListClient
{

    //initialize int variable = 3, which equal to three Team Shot On Goal Percentages objects
    public static int PERCENTAGE_NUMBER = 3;
    public static void main (String[] args) {
        //1
        //Create a Array List object named percentagesList
        ArrayList<TeamShotOnGoalPercentages> percentagesList = new ArrayList<>();

        //2
        //Instantiate keyboard and associated it as its data for input
        Scanner keyboard = new Scanner (System.in);

        //Using print for the cursor remains after the printed text
        System.out.println("Enter the number of players per team: ");

        //Using .nextInt to scan integer from data input source and assign to a int variable
        int numberOfPlayers = keyboard.nextInt();

        /**
         * 3.
         * Using two for loops
         * Outer loop to add three team of players to percentagesList
         * Inner loop to add random values from 0 - 0.99 to the percentages double array variable.
        */
        for (int i = 0; i < PERCENTAGE_NUMBER; i++) 
        {
            //create a double array with the length = the number of player input
            double[] percentages = new double[numberOfPlayers];
            
            //for loop run through array and assigned each index with each random value.
            for (int j = 0; j < numberOfPlayers; j ++) 
            {
                double percentage = Math.random();
                System.out.println(String.format("Random number" + i + ": %.2f", percentage));
                percentages[j] = percentage;
            }

            //Create a object of the class Team Shot on Goal Percentagse with constructor TeamShotOnGoalPercentages(percentages)
            //Para percentages
            TeamShotOnGoalPercentages teamPercentages = new TeamShotOnGoalPercentages(percentages);

            //Add double arrays to an array list percentagesList
            percentagesList.add(teamPercentages);
        }

        //4
        //Use the enhanced for loop run double arrays in the array List
        System.out.println("#4 - print each of the TeamShotOnGoalPercentages objects");
        for (TeamShotOnGoalPercentages teamPercentages : percentagesList) 
        {
            //print each object by using toString() to the console
            System.out.println(teamPercentages.toString());
            System.out.println();
        }

        //5
        System.out.println("#5 -  Print the value of the final element in the ArrayList under the heading");
        System.out.println("LAST ELEMENT BEFORE REMOVE");

        //Create an object named lastPercent and assign it to the last element of percentagesList
        //size() - 1 = last element, get() to get the value of the last element
        TeamShotOnGoalPercentages lastPercent = percentagesList.get(percentagesList.size()-1);

        //print lastPercent object
        System.out.println(lastPercent.toString());

        //6. Remove final object from Array list
        //size() - 1 = last elementm remove() to remove the last elemetn
        percentagesList.remove(percentagesList.size()-1);

        //7
        System.out.println("#7 -  Print a line containing the following text: “LAST ELEMENT AFTER REMOVE");
        System.out.println("LAST ELEMENT AFTER REM");

        // //Create an object named lastPercent2 and assign it to the last element of percentagesList
        TeamShotOnGoalPercentages lastPercent2 = percentagesList.get(percentagesList.size()-1);

        //print lastPercent2 object
        System.out.println(lastPercent2.toString());
    }
}