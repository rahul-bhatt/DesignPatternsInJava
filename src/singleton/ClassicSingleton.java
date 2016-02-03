/**
 * 
 */
package singleton;

/**
 * @author Rahul
 * 
 ***********************************************************************
 ***  Classic implementation of Singleton (Lazy Initialization)  *******
 ***********************************************************************
 *
 * 1. Not thread safe.
 * 2. Prone to sophisticated serialization or reflection attacks.
 */
public class ClassicSingleton {
	
	private ClassicSingleton(){}
	private static ClassicSingleton instance;
	
	public static ClassicSingleton getInstance() {
		if(instance == null) {
			instance = new ClassicSingleton();
		}
		
		return instance;
	}
}
