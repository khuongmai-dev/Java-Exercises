/*
* Name: Justin Mai
* Program: Business Information Technology
* Course: ADEV-1008 Programming 1
* Created: December 06, 2021
* Updated:
*/

/**
* Player class on a sport team
* @author Justin Mai
* @version 1.0
*/
public class Player
{
	//initialize a string variable
	private String name;

	//initialize a integer variable
	private int number;

	//initialize a integer variable - the total number of points accumulated by the player
  	private int totalPoint;

	/**
	* Overloaded Constructor
	* @param name
	* @param number
	* set the name and number of a player
	*/
	public Player(String name, int number)
	{
		this.setName(name);
		this.setNumber(number);
	}

	/**
	* accessor method
	* @return the name of the player
	*/
	public String getName()
	{
		return this.name;
	}

	/**
	* mutator method
	* @param name
	* sets the name of a player
	*/
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	* accessor method
	* @return the player's jersey number
	*/
	public int getNumber()
	{
		return this.number;
	}

	/**
	* mutator method
	* sets the player's jersey number.
	* @param number
	*/
	public void setNumber(int number)
	{
		this.number = number;
	}

	/**
	* accessor method
	* @return the total number of points accumulated by the player
	*/
	public int getPoints()
	{
		return this.totalPoint;
	}

	/**
	* formats the toString
	* @return the string representation of the player.
	*/
	public String toString()
	{
		//Declear an object Stringbuilder
		StringBuilder builder = new StringBuilder();

		//Add name and number to the builder
		builder.append(String.format("%s [%s]", this.name, this.number));
		return builder.toString();
	}
}