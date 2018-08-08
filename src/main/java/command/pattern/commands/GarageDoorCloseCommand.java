
package command.pattern.commands;

import command.pattern.models.GarageDoor;

/**
 * @author aschneider
 * @since 19.06.2018
 */

public class GarageDoorCloseCommand implements Command {

    GarageDoor door;

    public GarageDoorCloseCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.lightOff();
        door.down();
        door.stop();
    }

    @Override
    public void undo() {
        door.lightOn();
        door.up();
        door.stop();
    }

}
