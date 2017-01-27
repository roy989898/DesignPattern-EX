package com.company.Controler;

import com.company.Command.Command;

/**
 * Created by Roy.Leung on 11/1/17.
 */
public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
