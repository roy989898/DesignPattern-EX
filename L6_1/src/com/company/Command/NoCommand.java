package com.company.Command;

/**
 * Created by Roy.Leung on 11/1/17.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No Command");
    }

    @Override
    public void undo() {
        System.out.println("No Command");
    }
}
