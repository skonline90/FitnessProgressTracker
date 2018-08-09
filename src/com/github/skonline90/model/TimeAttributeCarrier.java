package com.github.skonline90.model;

import java.time.ZonedDateTime;

public abstract class TimeAttributeCarrier
{
    private ZonedDateTime _dateTime;

    public TimeAttributeCarrier(ZonedDateTime dateTime)
    {
        _dateTime = dateTime;
    }

    public ZonedDateTime getDateTime()
    {
        return _dateTime;
    }

    public void setDateTime(ZonedDateTime dateTime)
    {
        _dateTime = dateTime;
    }
}
