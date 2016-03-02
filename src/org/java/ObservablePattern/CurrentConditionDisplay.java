/**
 * 
 */
package org.java.ObservablePattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @author SUSHMARAVI
 *
 */
public class CurrentConditionDisplay implements DisplayElement, Observer {

	float temperature, humidity, pressure;
	public Observable weatherData;
	
	public CurrentConditionDisplay(Observable weatherData){
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current weather conditions: \ntemperature = "+temperature+"\nhumidity = "+humidity+"\npressure = "+pressure);
		
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData wd = (WeatherData) o;
			this.temperature = wd.getTemperature();
			this.humidity = wd.getHumidity();
			this.pressure = wd.getPressure();
			display();
		}
	}

}
