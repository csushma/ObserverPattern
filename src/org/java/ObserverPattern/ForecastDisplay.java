/**
 * 
 */
package org.java.ObserverPattern;

/**
 * @author SUSHMARAVI
 *
 */
public class ForecastDisplay implements DisplayElement, Observer {

	float temperature, humidity, pressure;
	public Subject weatherData;
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
