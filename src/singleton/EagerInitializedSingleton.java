/**
 * 
 */
package singleton;

/**
 * @author Rahul
 * 
 ***********************************************************************************
 ****************  Eagerly created Singleton implementation  ***********************
 ***********************************************************************************
 * 
 * 1. Thread safe.
 * 2. Does not provide any option for exception handling.
 * 3. Can be used if the application always creates and uses an instance of singleton.
 * 4. Should be used if Overhead of creating the Singleton is less.
 * 5. Prone to sophisticated serialization or reflection attacks.
 */
public class EagerInitializedSingleton {
	
	private EagerInitializedSingleton(){}
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	public static EagerInitializedSingleton getInstance() {		
		return instance;
	}
}
