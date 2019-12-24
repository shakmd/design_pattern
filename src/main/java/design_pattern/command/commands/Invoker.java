package design_pattern.command.commands;

/*
Please note that this has to be a class and not an interface
Generally, if we have a need to share the methods(or interfaces) across several invoker,
then we can model this as an Interface

Refer to the book/video again, to know why
 */
public class Invoker {
    //It is also possible to have a queue/list of command as a member
    //And a method like "addCommand()" to add more commands to it
    private ICommand on;
    private ICommand off;
    private ICommand up;
    private ICommand down;

    public Invoker(ICommand on, ICommand off, ICommand up, ICommand down) {
        this.on = on;
        this.off = off;
        this.up = up;
        this.down = down;
    }

    public void clickOn() {
        this.on.execute();
    }

    public void clickOff() {
        this.off.execute();
    }

    public void clickUp() {
        this.up.execute();
    }

    public void clickDown() {
        this.down.execute();
    }
}
