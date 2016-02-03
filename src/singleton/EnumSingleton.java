/**
 * 
 */
package singleton;

/**
 * @author Rahul
 * 
 ************************************************************************************
 ****************  Enum approach (Suggested by Joshua Bloch)  ***********************
 ************************************************************************************
 * 
 * 1. Thread safe.
 * 2. Guard against sophisticated serialization or reflection attacks.
 * 3. Inflexible as  it does not allow lazy initialization.
 * 4. Inflexible as it can not extend any Enum or Class
 */
public enum EnumSingleton {
	instance;
	
	public static void doSomething() {
        //do something
    }
}
