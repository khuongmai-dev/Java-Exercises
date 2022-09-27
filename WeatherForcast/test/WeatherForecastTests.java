/*
 * Name: Justin Mai
 * Program: Business Information Technology
 * Course: ADEV-1008 Programming 1
 * Created: November 10, 2021
 * Updated:
 */

/**
 * Using Test Plan given in excel file
 * @author Justin Mai
 * @version 1.0
 *
 */
public class WeatherForecastTests {

    /**
     * Result of the tests
     */
    public static void main(String[] args)
    {
        //Invoke method of test 1
        testWeatherForecastWithTempBelowMin ();

        //Invoke method of test 2
        testWeatherForecastWithTempMin ();

        //Invoke method of test 3
        testWeatherForecastWithTempWithinRange ();

        //Invoke method of test 4
        testWeatherForecastWithTempMax ();

        //Invoke method of test 5
        testWeatherForecastWithTempAboveMax ();

        //Invoke method of test 6
        testSkyCondition ();

        //Invoke method of test 7
        testDefaultConstWeatherForecast();

        //Invoke method of test 8
        testDefaultConstSkycondition();

        ///Invoke method of test 9
        testStateOfTempBellowMin();

        ///Invoke method of test 10
        testStateOfTempToMin();

        ///Invoke method of test 11
        testStateOfTempWithinRange();

        ///Invoke method of test 12
        testStateOfTempToMax();

        //Invoke method of test 13
        testStateOfTempAboveMax();

        //Invoke method of test 14
        testStateOfSkyCondition();

        //Invoke method of test 15
        testStateOfTempinCelcius();

        //Invoke method of test 16
        testStateOfTempHotForSnow();

        //Invoke method of test 17
        testStateOfTempColdEnoughForSnow();

        //Invoke method of test 18
        testStateOfTempTooColdForRain();

        //Invoke method of test 19
        testStateOftempWarmEnoughForRain();

        //Invoke method of test 20
        testToString ();
    }

    //Setup of the tests

    /**
     * Test 1 WeatherForecast(int)
     * Initialize the temperature with a value below the minimum
     * Test Data: -55
     * Expected: 0
     */
    static void testWeatherForecastWithTempBelowMin ()
    {
        //print messages
        System.out.println("WeatherForecast(int)");
        System.out.println ("Test #1: Initialize the temperature with a value below the minimum");

        //Initialize weatherForecast with temperature parameter
        WeatherForecast weatherForecast = new WeatherForecast(-55);
        System.out.println("Expected: 0");

        //invoke method .getTemperature() and print to the screen
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println("\n");
    }

    
    /**
     * Test 2 WeatherForecast(int)
     * Initialize the temperature to the minimum temperature
     * Test Data: -50
     * Expected: -50
     */
    static void testWeatherForecastWithTempMin () 
    {
        System.out.println("WeatherForecast(int)");
        System.out.println ("Test #2: Initialize the temperature to the minimum temperature");

        //Initialize weatherForecast with temperature parameter
        WeatherForecast weatherForecast = new WeatherForecast(-50);
        System.out.println("Expected: -50");

        //invoke method .getTemperature() and print to the screen
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println("\n");
    }

    /**
     * Test 3 WeatherForecast(int)
     * Initialize the temperature within the range
     * Test Data: 10
     * Expected: 10
     */
    static void testWeatherForecastWithTempWithinRange () 
    {
        System.out.println("WeatherForecast(int)");
        System.out.println ("Test #3: Initialize the temperature within the range");

        //Initialize weatherForecast with temperature parameter
        WeatherForecast weatherForecast = new WeatherForecast(10); 
        System.out.println("Expected: 10");

        //invoke method .getTemperature() and print to the screen
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println("\n");
    }

