/**
 * 
 */
package observer_1;

/**
 * @author Rahul
 *
 */
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	
	/*
	 * This method is called to notify all the observers
	 * when the Subject's state has changed.
	 */
	public void notifyObserver();
}
