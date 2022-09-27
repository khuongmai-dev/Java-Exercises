/*
 * Name: Justin Mai
 * Program: Business Information Technology
 * Course: ADEV-1008 Programming 1
 * Created: November 10, 2021
 * Updated:
 */

/**
 * WeatherForecast Class
 *
 * @author Justin Mai
 * @version 1.0
 *
 */

 public class WeatherForecast
 {

    //The temperature of the weather in Fahrenheit
    private int temperature;

    //The sky condition of the weather forecast
    private SkyCondition skyCondition;

    //Check if the weather forecast is consistent or not
    public static final int CONSISTENCY_FACTOR = 32;

    //The minimum possible value of the weather forecast's temperature
    public static final int MINIMUM_TEMPERATURE = -50;

    //The maximum possible value of the weather forecast's temperature
    public static final int MAXIMUM_TEMPERATURE = 150;

    /**
     * Default Constructor:
     * Initializes a new instance of WeatherForeCast
     * with a temperature of 70 degrees and a sky condition of sunny
     */
    public WeatherForecast()
    {
        //initialize temperature to 70 degree
        temperature = 70;

        //initialize the sky condition to sunny
        skyCondition = SkyCondition.SUNNY;
    }

    /**
     * Overloeaded Constructor
     * @parameter int temperature
     * allows client to set beginning values for temperature if the Temp in range
     * skycondition is initial sunny
     */
    public WeatherForecast(int temperature)
    {
        //Validate temperature parameter
        //invoke isTemparatureInRange method in if condition
        //If the temperature is out of range, the temperature is set to 0
        if(!isTemparatureInRange(temperature))
            {
                this.temperature = 0;
            }

        //If the temperature is within the range, set the varible temperature = temperature parameter
        else
            {
                this.temperature = temperature;
            }
        this.skyCondition = SkyCondition.SUNNY;
    }

    /**
     * accessor method
     * get temperature
     * @return current value of temperature
     */
    public int getTemperature()
    {
        return temperature;
    }

    /**
     * accessor method with boolean data type
     * compare the temerature with min and max and
     * @return true or false based on the current temperature
     */
    private boolean isTemparatureInRange (int temperature) {

        //if temperature within the range when compared to min and max temperature, and then return true value
        //otherwise, return false value
        return (temperature >= MINIMUM_TEMPERATURE) && (temperature <= MAXIMUM_TEMPERATURE);
    }

    /**
     * mutator method
     * allow client to set temperature
     */
    public void setTemperature(int temperature)
    {
        //Validate temperature parameter
        //invoke isTemparatureInRange method in if condition
        //If the temperature is in of the range, the temperature is set to temperature variable
        if(isTemparatureInRange(temperature))
            {
                this.temperature = temperature;
            }
    }

    /**
     * accessor method
     * @return current value of skyCondition
     */
    public SkyCondition getSkyCondition()
    {
        return skyCondition;
    }

    /**
     * mutator method
     * allow client to set value of skyCondition
     */
    public void setSkyCondition(SkyCondition skyCondition)
    {
        this.skyCondition = skyCondition;
    }

    /**
     * accessor method
     * get temperature
     * @return current value of temperature
     */
    public int toCelsius(int fahrenheit)
    {
        //Convert Fahrenheit to Celcius with the formula below
        return (fahrenheit - 32)*5/9;
    }

    /**
     * accessor method
     * Check weather is consistent or nto
     * @return boolean true or false based on the current value of temperature and skyCondition
     */
    public boolean isConsistent()
    {
        //if temperature is above consistency_factor and sky condition is snowny
        //or temperature is below consistency_factor and sky condition is rainny
        //return false value because it is not consistent weather
        if((temperature> CONSISTENCY_FACTOR && skyCondition == SkyCondition.SNOWY) ||
                (temperature < CONSISTENCY_FACTOR && skyCondition == SkyCondition.RAINY))
            {
                return false;
            }

        //else, it is consistent weather and @return true value
        else
            {
                return true;
            }
    }

    /**
     * ToString() method
     * @return a string of instance variable values: temperature and skyCondition
     */
    public String toString()
    {
        return "Current condition: " + temperature + " and is " + skyCondition;
    }

 }