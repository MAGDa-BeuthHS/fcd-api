/*
 * Copyright (c) 2016. [j]karef GmbH
 */
package de.beuth_hochschule.fcd;

import java.io.Serializable;

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
 * @end
 */
public interface FloatingCarData extends Serializable {

    /**
     *
     * @return the dataset id
     */
    String getId();

    /**
     *
     * @return the longitude part of the geographical coordinate in decimal degrees
     */
    Double getLongitude();

    /**
     *
     * @return the latitude part of the geographical coordinate in decimal degrees
     */
    Double getLatitude();

    /**
     *
     * @return the speed in km/h
     */
    Float getSpeed();

    /**
     *
     * @return the timestamp including the timezone offset
     */
    String getTimestamp();

    /**
     * @return return the dirty flag
     */
    boolean isDirty();
}
