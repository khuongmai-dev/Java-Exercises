/*
 * Name: Justin Mai
 * Program: Business Information Technology
 * Course: ADEV-1008 Programming 1
 * Created: November 10, 2021
 * Updated: December 6, 2021
 */

/**
 * The client application
 * @author Justin Mai
 * @version 1.0
 */
public class TeamShotOnGoalPercentageTest 
{
     /**
     * Result of the tests
     */
    public static void main(String[] args)
    {
        //Invoke method of test 1
        TeamShotOnGoalPercentagesTest1 ();

        //Invoke method of test 2
        TeamShotOnGoalPercentagesTest2 ();

        //Invoke method of test 3
        copyPercentages();

        //Invoke method of test 4
        setPercentages();

        //Invoke method of test 5
        getSortedPercentages();

        //Invoke method of test 6
        getLowestPercentage();

        //Invoke method of test 7
        getAverageOfTopPlayersGreaterThan5();

        //Invoke method of test 8
        getAverageOfTopPlayersLessThan5();

        //Invoke method of test 9
        getStringRepresentation();
    }

    //Setup of the tests

    /**
     * Test 1 
     * Initialize percentages array without data.
     */
    static void TeamShotOnGoalPercentagesTest1 ()
    {
        //Create a TeamShotOnGoalPercentages object using TeamShotOnGoalPercentages(double[] percentages) constructor
        TeamShotOnGoalPercentages teamShotOnGoalPercentage = new TeamShotOnGoalPercentages(4);
        System.out.println("Test #1 - Initialize percentages array without data.");
        System.out.println("<Expect>");
        System.out.println("--------------------\nPlayer\t\tSOG%\n--------------------\n0---------------0.000000\n1---------------0.000000\n2---------------0.000000\n3---------------0.000000");
        System.out.println("<Actual>");

        //call method toString() to print Players (index) and percentages (values) of array double percentage
        System.out.println(teamShotOnGoalPercentage.toString());
    }

    /**
     * Test 2 
     * Initialize percentages array with data.
     */
    static void TeamShotOnGoalPercentagesTest2()
    {
        //initialized a double array with its values
        double[] example = new double[] {1.5,2.4,1.0,4.3,7.9,8.2,9.4,0.5,7.9};

        //Create a TeamShotOnGoalPercentages object using TeamShotOnGoalPercentages(double[] percentages) constructor
        TeamShotOnGoalPercentages teamShotOnGoalPercentage = new TeamShotOnGoalPercentages(example);   
        System.out.println("Test #2 - Initialize percentages array with data.");
        System.out.println("<Expect>");
        System.out.println("--------------------\nPlayer\t\tSOG%\n--------------------\n0---------------1.500000\n1---------------2.400000\n2---------------1.000000\n3---------------4.300000\n4---------------7.900000\n5---------------8.200000\n6---------------9.400000\n7---------------0.500000\n8---------------7.900000");
        System.out.println("<Actual>");

        //call method toString() to print Players (index) and percentages (values) of array double percentage
        System.out.println(teamShotOnGoalPercentage.toString());
    }

    /**
     * Test 3
     * Returns a copy of the array used to initialize the object.
     */
    static void copyPercentages()
    {
        //initialized a double array with its values
        double[] example = new double[] {1.5,2.4,1.0,4.3,7.9,8.2,9.4,0.5,7.9};

        //Create a TeamShotOnGoalPercentages object using TeamShotOnGoalPercentages(double[] percentages) constructor
        TeamShotOnGoalPercentages teamShotOnGoalPercentage = new TeamShotOnGoalPercentages(example);

        //call method copyPercentages(double[] percentagesToCopy) with @parameter example array
        teamShotOnGoalPercentage.copyPercentages(example);
        System.out.println("Test #3 - Returns a copy of the array used to initialize the object..");
        System.out.println("<Expect>");
        System.out.println("--------------------\nPlayer\t\tSOG%\n--------------------\n0---------------1.500000\n1---------------2.400000\n2---------------1.000000\n3---------------4.300000\n4---------------7.900000\n5---------------8.200000\n6---------------9.400000\n7---------------0.500000\n8---------------7.900000");
        System.out.println("<Actual>");

        //call method toString() to print Players (index) and percentages (values) of array double percentage
        System.out.println(teamShotOnGoalPercentage.toString());
    }

    /**
     * Test 4
     * Updates the state of the percentages.
     */
    static void setPercentages()
    {
        //initialized a double array with its values
        double[] example = new double[] {1.5,2.4,1.0,4.3,7.9,8.2,9.4,0.5,7.9};

        //Create a TeamShotOnGoalPercentages object using TeamShotOnGoalPercentages(double[] percentages) constructor
        TeamShotOnGoalPercentages teamShotOnGoalPercentage = new TeamShotOnGoalPercentages(example);
        
        //initialized another double array with its values
        double[] newPercentages = new double[] {1.3,1.5};

        //call mutator method setPercentages(double[] percentages) with @para is newPercentages
        teamShotOnGoalPercentage.setPercentages(newPercentages);
        System.out.println("Test #4 - Updates the state of the percentages.");
        System.out.println("<Expect>");
        System.out.println("--------------------\nPlayer\t\tSOG%\n--------------------\n0---------------1.300000\n1---------------1.500000");
        System.out.println("<Actual>");

        //call method toString() to print Players (index) and percentages (values) of array double percentage variable
        System.out.println(teamShotOnGoalPercentage.toString());
    }

