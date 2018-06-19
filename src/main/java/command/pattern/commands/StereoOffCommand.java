package command.pattern.commands;

import command.pattern.models.Stereo;

/**
 * @author aschneider
 * @since 19.06.2018
 */

public class StereoOffCommand implements Command{

    Stereo stereo;
    
    
    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
    
}
