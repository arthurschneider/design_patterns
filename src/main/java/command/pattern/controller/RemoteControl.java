
package command.pattern.controller;

import command.pattern.commands.Command;
import command.pattern.commands.NoCommand;

/**
 * @author aschneider
 * @since 19.06.2018
 */

public class RemoteControl {

    private static final int SLOT_SIZE = 4;

    Command[] onCommands;
    Command[] offCommands;
    
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[SLOT_SIZE];
        offCommands = new Command[SLOT_SIZE];

        Command noCommand = new NoCommand();

        for (int i = 0; i < SLOT_SIZE; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {

        String format = "%-50s %-50s %n";

        StringBuilder str = new StringBuilder();
        str.append("--------------Remote Control--------------\n");
        for (int i = 0; i < SLOT_SIZE; i++) {
            str.append("Slot " + i + ". "
                    + String.format(format, offCommands[i].getClass().getName(), onCommands[i].getClass().getName()));
        }

        return str.toString();
    }
}