    /**
     * Test 5
     * Returns a copy of the percentages array sorted in descending order.
     */
    static void getSortedPercentages()
    {
        //initialized a double array with its values
        double[] example = new double[] {1.5,2.4,1.0,4.3,7.9,8.2,9.4,0.5,7.9};

        //Create a TeamShotOnGoalPercentages object using TeamShotOnGoalPercentages(double[] percentages) constructor
        TeamShotOnGoalPercentages teamShotOnGoalPercentage = new TeamShotOnGoalPercentages(example);

        //call method getSortedPercentages()
        teamShotOnGoalPercentage.getSortedPercentages();

        System.out.println("Test #5 - Returns a copy of the percentages array sorted in descending order.");
        System.out.println("<Expect>");
        System.out.println("--------------------\nPlayer\t\tSOG%\n--------------------\n0---------------9.400000\n1---------------8.200000\n2---------------7.900000\n3---------------7.900000\n4---------------4.300000\n5---------------2.400000\n6---------------1.500000\n7---------------1.000000\n8---------------0.500000");
        System.out.println("<Actual>");

         //call method toString() to print Players (index) and percentages (values) of array double percentage variable
        System.out.println(teamShotOnGoalPercentage.toString());
    }

    /**
     * Test 6 
     * Returns the correct lowest percentage value
     */
    static void getLowestPercentage()
    {
        //initialized a double array with its values
        double[] example = new double[] {1.5,2.4,1.0,4.3,7.9,8.2,9.4,0.5,7.9};

        //Create a TeamShotOnGoalPercentages object using TeamShotOnGoalPercentages(double[] percentages) constructor
        TeamShotOnGoalPercentages teamShotOnGoalPercentage = new TeamShotOnGoalPercentages(example);

        //call method getLowestPercentage
        double lowestPercentage = teamShotOnGoalPercentage.getLowestPercentage(example);
        System.out.println("Test #6 - Returns the correct lowest percentage value.");
        System.out.println("<Expect>");
        System.out.println("0.5");
        System.out.println("<Actual>");

        //print lowestPercentage
        System.out.println(lowestPercentage);
    }

    /**
     * Test 7
     * Returns the correct average of the top five players where the number of players is greater than 5.
     */
    static void getAverageOfTopPlayersGreaterThan5()
    {
        //initialized a double array with its values
        double[] example = new double[] {1.5,2.4,1.0,4.3,7.9,8.2,9.4,0.5,7.9};

        //Create a TeamShotOnGoalPercentage object using TeamShotOnGoalPercentages(double[] percentages) constructor
        TeamShotOnGoalPercentages teamShotOnGoalPercentage = new TeamShotOnGoalPercentages(example);
        System.out.println("Test #7 - Returns the correct average of the top five players where the number of players is greater than 5.");
        System.out.println("<Expect>");
        System.out.println("3.420000");
        System.out.println("<Actual>");

        //print the average of top players with method getAverageOfTopPlayers()
        System.out.println(String.format("%.6f", teamShotOnGoalPercentage.getAverageOfTopPlayers()));
    }

    /**
     * Test 8
     * Returns the correct average of the top five players where the number of players is less than 5..
     */
    static void getAverageOfTopPlayersLessThan5()
    {
        //initialized a double array with its values
        double[] example = new double[] {1.5,2.4,1.0};

        //Create a TeamShotOnGoalPercentage object using TeamShotOnGoalPercentages(double[] percentages) constructor
        TeamShotOnGoalPercentages teamShotOnGoalPercentage = new TeamShotOnGoalPercentages(example);

        System.out.println("Test #8 - Returns the correct average of the top five players where the number of players is less than 5.");
        System.out.println("<Expect>");
        System.out.println("1.633333");
        System.out.println("<Actual>");

        //print the average of top players with method getAverageOfTopPlayers()
        System.out.println(String.format("%.6f", teamShotOnGoalPercentage.getAverageOfTopPlayers()));     
    }

    /**
     * Test 9
     * Returns the correct String representation.
     */
    static void getStringRepresentation()
    {
        //initialized a double array with its values
        double[] example = new double[] {1.5,2.4,1.0,4.3,7.9,8.2,9.4,0.5,7.9};

        //Create a TeamShotOnGoalPercentage object using TeamShotOnGoalPercentages(double[] percentages) constructor
        TeamShotOnGoalPercentages teamShotOnGoalPercentage = new TeamShotOnGoalPercentages(example);

        System.out.println("Test #9 - Returns the correct String representation..");
        System.out.println("<Expect>");
        System.out.println("--------------------\nPlayer\t\tSOG%\n--------------------\n0---------------1.500000\n1---------------2.400000\n2---------------1.000000\n3---------------4.300000\n4---------------7.900000\n5---------------8.200000\n6---------------9.400000\n7---------------0.500000\n8---------------7.900000");
        System.out.println("<Actual>");

        //call method toString() to print Players (index) and percentages (values) of array double percentage variable
        System.out.println(teamShotOnGoalPercentage.toString());
    }
}