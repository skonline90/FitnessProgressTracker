package java.com.github.skonline90.model;

import java.time.ZonedDateTime;

public class QuantityMassTime
{
    private int _quantity;
    private int _massInGramms;
    private ZonedDateTime _dateTime;

    private QuantityMassTime(int quantity, int massInGramms,
            ZonedDateTime dateTime)
    {
        _quantity = quantity;
        _massInGramms = massInGramms;
        _dateTime = dateTime;
    }

    // --- Getter & Setter
    // ----------------------------------------------

    public int getQuantity()
    {
        return _quantity;
    }

    public void setQuantity(int quantity)
    {
        _quantity = quantity;
    }

    public int getMassInGramms()
    {
        return _massInGramms;
    }

    public void setMassInGramms(int massInGramms)
    {
        _massInGramms = massInGramms;
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
