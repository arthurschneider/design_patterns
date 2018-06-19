package command.pattern.commands;


/**
 * @author aschneider
 * @since 19.06.2018
 */

public interface Command {

    public void execute();
    
    public void undo();
}
