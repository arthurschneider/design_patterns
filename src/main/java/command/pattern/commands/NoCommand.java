
package command.pattern.commands;

/**
 * @author aschneider
 * @since 19.06.2018
 */

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Nothing to do");
    }

    @Override
    public void undo() {
        System.out.println("Nothing to do");
    }

}
