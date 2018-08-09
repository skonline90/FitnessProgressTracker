package com.github.skonline90.model;

import java.time.Duration;
import java.time.ZonedDateTime;

public class DurationDistanceTime extends TimeAttributeCarrier
{
    private Duration _duration;
    private int _distanceInMeters;

    private DurationDistanceTime(Duration duration, int distanceInMeters,
            ZonedDateTime dateTime)
    {
        super(dateTime);
        _duration = duration;
        _distanceInMeters = distanceInMeters;
    }

    // --- Getters and Setters
    // ----------------------------------------------

    public Duration getDuration()
    {
        return _duration;
    }

    public void setDuration(Duration duration)
    {
        _duration = duration;
    }

    public int getDistanceInMeters()
    {
        return _distanceInMeters;
    }

    public void setDistanceInMeters(int distanceInMeters)
    {
        _distanceInMeters = distanceInMeters;
    }
}
