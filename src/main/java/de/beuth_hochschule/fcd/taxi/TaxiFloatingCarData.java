/*
 * Copyright (c) 2016. [j]karef GmbH
 */
package de.beuth_hochschule.fcd.taxi;

import de.beuth_hochschule.fcd.ExtendedFloatingCarData;

/**
 * @author Rene Jablonski <rene@vnull.de>
 * @date 10.11.16
 *
 * @startuml
 * interface FloatingCarData {
 *     getId():String
 *     getLongitude():Double
 *     getLatitude():Double
 *     getSpeed():Float
 *     getTimestamp():String
 *     isDirty():boolean
 * }
 * interface ExtendedFloatingCarData {
 *     getExtendedData():String
 *     getUnmappedData():List<String>
 * }
 * interface TaxiFloatingCarData {
 *     getTaxiId():String
 *     getWaitingState():WaitingState
 *     getBusyState():BusyState
 *     getGpsState():Integer
 *     getDegree():Double
 * }
 *
 * enum WaitingState {
 *     WAITING
 *     DRIVING
 * }
 *
 * enum BusyState {
 *     FREE
 *     TAKEN
 * }
 *
 * FloatingCarData <|-right- ExtendedFloatingCarData
 * ExtendedFloatingCarData <|--right TaxiFloatingCarData
 * TaxiFloatingCarData "0..*" o-- "1" WaitingState : hat
 * TaxiFloatingCarData "0..*" o-- "1" BusyState : hat
 * @end
 */
public interface TaxiFloatingCarData extends ExtendedFloatingCarData {

    /**
     *
     * @return the taxi id
     */
    String getTaxiId();

    /**
     * Possible values: WaitingState.WAITING or WaitingState.DRIVING
     * @return the waiting state of a taxi
     */
    WaitingState getWaitingState();

    /**
     * Possible values: BusyState.FREE or BusyState.TAKEN
     * @return the busy state of a taxi
     */
    BusyState getBusyState();

    /**
     * Returns the GPS taxi as an integer value. Maybe this could be improved by using an enumeration later.
     * @return the GPS taxi
     */
    Integer getGpsState();

    /**
     * Returns an degree value. Its meaning is unknown to me.
     * @return a decimal degree
     */
    Double getDegree();
}
