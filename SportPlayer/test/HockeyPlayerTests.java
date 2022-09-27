/*
* Name: Justin Mai
* Program: Business Information Technology
* Course: ADEV-1008 Programming 1
* Created: December 06, 2021
* Updated:
*/

/**
* Test client of Hockey Player
* @author Justin Mai
* @version 1.0
*/
public class HockeyPlayerTests
{
	/**
	 * Result of the tests
	 * @param args
	 */
	public static void main(String args[])
	{
		//Invoke method of test 1
		Test1();

		//Invoke method of test 2
		Test2();

		//Invoke method of test 3
		Test3();

		//Invoke method of test 4
		Test4();

		//Invoke method of test 5
		Test5();

		//Invoke method of test 6
		Test6();

		//Invoke method of test 7
		Test7();

		//Invoke method of test 8
		Test8();

		//Invoke method of test 9
		Test9();

		//Invoke method of test 10
		Test10();

		//Invoke method of test 11
		Test11();

		//Invoke method of test 12
		Test12();

		//Invoke method of test 13
		Test13();

		//Invoke method of test 14
		Test14();
	}

	//Setup the test

	/**
     * HockeyPlayer(String, int)
     * Test #1 - Initialize the name.
     */
	static void Test1()
	{
		//Initialize a new object of class HockeyPlayer with name and number of a player
		HockeyPlayer hockeyPlayer = new HockeyPlayer("Kenny Omega", 86);

		//print on the screen
		System.out.println("HockeyPlayer(String, int)");
		System.out.println("Test #1 - Initialize the name.");
        System.out.println("Expected: Kenny Omega");

		//Access the method getName and print
		System.out.printf("Actual: %s\n", hockeyPlayer.getName());
		System.out.println("");
	}

	/**
     * HockeyPlayer(String, int)
     * Test #2 - Initialize the number.
     */
	static void Test2()
	{
		//Initialize a new object of class HockeyPlayer with name and number of a player
		HockeyPlayer hockeyPlayer = new HockeyPlayer("Kenny Omega", 86);

		//print on the screen
		System.out.println("Test #2 - Initialize the number.");
        System.out.println("Expected: 86");

		//Access the method getNumber and print
		System.out.printf("Actual: %s\n", hockeyPlayer.getNumber());
		System.out.println("");
	}

	/**
     * HockeyPlayer(String, int)
     * Test #3 - Initialize the goals.
     */
	static void Test3()
	{
		//Initialize a new object of class HockeyPlayer with name and number of a player
		HockeyPlayer hockeyPlayer = new HockeyPlayer("Kenny Omega", 86);

		//print on the screen
		System.out.println("Test #3 - Initialize the goals.");
        System.out.println("Expected: 0");

		//Access the method getGoals and print
		System.out.printf("Actual: %s\n", hockeyPlayer.getGoals());
		System.out.println("");
	}

	/**
     * HockeyPlayer(String, int)
     * Test #4 - Initialize the assists.
     */
	static void Test4()
	{
		//Initialize a new object of class HockeyPlayer with name and number of a player
		HockeyPlayer hockeyPlayer = new HockeyPlayer("Kenny Omega", 86);

		//print on the screen
		System.out.println("Test #4 - Initialize the assists.");
        System.out.println("Expected: 0");

		//Access the method getAssists and print
		System.out.printf("Actual: %s\n", hockeyPlayer.getAssists());
		System.out.println("");
	}

	/**
     * HockeyPlayer(String, int, int, int)
     * Test #1 - Initialize the name.
     */
	static void Test5()
	{
		//Initialize a new object of class HockeyPlayer with name, number
		//goals, assists of a player
		HockeyPlayer hockeyPlayer = new HockeyPlayer("Kenny Omega", 86, 10, 9);

		//print on the screen
		System.out.println("HockeyPlayer(String, int, int, int)");
		System.out.println("Test #1 - Initialize the name.");
        System.out.println("Expected: Kenny Omega");

		//Access the method getName and print
		System.out.printf("Actual: %s\n", hockeyPlayer.getName());
		System.out.println("");
	}

	/**
     * HockeyPlayer(String, int, int, int)
     * Test #2 - Initialize the number.
     */
	static void Test6()
	{
		//Initialize a new object of class HockeyPlayer with name, number
		//goals, assists of a player
		HockeyPlayer hockeyPlayer = new HockeyPlayer("Kenny Omega", 86, 10, 9);

		//print on the screen
		System.out.println("Test #2 - Initialize the number.");
        System.out.println("Expected: 86");

		//Access the method getNumber and print
		System.out.printf("Actual: %s\n", hockeyPlayer.getNumber());
		System.out.println("");
	}

	/**
     * HockeyPlayer(String, int, int, int)
     * Test #3 - Initialize the goals.
     */
	static void Test7()
	{
		//Initialize a new object of class HockeyPlayer with name, number
		//goals, assists of a player
		HockeyPlayer hockeyPlayer = new HockeyPlayer("Kenny Omega", 86, 10, 9);

		//print on the screen
		System.out.println("Test #3 - Initialize the goals.");
        System.out.println("Expected: 10");

		//Access the method getGoals and print
		System.out.printf("Actual: %s\n", hockeyPlayer.getGoals());
		System.out.println("");
	}

