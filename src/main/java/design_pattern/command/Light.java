package design_pattern.command;

/*
Please note that this particular class is not part of the design pattern
It can be replace with a class called "Receiver" which has method like "action1" "action2" etc
that can be invoked by "execute" method of "Impl of ICommand Interface"
 */
public class Light {
    public void action_lightOn() {
        //does something
    }

    public void action_lightOff() {
        //does something
    }

    public void action_lightDimUp() {
        //does something
    }

    public void action_lightDimDown() {
        //does something
    }
}
