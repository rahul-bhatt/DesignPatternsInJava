/**
 * 
 */
package singleton;

/**
 * @author Rahul
 * 
 ***************************************************************************
 ***********************  Double Check Locking pattern  ********************
 ***************************************************************************
 * 
 * 1. Thread safe.
 * 2. No overhead of synchronized getInstance() method
 * 3. Prone to sophisticated serialization or reflection attacks.
 */
public class DCLPSingleton {
	
	private DCLPSingleton(){}
	private volatile static DCLPSingleton instance;
	
	public static DCLPSingleton getInstance() {		
		if(instance == null) {
			synchronized (DCLPSingleton.class) {
				if(instance == null) {
					instance = new DCLPSingleton();
				}
			}
		}
		
		return instance;
	}
}
