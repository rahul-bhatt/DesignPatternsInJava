/**
 * 
 */
package observer_1;

import java.util.ArrayList;

/**
 * @author Rahul
 *
 */
public class WhetherData implements Subject {

	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	/* (non-Javadoc)
	 * @see observer_1.Subject#registerObserver()
	 */
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	/* (non-Javadoc)
	 * @see observer_1.Subject#removeObserver()
	 */
	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0) {		
			observers.remove(i);
		}
	}

	/* (non-Javadoc)
	 * @see observer_1.Subject#notifyObserver()
	 */
	@Override
	public void notifyObserver() {
		for(int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
