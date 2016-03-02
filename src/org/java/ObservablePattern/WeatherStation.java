/**
 * 
 */
package org.java.ObservablePattern;

/**
 * @author SUSHMARAVI
 *
 */
public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		
		CurrentConditionDisplay ccd = new CurrentConditionDisplay(wd);
		
		wd.setWeatherData(87, 5, 10);
		wd.setWeatherData(90, 7, 8);
		wd.setWeatherData(82, 3, 12);
		

	}

}
