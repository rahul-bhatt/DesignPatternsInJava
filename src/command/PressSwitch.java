/**
 * 
 */
package command;

/**
 ****************************************
 *******  The command pattern  **********
 ****************************************
 *
 * In object-oriented programming, the command pattern is a behavioral design pattern 
 * in which an object is used to encapsulate all information needed to perform an action 
 * or trigger an event at a later time. This information includes the method name, 
 * the object that owns the method and values for the method parameters.
 * 
 * Four terms always associated with the command pattern are: 
 * 1. command, 
 * 2. receiver, 
 * 3. invoker, and 
 * 4. client. 
 * 
 * A command object knows about receiver and invokes a method of the receiver. 
 * Values for parameters of the receiver method are stored in the command. 
 * The receiver then does the work. An invoker object knows how to execute a command, 
 * and optionally does bookkeeping about the command execution. 
 * The invoker does not know anything about a concrete command, it knows only about command interface. 
 * Both an invoker object and several command objects are held by a client object. 
 * The client decides which commands to execute at which points. 
 * To execute a command, it passes the command object to the invoker object.
 * 
 * Using command objects makes it easier to construct general components that need to delegate, sequence or 
 * execute method calls at a time of their choosing without the need to know the class of the method or 
 * the method parameters. Using an invoker object allows bookkeeping about command executions to be 
 * conveniently performed, as well as implementing different modes for commands, 
 * which are managed by the invoker object, without the need for the client to be 
 * aware of the existence of bookkeeping or modes.
 * 
 * @author Rahul
 */
public class PressSwitch {
	public static void main(String[] args){
		// Check number of arguments
		if (args.length != 1) {
			System.err.println("Argument \"ON\" or \"OFF\" is required.");
			System.exit(-1);
		}

		Light lamp = new Light();
		Command switchUp = new FlipUpCommand(lamp);
		Command switchDown = new FlipDownCommand(lamp);

		Switch mySwitch = new Switch();

		switch(args[0]) {
		case "ON":
			mySwitch.storeAndExecute(switchUp);
			break;
		case "OFF":
			mySwitch.storeAndExecute(switchDown);
			break;
		default:
			System.err.println("Argument \"ON\" or \"OFF\" is required.");
			System.exit(-1);
		}
	}
}