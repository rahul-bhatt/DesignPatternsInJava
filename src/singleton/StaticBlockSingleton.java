/**
 * 
 */
package singleton;

/**
 * @author Rahul
 * 
 *******************************************************************************
 ***************  Static block Eager initialization method  ********************
 *******************************************************************************
 * 
 * 1. Thread safe.
 * 2. Eagerly created instance.
 * 3. Prone to reflection and serialization attacks.
 * 4. Similar to eager initialization except that it provides option for exception handling.
 */
public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;
	private StaticBlockSingleton() {}

	//static block initialization for exception handling
	static{
		try{
			instance = new StaticBlockSingleton();
		}catch(Exception e){
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockSingleton getInstance(){
		return instance;
	}

}
