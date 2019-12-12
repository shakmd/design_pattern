package state_pattern.states;

public class OpenGateState implements GateState {
    @Override
    public GateState enter() {
        //Once a person enter through the gate, it should go back to closed state
        return new ClosedGateState();
    }

    @Override
    public GateState pay() {
        //State should not change as gate is open(someone has already paid)
        return new OpenGateState();
    }

    @Override
    public GateState payOk() {
        //State should not change as gate is open(someone has already paid)
        return new OpenGateState();
    }

    @Override
    public GateState payFailed() {
        //State should not change as gate is open(someone has already paid)
        return new OpenGateState();
    }
}
