package com.company;

import com.company.Command.LightOffCommand;
import com.company.Command.LightOnCommand;
import com.company.Company.Light;
import com.company.Controler.RemoteControl;
import com.company.Controler.SimpleRemoteControl;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /*SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        remoteControl.setCommand(new LightOnCommand(new Light()));
        remoteControl.buttonWasPressed();*/
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        control.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));

        control.offButtonWasPushed(0);
        control.onButtonWasPushed(0);
        control.undoButtonWasPushed();

    }
}
