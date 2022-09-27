/*
* Name: Justin Mai
* Program: Business Information Technology
* Course: ADEV-1008 Programming 1
* Created: December 06, 2021
* Updated:
*/

/**
* Basketball Player class on a sport team
* The child of Player class.
* @author Justin Mai
* @version 1.0
*/
public class BasketballPlayer extends Player
{
	//initialize three integer variables
	private int freeThrows;
	private int fieldGoals;
	private int threePointers;

	/**
	* Overloaded Constructor
	* @param name 
	* @param number
	* set the name and number from Player class
  	* set freeThrows, fieldGoals, threePointers = 0;
	*/
	public BasketballPlayer(String name, int number)
	{
    super(name, number);
    this.freeThrows = 0;
    this.fieldGoals = 0;
    this.threePointers = 0;
	}

	/**
	* accessor method
	* @return the number of free throws made by the basketball player.
	*/
	public int getFreeThrows()
	{
		return this.freeThrows;
	}

	/**
	* mutator method
	* @param freeThrows
	* Sets the number of free throws made by the basketball player.
	*/
	public void setFreeThrows(int freeThrows)
	{
		this.freeThrows = freeThrows;
	}

	/**
	* accessor method
	* @return the number of field goals made by the basketball player.
	*/
	public int getFieldGoals()
	{
		return this.fieldGoals;
	}

	/**
	* mutator method
	* @param fieldGoals
	* Sets the number of field goals made by the basketball player.
	*/
	public void setFieldGoals(int fieldGoals)
	{
		this.fieldGoals = fieldGoals;
	}

	/**
	* accessor method
	* @return the number of three pointers made by the basketball player.
	*/
	public int getThreePointers()
	{
		return this.threePointers;
	}

	/**
	* mutator method
	* @param threePointers
	* Sets the number of three pointers made by the basketball player.
	*/
	public void setThreePointers(int threePointers)
	{
		this.threePointers = threePointers;
	}

	 /**
	* accessor method
	* Returns the total number of points accumulated by the basketball player.
	*/
	@Override
	public int getPoints()
	{
		return freeThrows + fieldGoals*2 + threePointers*3;
	}

	/**
	* formats the toString 
	* @returns the string representation of the player.
	*/
	public String toString()
	{
		//Declear an object Stringbuilder
		StringBuilder builder = new StringBuilder();

		//Initilaize a string named superString and with value 
		//of the string representation of Player class (parent class)
		String superString = super.toString();

		builder.append("Basketball Player: ");
		builder.append(superString);
		builder.append(", Points: ");

		//Add total Point to the builder
		builder.append(this.getPoints());

		//return the string
    	return builder.toString();
	}
}