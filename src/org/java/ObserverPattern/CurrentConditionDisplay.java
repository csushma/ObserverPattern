/**
 * 
 */
package org.java.ObserverPattern;

/**
 * @author SUSHMARAVI
 *
 */
public class CurrentConditionDisplay implements DisplayElement, Observer {

	float temperature, humidity, pressure;
	public Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	
	@Override
	public void display() {
		System.out.println("Current weather conditions: \ntemperature = "+temperature+"\nhumidity = "+humidity+"\npressure = "+pressure);
		
	}

}
