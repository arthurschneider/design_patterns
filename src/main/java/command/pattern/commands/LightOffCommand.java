
package command.pattern.commands;

import command.pattern.models.Light;

/**
 * @author aschneider
 * @since 19.06.2018
 */

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

}
