package com.github.skonline90.model;

import java.time.ZonedDateTime;

public class QuantityMassTime extends TimeAttributeCarrier
{
    private int _quantity;
    private int _massInGramms;

    private QuantityMassTime(int quantity, int massInGramms,
            ZonedDateTime dateTime)
    {
        super(dateTime);
        _quantity = quantity;
        _massInGramms = massInGramms;
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
}
