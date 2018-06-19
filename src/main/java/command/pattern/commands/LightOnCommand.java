
package command.pattern.commands;

import command.pattern.models.Light;

/**
 * @author aschneider
 * @since 19.06.2018
 */

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
       light.on();
    }

}