    /**
     * Test 4 WeatherForecast(int)
     * Initialize the temperature the to the maximum temperature
     * Test Data: 150
     * Expected: 150
     */
    static void testWeatherForecastWithTempMax () 
    {
        System.out.println("WeatherForecast(int)");
        System.out.println ("Test #4: Initialize the temperature the to the maximum temperature");

        //Initialize weatherForecast with temperature parameter
        WeatherForecast weatherForecast = new WeatherForecast(150); 

        //invoke method .getTemperature() and print to the screen
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println("\n");
    }

     /**
     * Test 5 WeatherForecast(int)
     * Initialize the temperature above the maximum temperature
     * Test Data: 200
     * Expected: 0
     */
    static void testWeatherForecastWithTempAboveMax () 
    {
        System.out.println("WeatherForecast(int)");
        System.out.println ("Test #5: Initialize the temperature above the maximum temperature");

        //Initialize weatherForecast with temperature parameter
        WeatherForecast weatherForecast = new WeatherForecast(200); 
        System.out.println("Expected: 0");

        //invoke method .getTemperature() and print to the screen
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println("\n");
    }

     /**
     * Test 6 WeatherForecast(int)
     * Initialize the sky condition
     * Test Data: sunny
     * Expected: sunny
     */
    static void testSkyCondition ()
     {
        System.out.println("WeatherForecast(int)");
        System.out.println ("Test #6: Initialize the sky condition");

        //Initialize weatherForecast with temperature parameter
        WeatherForecast weatherForecast = new WeatherForecast();
        System.out.println("Expected: sunny");

        //invoke method .getSkyCondition() and print to the screen
        System.out.println("Actual: " + weatherForecast.getSkyCondition());
        System.out.println("\n");
     }

     /**
     * Test 7
     * Initialize the temperature WeatherForecast()
     * Test Data: 
     * Expected: 70 
     */
    static void testDefaultConstWeatherForecast()
     {
        System.out.println("WeatherForecast()");
        System.out.println ("Test #7: Initialize the temperature WeatherForecast()");

        //Initialize weatherForecast with temperature parameter
        WeatherForecast weatherForecast = new WeatherForecast();
        System.out.println("Expected: 70");

        //invoke method .getTemperature() and print to the screen
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println("\n");
     }

    /**
     * Test 8 WeatherForecast()
     * Initialize the sky condition
     * Test Data: 
     * Expected: sunny
     */
    static void testDefaultConstSkycondition()
     {
        System.out.println("WeatherForecast()");
        System.out.println ("Test #8: Initialize the sky condition");

        //Initialize weatherForecast with temperature parameter
        WeatherForecast weatherForecast = new WeatherForecast();
        System.out.println("Expected: sunny");

        //invoke method .getSkyCondition() and print to the screen
        System.out.println("Actual: " + weatherForecast.getSkyCondition());
        System.out.println("\n");
     }

     /**
     * Test 9 setTemperature(int) : void
     * Update the state of the temperature with a value below the minimum
     * Initial state: 20
     * temperature: -60
     * Expected: 20
     */
    static void testStateOfTempBellowMin()
     {
        System.out.println("setTemperature(int)");
        System.out.println ("Test #9: Update the state of the temperature with a value below the minimum");

        //Initialize weatherForecast with temperature parameter
        WeatherForecast weatherForecast = new WeatherForecast(20);
        weatherForecast.setTemperature(-60);
        System.out.println("Expected: 20");

        //invoke method .getTemperature() and print to the screen
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println("\n");
     }

    /**
     * Test 10 setTemperature(int) : void
     * Update the state of the temperature to the minimum temperature
     * Initial state: 20
     * temperature: -50
     * Expected: -50
     */
    static void testStateOfTempToMin()
     {
        System.out.println("setTemperature(int)");
        System.out.println ("Test #10: Update the state of the temperature to the minimum temperature");

        //Initialize weatherForecast with temperature parameter

        WeatherForecast weatherForecast = new WeatherForecast(20);
        weatherForecast.setTemperature(-50);
        System.out.println("Expected: -50");

        //invoke method .getTemperature() and print to the screen
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println("\n");
     }

