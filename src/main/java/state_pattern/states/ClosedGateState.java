package state_pattern.states;

public class ClosedGateState implements GateState {
    @Override
    public GateState enter() {
        //Should not be allowed to enter when state is closed
        return new ClosedGateState();
    }

    @Override
    public GateState pay() {
        //Payment initiated, transition to Processing
        return new ProcessingGateState();
    }

    @Override
    public GateState payOk() {
        //Should return the money if getting a pay ok in the closed state
        return new ClosedGateState();
    }

    @Override
    public GateState payFailed() {
        //State should not change if getting a pay failed in the closed state
        return new ClosedGateState();
    }
}
