package java.com.github.skonline90.model;

import java.time.Duration;
import java.time.ZonedDateTime;

public class DurationDistanceTime
{
    private Duration _duration;
    private int _distanceInMeters;
    private ZonedDateTime _dateTime;

    private DurationDistanceTime(Duration duration, int distanceInMeters,
            ZonedDateTime dateTime)
    {
        _duration = duration;
        _distanceInMeters = distanceInMeters;
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

    public int getDistanceInMeters()
    {
        return _distanceInMeters;
    }

    public void setDistanceInMeters(int distanceInMeters)
    {
        _distanceInMeters = distanceInMeters;
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
