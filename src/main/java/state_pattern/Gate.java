package state_pattern;

import state_pattern.states.GateState;

/***
 * Imagine this class to be a gate/turnstile used in metro/subway/tube.<br>
 * It is a state machine with no memory of its own<br><br>
 * It receives messages from users like enter() or pay() or it can receive messages from payment system like payOk() or payFailed()<br>
 * Depending upon the received message, appropriate method of this class is called which after completing the business logic transition to a different state
 */
public class Gate {
    private GateState state;

    public Gate(GateState initialGateState) {
        this.state = initialGateState;
    }

    public void enterDo() {
        GateState newGateState = this.state.enter();
        transitionState(newGateState);
    }

    public void payDo() {
        GateState newGateState = this.state.pay();
        transitionState(newGateState);
    }

    public void payOkDo() {
        GateState newGateState = this.state.payOk();
        transitionState(newGateState);
    }

    public void payFailed() {
        GateState newGateState = this.state.payFailed();
        transitionState(newGateState);
    }

    private void transitionState(GateState newGateState) {
        this.state = newGateState;
    }
}