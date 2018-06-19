package command.pattern.commands;

import command.pattern.models.Stereo;

/**
 * @author aschneider
 * @since 19.06.2018
 */

public class StereoOnWithCDCommand implements Command {
    
    Stereo stereo;
    
    
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(9);
    }

}