    /**
     * Test 11 setTemperature(int) : void
     * Update the state of the temperature within the range
     * Initial state: 20
     * temperature: 10
     * Expected: 10
     */
    static void testStateOfTempWithinRange()
    {
        System.out.println("setTemperature(int)");
        System.out.println ("Test #11: Update the state of the temperature within the range");

        //Initialize weatherForecast with temperature parameter
        WeatherForecast weatherForecast = new WeatherForecast(20);
        weatherForecast.setTemperature(10);
        System.out.println("Expected: 10");

        //invoke method .getTemperature() and print to the screen
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println("\n");
    }

     /**
     * Test 12 setTemperature(int) : void
     * Update the state of the temperature the to the maximum temperature
     * Initial state: 20
     * temperature: 150
     * Expected: 150
     */
    static void testStateOfTempToMax()
    {
        System.out.println("setTemperature(int)");
        System.out.println ("Test #12: Update the state of the temperature the to the maximum temperature");

        //Initialize weatherForecast with temperature parameter
        WeatherForecast weatherForecast = new WeatherForecast(20);
        weatherForecast.setTemperature(150);
        System.out.println("Expected: 150");

        //invoke method .getTemperature() and print to the screen
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println("\n");
    }

     /**
     * Test 13 setTemperature(int) : void
     * Update the state of the temperature above the maximum temperature
     * Initial state: 20
     * temperature: 220
     * Expected: 20
     */
    static void testStateOfTempAboveMax()
    {
        System.out.println("setTemperature(int)");
        System.out.println ("Test #13: Update the state of the temperature above the maximum temperature");

        //Initialize weatherForecast with temperature parameter
        WeatherForecast weatherForecast = new WeatherForecast(20);
        weatherForecast.setTemperature(220);
        System.out.println("Expected: 20");

        //invoke method .getTemperature() and print to the screen
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println("\n");
    }

     /**
     * Test 14 setSkyCondition(SkyCondition) : void
     * Update state of sky condition.
     * Initial state: sunny
     * Sky condition: cloudy
     * Expected: cloudy
     */
    static void testStateOfSkyCondition()
    {
        System.out.println("setSkyCondition(SkyCondition)");
        System.out.println ("Test #14: Update state of sky condition.");

        //Initialize weatherForecast with temperature parameter
        WeatherForecast weatherForecast = new WeatherForecast(); 
        weatherForecast.setSkyCondition(SkyCondition.CLOUDY); 
        System.out.println("Expected: cloudy");

        //invoke method .getSkyCondition() and print to the screen
        System.out.println("Actual: " + weatherForecast.getSkyCondition());
        System.out.println("\n");
    }

     /**
     * Test 15 (static) toCelcius(int) : int
     * Returns the temperature in Celsius
     * fahrenheit: 100
     * Expected: 37
     */
    static void testStateOfTempinCelcius()
    {
        System.out.println("toCelcius(int)");
        System.out.println ("Test #15: Returns the temperature in Celsius.");

        //Initialize weatherForecast with temperature parameter
        WeatherForecast weatherForecast = new WeatherForecast(); 
        System.out.println("Expected: 37");

        //invoke method .toCelsius() and print to the screen
        System.out.println("Actual: " + weatherForecast.toCelsius(100));
        System.out.println("\n");
    }

     /**
     * Test 16 isConstistent() : boolean
     * The temperature is too hot for snow.
     * temperature: 70
     * sky condition: snowy
     * Expected: false and show state
     */
    static void testStateOfTempHotForSnow()
    {
        System.out.println("isConstistent()");
        System.out.println ("Test #16: The temperature is too hot for snow.");

        //Initialize weatherForecast with temperature parameter
        WeatherForecast weatherForecast = new WeatherForecast();

        //data set
        //invoke .setTemperature with temperature parameter 70
        weatherForecast.setTemperature(70);

        //invoke .setSkyCondition with Snowy parameter
        weatherForecast.setSkyCondition(SkyCondition.SNOWY); 

        System.out.println("Expected: The temperature is too hot for snow");

        //invoke .isConsitent() method from WeatherForecast class
        //if it is not consistent return a message onto the screen
        if(!weatherForecast.isConsistent())
        {
            System.out.println("Actual: The temperature is too hot for snow");
        }
        System.out.println("\n");
    }

