package com.company.Command;

import com.company.Company.Light;

/**
 * Created by Roy.Leung on 11/1/17.
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

    @Override
    public void undo() {
        light.on();
    }

}
