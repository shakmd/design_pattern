package state_pattern.states;

public interface GateState {
    public GateState enter();

    public GateState pay();

    public GateState payOk();

    public GateState payFailed();
}
