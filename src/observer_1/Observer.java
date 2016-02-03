/**
 * 
 */
package observer_1;

/**
 * @author Rahul
 * The observer interface is implemented by all the observers
 * so that they all have to implement update() method.
 */
public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
