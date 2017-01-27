package com.company.Controler;

import com.company.Command.Command;
import com.company.Command.NoCommand;

/**
 * Created by Roy.Leung on 11/1/17.
 */
public class RemoteControl {
    private final Command[] onCommands;
    private final Command[] offCommands;
    private Command lastCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        NoCommand noCommand = new NoCommand();
        lastCommand = noCommand;
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        lastCommand = onCommands[slot];

    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        lastCommand = offCommands[slot];

    }

    public void undoButtonWasPushed() {
        lastCommand.undo();
    }
}
