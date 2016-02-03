/**
 * 
 */
package singleton;

/**
 * @author Rahul
 * 
 ***********************************************************************************************
 *******  Initialization-on-demand holder Idiom (Bill Pugh Singleton Implementation)  **********
 ***********************************************************************************************
 *
 * 1. The idiom enables a safe, highly concurrent lazy initialization with good performance.
 * 2. For serialization (provide readResolve() method).
 */
public class BillPughSingleton {

	private BillPughSingleton() {}

	private static class LazyHolder {
		private static final BillPughSingleton instance = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return LazyHolder.instance;
	}
}
