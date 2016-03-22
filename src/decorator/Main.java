/**
 * 
 */
package decorator;

/**
 * @author Rahul
 *
 *
*******************************
****  Decorator Pattern  ******
*******************************

The Decorator Pattern attaches additional responsibilities to an object dynamically.
Decorators provide a flexible alternative to sub-classing for extending functionality.
The decorator pattern is often useful for adhering to the Single Responsibility Principle, 
as it allows functionality to be divided between classes with unique areas of concern.
 */

public class Main {
	public static void printInfo(Coffee c) {
		System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
	}

	public static void main(String[] args) {
		
		//Creates a simple coffee
		Coffee c = new SimpleCoffee();
		printInfo(c);

		//Creates coffee with milk using coffee
		c = new WithMilk(c);
		printInfo(c);

		//Creates coffee with sprinkles using coffee with milk
		c = new WithSprinkles(c);
		printInfo(c);
	}
}
