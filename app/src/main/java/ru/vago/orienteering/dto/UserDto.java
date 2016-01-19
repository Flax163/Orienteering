package ru.vago.orienteering.dto;

import java.math.BigInteger;

public class UserDto
{
    private BigInteger id;
    private String name;

    public UserDto(final BigInteger id,
                   final String name)
    {
        this.id = id;
        this.name = name;
    }

    public BigInteger getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void rename(String name)
    {
        this.name = name;
    }
}
