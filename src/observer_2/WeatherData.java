/**
 * 
 */
package observer_2;

import java.util.Observable;

/**
 * @author Rahul
 * Implementation of Observer pattern using
 * Java's in-built support
 * 
 * We don't need to keep track of our observers anymore
 * or manage their registration and removal (the superclass will handle that)
 */
public class WeatherData extends Observable {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {}
	
	public void measurementsChanged() {
		
		/* 
		 * We call setChanged() method first to indicate that the
		 * state has changed before calling notifyObservers()
		 */
		setChanged();
		
		/*
		 * We aren't sending a data object with the notifyObservers() call, 
		 * which means that we are using the PULL model
		 */
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	/*
	 * Because we are using PULL model
	 * the Observers will use these getters to 
	 * get at the WeatherData object’s state
	 */
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
