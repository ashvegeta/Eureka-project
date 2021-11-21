package com.example.service1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;

    @Column
    private int userId;
    
    @Column
    private String flightName;

    @Column
    private String bookingClass;

    //user id
    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int UserId)
    {
        this.userId = UserId;
    }

    //booking id
    public int getBookingId()
    {
        return bookingId;
    }

    public void setBookingId(int bookingId)
    {
        this.bookingId = bookingId;
    }

    //booking class
    public String getBookingClass()
    {
        return bookingClass;
    }

    public void setBookingClass(String bookingClass)
    {
        this.bookingClass = bookingClass;
    }

    //flight name
    public String getFlightName()
    {
        return flightName;
    }

    public void setFlightName(String flightName)
    {
        this.flightName = flightName;
    }

}
