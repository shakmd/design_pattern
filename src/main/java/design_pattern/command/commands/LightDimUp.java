package design_pattern.command.commands;

import design_pattern.command.Light;

public class LightDimUp implements ICommand {
    private Light light;

    public LightDimUp(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.action_lightDimUp();
    }

    @Override
    public void unexecute() {
        this.light.action_lightDimDown();
    }
}
