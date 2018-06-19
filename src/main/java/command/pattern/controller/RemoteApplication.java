package command.pattern.controller;

import command.pattern.commands.GarageDoorCloseCommand;
import command.pattern.commands.GarageDoorOpenCommand;
import command.pattern.commands.LightOffCommand;
import command.pattern.commands.LightOnCommand;
import command.pattern.commands.StereoOffCommand;
import command.pattern.commands.StereoOnWithCDCommand;
import command.pattern.models.GarageDoor;
import command.pattern.models.Light;
import command.pattern.models.Stereo;

/**
 * @author aschneider
 * @since 19.06.2018
 */

public class RemoteApplication {

    public static void main(String[] args) {

        RemoteControl control = new RemoteControl();
        
        Light light = new Light();
        Stereo stereo = new Stereo();
        GarageDoor garageDoor = new GarageDoor();
        
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        
        GarageDoorOpenCommand openGaraga = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand closeGarage = new GarageDoorCloseCommand(garageDoor);
        
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        
        control.setCommand(0, lightOn, lightOff);
        control.setCommand(1, openGaraga, closeGarage);
        control.setCommand(2, stereoOn, stereoOff);
        
        System.out.println(control);
        
        control.onButtonWasPushed(1);
        control.offButtonWasPushed(0);
        
    }

}
