/*
* Name: Justin Mai
* Program: Business Information Technology
* Course: ADEV-1008 Programming 1
* Created: December 06, 2021
* Updated:
*/

/**
* Test client of Basketball player
* @author Justin Mai
* @version 1.0
*/
public class BasketballPlayerTests
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
	}

	//Setup the test

	/**
     * BasketballPlayer(String, int)
     * Test #1 - Initialize the name.
     */
	static void Test1()
	{
		//Initialize a new object of class BasketballPlayer with name and number of a player
		BasketballPlayer player = new BasketballPlayer("Sammy Guevara", 68);

		//print on the screen
		System.out.println("BasketballPlayer(String, int)");
		System.out.println("Test #1 - Initialize the name.");
        System.out.println("Expected: Sammy Guevara");

		//Access the method getName and print
		System.out.printf("Actual: %s\n", player.getName());
		System.out.println("");
	}

	/**
     * BasketballPlayer(String, int)
     * Test #2 - Initialize the number.
     */
	static void Test2()
	{
		//Initialize a new object of class BasketballPlayer with name and number of a player
		BasketballPlayer player = new BasketballPlayer("Sammy Guevara", 68);

		//print on the screen
		System.out.println("Test #2 - Initialize the number.");
        System.out.println("Expected: 68");

		//Access the method getNumber and print
		System.out.printf("Actual: %s\n", player.getNumber());
		System.out.println("");
	}

	/**
     * BasketballPlayer(String, int)
     * Test #3 - Initialize the free throws.
     */
	static void Test3()
	{
		//Initialize a new object of class BasketballPlayer with name and number of a player
		BasketballPlayer player = new BasketballPlayer("Sammy Guevara", 68);

		//print on the screen
		System.out.println("Test #3 - Initialize the free throws.");
        System.out.println("Expected: 0");

		//Access the method getFreeThrows and print
		System.out.printf("Actual: %s\n", player.getFreeThrows());
		System.out.println("");
	}

	/**
     * BasketballPlayer(String, int)
     * Test #4 - Initialize the field goals.
     */
	static void Test4()
	{
		//Initialize a new object of class BasketballPlayer with name and number of a player
		BasketballPlayer player = new BasketballPlayer("Sammy Guevara", 68);

		//print on the screen
		System.out.println("Test #4 - Initialize the field goals.");
        System.out.println("Expected: 0");

		//Access the method getFieldGoals and print
		System.out.printf("Actual: %s\n", player.getFieldGoals());
		System.out.println("");
	}

	/**
     * BasketballPlayer(String, int)
     * Test #5 - Initialize the three pointers.
     */
	static void Test5()
	{
		//Initialize a new object of class BasketballPlayer with name and number of a player
		BasketballPlayer player = new BasketballPlayer("Sammy Guevara", 68);

		//print on the screen
		System.out.println("Test #5 - Initialize the three pointers.");
        System.out.println("Expected: 0");

		//Access the method getThreePointers and print
		System.out.printf("Actual: %s\n", player.getThreePointers());
		System.out.println("");
	}

	/**
     * setName(String) : void
     * Test #1 - Updates the state of name.
     */
	static void Test6()
	{
		//Initialize a new object of class BasketballPlayer with name and number of a player
		BasketballPlayer player = new BasketballPlayer("Sammy Guevara", 68);

		//Set name by calling the method setName(String)
		player.setName("Jimmy Mai");

		//print on the screen
		System.out.println("setName(String) : void");
		System.out.println("Test #1 - Updates the state of name.");
        System.out.println("Expected: Jimmy Mai");

		//Access the method getName and print
		System.out.printf("Actual: %s\n", player.getName());
		System.out.println("");
	}

	/**
     * setNumber(int) : void
     * Test #1 - Updates the state of number.
     */
	static void Test7()
	{
		//Initialize a new object of class BasketballPlayer with name and number of a player
		BasketballPlayer player = new BasketballPlayer("Sammy Guevara", 68);

		//Set number by calling the method setNumber(int)
		player.setNumber(98);

		//print on the screen
		System.out.println("setNumber(int) : void");
		System.out.println("Test #1 - Updates the state of number.");
        System.out.println("Expected: 98");

		//Access the method getNumber and print
		System.out.printf("Actual: %s\n", player.getNumber());
		System.out.println("");
	}

	/**
     * setFreeThrows(int) : void
     * Test #1 - Updates the state of free throws.
     */
	static void Test8()
	{
		//Initialize a new object of class BasketballPlayer with name and number of a player
		BasketballPlayer player = new BasketballPlayer("Sammy Guevara", 68);

		//Set name by calling the method setFreeThrows(int)
		player.setFreeThrows(15);

		//print on the screen
		System.out.println("setFreeThrows(int) : void");
		System.out.println("Test #1 - Updates the state of free throws.");
        System.out.println("Expected: 15");

		//Access the method getFreeThrows and print
		System.out.printf("Actual: %s\n", player.getFreeThrows());
		System.out.println("");
	}

	/**
     * setFieldGoals(int) : void
     * Test #1 - Updates the state of field goals.
     */
	static void Test9()
	{
		//Initialize a new object of class BasketballPlayer with name and number of a player
		BasketballPlayer player = new BasketballPlayer("Sammy Guevara", 68);

		//Set name by calling the method setFieldGoals(int)
		player.setFieldGoals(20);

		//print on the screen
		System.out.println("setFieldGoals(int) : void");
		System.out.println("Test #1 - Updates the state of field goals.");
        System.out.println("Expected: 20");

		//Access the method getFieldGoals and print
		System.out.printf("Actual: %s\n", player.getFieldGoals());
		System.out.println("");
	}

	/**
     * setThreePointers(int) : void
     * Test #1 - Updates the state of field goals.
     */
	static void Test10()
	{
		//Initialize a new object of class BasketballPlayer with name and number of a player
		BasketballPlayer player = new BasketballPlayer("Sammy Guevara", 68);

		//Set name by calling the method setThreePointers(int)
		player.setThreePointers(11);

		//print on the screen
		System.out.println("setThreePointers(int) : void");
		System.out.println("Test #1 - Updates the state of field goals.");
        System.out.println("Expected: 11");

		//Access the method getThreePointers and print
		System.out.printf("Actual: %s\n", player.getThreePointers());
		System.out.println("");
	}

	/**
     * getPoints() : int
     * Test #1 - Returns the correct number of points.
     */
	static void Test11()
	{
		//Initialize a new object of class BasketballPlayer with name and number of a player
		BasketballPlayer player = new BasketballPlayer("Sammy Guevara", 68);

		//Set name by calling the methods setFreeThrows, setFieldGoals, setThreePointers
		player.setFreeThrows(10);
		player.setFieldGoals(20);
		player.setThreePointers(10);

		//print on the screen
		System.out.println("getPoints() : int");
		System.out.println("Test #1 - Returns the correct number of points.");
        System.out.println("Expected: 80");

		//Access the method getName and print
		System.out.printf("Actual: %s\n", player.getPoints());
		System.out.println("");
	}

	/**
     * toString() : String
     * Test #1 - Returns the correct String representation.
     */
	static void Test12()
	{
		//Initialize a new object of class BasketballPlayer with name and number of a player
		BasketballPlayer player = new BasketballPlayer("Sammy Guevara", 68);

		//print on the screen
		System.out.println("toString() : String");
		System.out.println("Test #1 - Returns the correct String representation.");
        System.out.println("Expected: 'Basketball Player: Sammy Guevara [68], Points: 0'");
		
		//Access the method toString and print
		System.out.printf("Actual: '%s'\n", player.toString());
		System.out.println("");
	}
}