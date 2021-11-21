package com.example.service1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// import java.util.ArrayList;

@Entity
public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    
    @Column
    private String userName;

    // @Column
    // private ArrayList<Booking> bookings;

    public int getUserId()
    {
        return userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    // public void setBooking()
    // {
    //     this.bookings = new ArrayList<Booking>();
    // }

    // public void newBooking(Booking newbooking)
    // {
    //     System.out.println(this.bookings);
    //     this.bookings.add(newbooking);
    // }



}
