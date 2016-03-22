/**
 * 
 */
package decorator;

/**
 * @author Rahul
 *
 */
//Abstract decorator class - note that it extends Coffee interface
public abstract class CoffeeDecorator implements Coffee {
	protected final Coffee decoratedCoffee;

	public CoffeeDecorator(Coffee c) {
		this.decoratedCoffee = c;
	}

	//Implementing methods of the interface
	public double getCost() {
		return decoratedCoffee.getCost();
	}

	public String getIngredients() {
		return decoratedCoffee.getIngredients();
	}
}
