package de.beuth_hochschule.fcd.taxi;

/**
 * @author Rene Jablonski <rene@vnull.de>
 * @date 10.11.16
 */
public enum WaitingState {
    WAITING(0),
    DRIVING(1);

    private int value;

    WaitingState(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static WaitingState getState(int value) {
        WaitingState result = null;
        for(WaitingState state : values()) {
            if(state.getValue() == value) {
                result = state;
            }
        }
        return result;
    }
}
