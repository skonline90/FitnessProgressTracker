package java.com.github.skonline90.model;

import java.time.Duration;
import java.time.ZonedDateTime;

public class DurationTime
{
    private Duration _duration;
    private ZonedDateTime _dateTime;

    private DurationTime(Duration duration, ZonedDateTime dateTime)
    {
        _duration = duration;
        _dateTime = dateTime;
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

    public ZonedDateTime getDateTime()
    {
        return _dateTime;
    }

    public void setDateTime(ZonedDateTime dateTime)
    {
        _dateTime = dateTime;
    }
}
