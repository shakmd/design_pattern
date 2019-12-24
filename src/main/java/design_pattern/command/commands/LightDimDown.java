package design_pattern.command.commands;

import design_pattern.command.Light;

public class LightDimDown implements ICommand {
    private Light light;

    public LightDimDown(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.action_lightDimDown();
    }

    @Override
    public void unexecute() {
        this.light.action_lightDimUp();
    }
}
