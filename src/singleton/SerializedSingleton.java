/**
 * 
 */
package singleton;

import java.io.Serializable;

/**
 * @author Rahul
 * 
 **************************************************************************************
 ********  Eagerly created instance (Guard against serialization attack)  *************
 **************************************************************************************
 * 
 * 1. Thread safe.
 * 2. Guard against serialization attack.
 * 3. Prone to serialization attack.
 * 
 * To make it serializable, it is not sufficient merely to add implements
 * Serializable to its declaration! To maintain the singleton guarantee, 
 * we have to declare all non primitive instance fields as transient and provide a readResolve method
 * Otherwise, each time a serialized instance is deserialized, 
 * a new instance will be created.
 */
public class SerializedSingleton implements Serializable {
	private static final long serialVersionUID = 1L;

	private SerializedSingleton(){}
	private static final SerializedSingleton instance = new SerializedSingleton();
	
	public static SerializedSingleton getInstance() {		
		return instance;
	}
	
	// Return the one true Singleton_5 and let the garbage collector
	// take care of the Singleton_5 impersonator.
	private Object readResolve() {
		return instance;
	}
}
