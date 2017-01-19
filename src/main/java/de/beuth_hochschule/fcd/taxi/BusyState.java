/*
 * Copyright (c) 2016. [j]karef GmbH
 */
package de.beuth_hochschule.fcd.taxi;

/**
 * @author Rene Jablonski <rene@vnull.de>
 * @date 10.11.16
 */
public enum BusyState {
    FREE(0),
    TAKEN(1);

    private int value;

    BusyState(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static BusyState getState(int value) {
        BusyState result = null;
        for(BusyState state : values()) {
            if(state.getValue() == value) {
                result = state;
            }
        }
        return result;
    }
}
