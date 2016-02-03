/**
 * 
 */
package observer_1;

/**
 * @author Rahul
 * This display implements Observer so that it can get changes from the WeatherData Object
 * It also implements DisplayElement because our API is going to require all display elements
 * to implement this interface
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	/*
	 * The constructor is passed the weatherData object (the Subject)
	 * and we use it to register the display as an observer
	 */
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	/*
	 * When update() is called, we save temperature and humidity
	 * and call display()
	 */
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	/*
	 * The display element just prints out the most recent
	 * temperature and humidity
	 */
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}
}
