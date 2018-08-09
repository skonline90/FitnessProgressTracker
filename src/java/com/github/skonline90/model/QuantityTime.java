package java.com.github.skonline90.model;

import java.time.ZonedDateTime;

public class QuantityTime
{
    private int _quantity;
    private ZonedDateTime _dateTime;

    private QuantityTime(int quantity, ZonedDateTime dateTime)
    {
        _quantity = quantity;
        _dateTime = dateTime;
    }

    // --- Getters and Setters
    // ----------------------------------------------

    public int getQuantity()
    {
        return _quantity;
    }

    public void setQuantity(int quantity)
    {
        _quantity = quantity;
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
