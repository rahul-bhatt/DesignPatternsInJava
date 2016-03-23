/**
 * 
 */
package command;

/**
 * The Command for turning on the light - ConcreteCommand #1.
 * @author Rahul
 */
public class FlipUpCommand implements Command {
   private Light theLight;

   public FlipUpCommand(Light light) {
      this.theLight = light;
   }

   @Override    // Command
   public void execute() {
      theLight.turnOn();
   }
}