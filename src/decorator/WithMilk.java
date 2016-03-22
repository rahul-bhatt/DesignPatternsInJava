/**
 * 
 */
package decorator;

/**
 * @author Rahul
 *
 */
//Decorator WithMilk mixes milk into coffee.
//Note it extends CoffeeDecorator.
class WithMilk extends CoffeeDecorator {
	public WithMilk(Coffee c) {
		super(c);
	}

	//Overriding methods defined in the abstract superclass
	public double getCost() {
		return super.getCost() + 0.5;
	}

	public String getIngredients() {
		return super.getIngredients() + ", Milk";
	}
}
