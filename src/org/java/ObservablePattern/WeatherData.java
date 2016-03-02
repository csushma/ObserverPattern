/**
 * 
 */
package org.java.ObservablePattern;

import java.util.Observable;

/**
 * @author SUSHMARAVI
 *
 */
public class WeatherData extends Observable{

	float temperature;
	float humidity;
	float pressure;
	
	public void setWeatherData(float temperature,float humidity,float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();	/* this will internally call update method of all observers
								so all observers should implement the update method properly*/
	}


	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}


	public float getPressure() {
		return pressure;
	}


}
