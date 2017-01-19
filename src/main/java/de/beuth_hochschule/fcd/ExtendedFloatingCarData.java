/*
 * Copyright (c) 2016. [j]karef GmbH
 */
package de.beuth_hochschule.fcd;

import java.util.List;

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
 *
 * FloatingCarData <|-right- ExtendedFloatingCarData
 * @end
 */
public interface ExtendedFloatingCarData extends FloatingCarData {

    /**
     * Each class which implements this interface should return all its additional data as a JSON String containing key
     * value pairs for known data and a list of String values there meaning is unknown so we can hopefully handle
     * different Floating Car Data without knowing the model in detail.
     * ex.:
     * {
     *     "taxiId": "127424872",
     *     "degree": 12.4,
     *     "gpsState": 1,
     *     "waitingState": "WAITING",
     *     "unmapped": [
     *         "122434",
     *         "34.6"
     *     ]
     * }
     * @return a map of extended data
     */
    String getExtendedData();

    /**
     *
     * @return all strings, that could not be mapped to a field.
     */
    List<String> getUnmappedData();
}
