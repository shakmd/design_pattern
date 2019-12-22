package design_pattern.state.states;

public interface GateState {
    public GateState enter();

    public GateState pay();

    public GateState payOk();

    public GateState payFailed();
}