	/**
     * HockeyPlayer(String, int, int, int)
     * Test #4 - Initialize the assists.
     */
	static void Test8()
	{
		//Initialize a new object of class HockeyPlayer with name, number
		//goals, assists of a player
		HockeyPlayer hockeyPlayer = new HockeyPlayer("Kenny Omega", 86, 10, 9);

		//print on the screen
		System.out.println("Test #4 - Initialize the assists.");
        System.out.println("Expected: 9");

		//Access the method getAssists and print
		System.out.printf("Actual: %s\n", hockeyPlayer.getAssists());
		System.out.println("");
	}

	/**
     * setName(String) : void
     * Test #1 - Updates the state of name.
     */
	static void Test9()
	{
		//Initialize a new object of class HockeyPlayer with name, number
		//goals, assists of a player
		HockeyPlayer hockeyPlayer = new HockeyPlayer("Kenny Omega", 86, 10, 9);
		hockeyPlayer.setName("Kevin Mai");

		//print on the screen
		System.out.println("setName(String) : void");
		System.out.println("Test #1 - Updates the state of name.");
        System.out.println("Expected: Kevin Mai");

		//Access the method getNumber and print
		System.out.printf("Actual: %s\n", hockeyPlayer.getName());
		System.out.println("");
	}

	/**
     * setNumber(int) : void
     * Test #1 - Updates the state of number.
     */
	static void Test10()
	{
		//Initialize a new object of class HockeyPlayer with name, number
		//goals, assists of a player
		HockeyPlayer hockeyPlayer = new HockeyPlayer("Kenny Omega", 86, 10, 9);

		//Set number by calling the method setnumber(int)
		hockeyPlayer.setNumber(68);

		//print on the screen
		System.out.println("setNumber(int) : void");
		System.out.println("Test #1 - Updates the state of number.");
        System.out.println("Expected: 68");

		//Access the method getNumber and print
		System.out.printf("Actual: %s\n", hockeyPlayer.getNumber());
		System.out.println("");
	}

	/**
     * setGoals(int) : void
     * Test #1 - Updates the state of goals.
     */
	static void Test11()
	{
		//Initialize a new object of class HockeyPlayer with name, number
		//goals, assists of a player
		HockeyPlayer hockeyPlayer = new HockeyPlayer("Kenny Omega", 86, 10, 9);
		
		//Set number by calling the method setGoals(int)
		hockeyPlayer.setGoals(15);

		//print on the screen
		System.out.println("setGoals(int) : void");
		System.out.println("Test #1 - Updates the state of goals.");
        System.out.println("Expected: 15");

		//Access the method getGoals and print
		System.out.printf("Actual: %s\n", hockeyPlayer.getGoals());
		System.out.println("");
	}

	/**
     * setAssists(int) : void
     * Test #1 - Updates the state of assists.
     */
	static void Test12()
	{
		//Initialize a new object of class HockeyPlayer with name, number
		//goals, assists of a player
		HockeyPlayer hockeyPlayer = new HockeyPlayer("Kenny Omega", 86, 10, 9);
	
		//Set number by calling the method setAssists(int)
		hockeyPlayer.setAssists(5);

		//print on the screen
		System.out.println("setAssists(int) : void");
		System.out.println("Test #1 - Updates the state of assists.");
        System.out.println("Expected: 5");
		System.out.printf("Actual: %s\n", hockeyPlayer.getAssists());
		System.out.println("");
	}

	/**
     * getPoints() : int
     * Test #1 - Returns the correct number of points.
     */
	static void Test13()
	{
		//Initialize a new object of class HockeyPlayer with name, number
		//goals, assists of a player
		HockeyPlayer hockeyPlayer = new HockeyPlayer("Kenny Omega", 86, 10, 9);

		//print on the screen
		System.out.println("getPoints() : int");
		System.out.println("Test #1 - Returns the correct number of points.");
        System.out.println("Expected: 19");

		//Access the method getPoints and print
		System.out.printf("Actual: %s\n", hockeyPlayer.getPoints());
		System.out.println("");
	}

	/**
     * toString() : String
     * Test #1 - Returns the correct String representation.
     */
	static void Test14()
	{
		//Initialize a new object of class HockeyPlayer with name, number
		//goals, assists of a player
		HockeyPlayer hockeyPlayer = new HockeyPlayer("Kenny Omega", 86, 10, 9);

		//print on the screen
		System.out.println("toString() : String");
		System.out.println("Test #1 - Returns the correct String representation.");
        System.out.println("Expected: 'Hockey Player - Kenny Omega [86], Points: 19'");
		
		//Access the method toString() print
		System.out.printf("Actual: '%s'\n", hockeyPlayer.toString());
		System.out.println("");
	}
}