package design_pattern.state.states;

public class ProcessingGateState implements GateState {
    @Override
    public GateState enter() {
        //Should not be allowed to enter when in the processing state
        return new ProcessingGateState();
    }

    @Override
    public GateState pay() {
        //Already a payment is being processed. Should not accept any more payments. Should remain this state
        return new ProcessingGateState();
    }

    @Override
    public GateState payOk() {
        //Payment Success, should transition to OpenGateState
        return new OpenGateState();
    }

    @Override
    public GateState payFailed() {
        //Payment failed, should transition to ClosedGateState
        return new ClosedGateState();
    }
}
