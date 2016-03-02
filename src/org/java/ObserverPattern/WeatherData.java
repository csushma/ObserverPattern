/**
 * 
 */
package org.java.ObserverPattern;

import java.util.ArrayList;

/**
 * @author SUSHMARAVI
 *
 */
public class WeatherData implements Subject{

	float temperature;
	float humidity;
	float pressure;
	ArrayList<Observer> observers;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}
	
	public float getTemperature() {
		return temperature;
	}

	public void setWeatherData(float temperature,float humidity,float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObserver();
	}

	public float getHumidity() {
		return humidity;
	}


	public float getPressure() {
		return pressure;
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void unregisterObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i>=0) observers.remove(o);
		
	}

	@Override
	public void notifyObserver() {
		for(Observer obs: observers){
			obs.update(temperature, humidity, pressure);
		}
	}

	
}
