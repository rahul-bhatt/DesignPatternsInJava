/**
 * 
 */
package singleton;

/**
 * @author Rahul
 * 
 ****************************************************************************************
 ******  Thread safe implementation of Singleton (Using Synchronized getInstance())  ****
 ****************************************************************************************
 * 
 * 1. Thread safe.
 * 2. Overhead of synchronized function.
 * 3. Performance degrades in case of high traffic on getInstance() method.
 * 4. Prone to sophisticated serialization or reflection attacks.
 */
public class ThreadSafeSingleton {
	
	private ThreadSafeSingleton(){}
	private static ThreadSafeSingleton instance;
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if(instance == null) {
			instance = new ThreadSafeSingleton();
		}
		
		return instance;
	}
}
