package com.github.skonline90.model;

import java.time.Duration;
import java.time.ZonedDateTime;

public class DurationTime extends TimeAttributeCarrier
{
    private Duration _duration;

    private DurationTime(Duration duration, ZonedDateTime dateTime)
    {
        super(dateTime);
        _duration = duration;
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
}
