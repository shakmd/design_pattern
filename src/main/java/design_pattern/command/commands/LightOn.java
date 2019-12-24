package design_pattern.command.commands;

import design_pattern.command.Light;
import design_pattern.command.commands.ICommand;

public class LightOn implements ICommand {
    private Light light;

    public LightOn(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.action_lightOn();
    }

    @Override
    public void unexecute() {
        this.light.action_lightOff();
    }
}
