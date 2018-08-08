
package command.pattern.commands;

import command.pattern.models.GarageDoor;

/**
 * @author aschneider
 * @since 19.06.2018
 */

public class GarageDoorOpenCommand implements Command {

    GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.lightOn();
        door.up();
        door.stop();
    }

    @Override
    public void undo() {
        door.lightOff();
        door.down();
        door.stop();
    }

}
