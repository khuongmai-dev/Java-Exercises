import java.util.*;
/*
 * Name: Justin Mai
 * Program: Business Information Technology
 * Course: ADEV-1008 Programming 1
 * Created: November 10, 2021
 * Updated: December 6, 2021
 */

/**
 * Team Shot On Goal Percentages class
 * @author Justin Mai
 * @version 1.0
 */
public class TeamShotOnGoalPercentages
{
    //declare array double variable percentages
    private double[] percentages;

    //declare consistent integer given number number of top players
    private final int NUMBER_TOP_PLAYER = 5;

    /**
     * Overloaded Constructor:
     * @param int numberOfPlayers
     * set the size of percentages array with given param
     */
    public TeamShotOnGoalPercentages(int numberOfPlayers)
    {
        this.percentages = new double[numberOfPlayers];
    }

    /**
     * Overloaded Constructor:
     * @param double[] percentages
     * allow clients to @set begining values for percentages array
     */
    public TeamShotOnGoalPercentages(double[] percentages)
    {
        this.percentages = copyPercentages(percentages);
    }

    /**
     * Copy method
     * @param double[] percentagesToCopy
     * @return a copy of the specified array
     */
    public double[] copyPercentages(double[] percentagesToCopy)
    {
        //declare a new double array called percentagesCopy
        //the size equal to the length of double array percentagesToCopy given
        double[] percentagesCopy = new double[percentagesToCopy.length];

        //using for loop to run values from 0 to the end of given array percentagesToCopy
        for (int i = 0; i < percentagesToCopy.length;i++)
        {

            //assign the value of each index from percentagesToCopy array given to new array
            percentagesCopy[i] = percentagesToCopy[i];
        }

        //@return to new double array PercentagesCopy
        return percentagesCopy;
    }

     /**
     * accessor method
     * get percentage
     * @return current values of double array percentages
     */
    public double[] getPercentages()
    {
        return copyPercentages(percentages);
    }

     /**
     * mutator method
     * allow client to set values of double array percentages
     */
    public void setPercentages(double[] percentages)
    {
        this.percentages = copyPercentages(percentages);
    }

    /**
     * accessor method
     * @return a new array containing the values of the percentages array
     * sorted in descending order
     */
    public double[] getSortedPercentages()
    {
        double[] copyPercentage = copyPercentages(this.percentages);
        //declare a temporary double temp and assign it to 0
        double temp = 0;

        //for loop run i variable from index 0 to the end of given array percentages
        for (int i = 0; i< copyPercentage.length; i++)
        {
            //for loop run j variable from index i+1 to the end of given array percentages
            for (int j = i+1; j < copyPercentage.length; j++)
            {
                //condition: compare two values of index i and j
                //if value of index i < j and then swap the value
                if(copyPercentage[i] < copyPercentage[j])
                {
                    temp = copyPercentage[i];
                    copyPercentage[i] = copyPercentage[j];
                    copyPercentage[j] = temp;
                }
            }
        }

        //@return new array percentages with descending order
        return copyPercentage;
    }
    /**
     * accessor method method
     * @return the value of the player
     * with the lowest percentage in the specified array
     */
    public double getLowestPercentage(double[] percentages)
    {

        //declare a double variable lowestPercentage and assign it
        //to the value of index 0 of array percentages
        double lowestPercentage = percentages[0];

        //using for loop running from index i = 1 to the end of the array
        for (int i = 0; i < percentages.length; i++)
        {
            //condition: if the index of i less than the varible lowestPercentage
            if(percentages[i] < lowestPercentage)
            {
                //and then assign lowestPercentage to the value of index i in percentages array
                lowestPercentage = percentages[i];
            }
        }

        // @return the lowest value of array percentages
        return lowestPercentage;
    }

    /**
     * accessor method
     * @param double[] percentages
     * @return the mean average of percentages for the top players on the team
     * The five players with the highest percentages
     */
    public double getAverageOfTopPlayers()
    {
        //declare a double variable sum and assign it to 0
        double sum = 0;

        //declare a new double array sortedPercentages and
        //assign to a sorted array with @param percentages
        double[] sortedPercentages = copyPercentages(percentages);

        int consideredNumber = NUMBER_TOP_PLAYER;

        if (sortedPercentages.length < consideredNumber) {
            consideredNumber = sortedPercentages.length;
        }
        //using for loop to get first five values
        for(int i=0;i< consideredNumber;i++)
        {
            //sum of 5 values from highest to lowest
            sum+= sortedPercentages[i];
        }

        //delare a double variable averageOfTopPlayers and assign it to formula
        //average = sum of top player's shot on goal percentages ÷ number of top players
        double averageOfTopPlayers = sum/ consideredNumber;

        //@return value of averageOfTopPlayers
        return averageOfTopPlayers;
    }

    /**
     * toString() method
     * @return the String representation of the class
     */
    public String toString()
    {
        //Create a StringBuilder object using StringBuilder() constructor
        StringBuilder builder = new StringBuilder();

        //add String lines as the requirement
        builder.append("--------------------\n");
        builder.append("Player        SOG% \n");
        builder.append("--------------------\n");

        //using for loop to print all Players (index i) and percentages of indexes of array double percentages
        for(int i=0; i < percentages.length; i++)
        {

            //add "---------------" and "\n" to print seperated line
            builder.append(i + "---------------"+ String.format("%.6f", percentages[i]) +"\n");
        }

        //print String
        return builder.toString();
    }

}