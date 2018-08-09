package com.github.skonline90.model;

import java.time.ZonedDateTime;

public class QuantityTime extends TimeAttributeCarrier
{
    private int _quantity;

    private QuantityTime(int quantity, ZonedDateTime dateTime)
    {
        super(dateTime);
        _quantity = quantity;
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
}
