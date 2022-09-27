/*
* Name: Justin Mai
* Program: Business Information Technology
* Course: ADEV-1008 Programming 1
* Created: December 06, 2021
* Updated:
*/

/**
* Hockey Player class on a sport team
* The child of Player class.
* @author Justin Mai
* @version 1.0
*/
public class HockeyPlayer extends Player
{
  //initialize integer variables: goals and assists
  private int goals;
  private int assists;

  /**
	* Overloaded Constructor
	* @param name
  * @param number
	* set the name and number from Player class
  * set the goal and assists = 0
	*/
  public HockeyPlayer(String name, int number)
  {
    super(name, number);
    this.goals = 0;
    this.assists = 0;
  }

  /**
	* Overloaded Constructor
	* @param name
  * @param number
  * @param goals
  * @param assists
	* inherit name, number from parent class: Player
  * set goals and assists
	*/
  public HockeyPlayer(String name, int number, int goals, int assists)
  {
    super(name, number);
    this.setGoals(goals);
    this.setAssists(assists);
  }

  /**
	* accessor method
	* @return the number of goals scored by the hockey player
	*/
  public int getGoals()
  {
    return this.goals;
  }

  /**
	* mutator method
	* @param goals
	* Sets the number of goals scored by the hockey player.
	*/
  public void setGoals(int goals)
  {
    this.goals = goals;
  }

  /**
	* accessor method
	* @return the number of assists made by the hockey player.
	*/
  public int getAssists()
  {
    return this.assists;
  }

  /**
	* mutator method
	* @param assists
	* Sets the number of assists made by the hockey player.
	*/
  public void setAssists(int assists)
  {
    this.assists = assists;
  }

  /**
	* accessor method
	* @return the total number of points accumulated by the hockey player
	*/
  @Override
  public int getPoints()
  {
    return goals + assists;
  }

  /**
	* formats the toString
  * @returns the string representation of the player.
	*/
  public String toString()
  {
    //Declear an object Stringbuilder
    StringBuilder builder = new StringBuilder();

    //Initilaize a string named superString and assign it
    //to the string representation of Player class (parent class)
    String superString = super.toString();

    //Add Strings and total Points as the format
    builder.append("Hockey Player - ");
    builder.append(superString);
    builder.append(", Points: ");
    builder.append(String.format("%s", this.getPoints()));

    //return the string after added Strings, total Points
    return builder.toString();
  }
}