     /**
     * Test 17 isConstistent() : boolean
     * The temperature is cold enough for snow.
     * temperature: 20
     * sky condition: snowy
     * Expected: true and show state
     */
    static void testStateOfTempColdEnoughForSnow()
     {
        System.out.println("isConstistent()");
        System.out.println ("Test #17 The temperature is cold enough for snow.");

        //Initialize weatherForecast with temperature parameter
        WeatherForecast weatherForecast = new WeatherForecast();

        //data set
        //invoke .setTemperature with temperature parameter 20
        weatherForecast.setTemperature(20);

        //invoke .setSkyCondition with Snowy parameter
        weatherForecast.setSkyCondition(SkyCondition.SNOWY);

        System.out.println("Expected: The temperature is cold enough for snow");

         //if it is consistent return a message onto the screen
        if(weatherForecast.isConsistent())
        {
            System.out.println("Actual: The temperature is cold enough for snow.");
        }
        System.out.println("\n");
     }

     /**
     * Test 18 isConstistent() : boolean
     * The temperature is too cold for rain.
     * temperature: 20
     * sky condition: rainy
     * Expected: false and show state
     */
    static void testStateOfTempTooColdForRain()
     {
        System.out.println("isConstistent()");
        System.out.println ("Test #18 The temperature is too cold for rain..");

        //Initialize weatherForecast with temperature parameter
        WeatherForecast weatherForecast = new WeatherForecast();

        //data set
        //invoke .setTemperature with temperature parameter 20
        weatherForecast.setTemperature(20);

        //invoke .setSkyCondition with Rainy parameter
        weatherForecast.setSkyCondition(SkyCondition.RAINY);

        //print
        System.out.println("Expected: The temperature is too cold for rain.");

        //invoke .isConsitent() method from WeatherForecast class
        //if it is not consistent return a message onto the screen
        if(!weatherForecast.isConsistent())
        {
            System.out.println("Actual: The temperature is too cold for rain.");
        }
        System.out.println("\n");
     }

     /**
     * Test 19 isConstistent() : boolean
     * The temperature is warm enough for rain.
     * temperature: 33
     * sky condition: rainy
     * Expected: true and show state
     */
    static void testStateOftempWarmEnoughForRain()
    {
        System.out.println("isConstistent()");
        System.out.println ("Test #19 The temperature is warm enough for rain.");

        //Initialize weatherForecast with temperature parameter
        WeatherForecast weatherForecast = new WeatherForecast();

        //data set
        //invoke .setTemperature with temperature parameter 33
        weatherForecast.setTemperature(33);

        //invoke .setSkyCondition with rainy parameter
        weatherForecast.setSkyCondition(SkyCondition.RAINY);

        System.out.println("Expected: The temperature is warm enough for rain.");

        //invoke .isConsitent() method from WeatherForecast class
        //if it is consistent return a message onto the screen
        if(weatherForecast.isConsistent())
        {
            System.out.println("Actual: The temperature is warm enough for rain.");
        } 
        System.out.println("\n");
    }

     /**
     * Test 20 toString() : String
     * Returns the correct String representation
     * temperature: 99
     * sky condition: rainy
     * Expected: "Current condition: 99 and is rainy"
     */
    static void testToString ()
    {
        System.out.println("toString()");
        System.out.println ("Test #20: Returns the temperature in Celsius.");

        //Initialize weatherForecast with temperature parameter
        WeatherForecast weatherForecast = new WeatherForecast(); 
        weatherForecast.setTemperature(99);
        weatherForecast.setSkyCondition(SkyCondition.RAINY);
        System.out.println("Expected: Current condition: 99 and is rainy");

        //invoke .toString() method
        System.out.println("Actual: " + weatherForecast.toString());
        System.out.println("\n");
    }
}