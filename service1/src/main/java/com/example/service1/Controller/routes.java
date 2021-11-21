package com.example.service1.Controller;

import com.example.service1.model.Booking;
import com.example.service1.model.User;
import com.example.service1.repository.bookingRepository;
import com.example.service1.repository.userRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/user")

public class routes
{
    @Autowired
    private userRepository User;

    @Autowired
    private bookingRepository Book;

    @GetMapping("/showall")
    public @ResponseBody Iterable<User> showall()
    {
        return User.findAll();
    }

    @PostMapping("/insert")
    public String insertUser(@RequestParam String userName)
    {
        User newUser = new User();

        newUser.setUserName(userName);
        User.save(newUser);

        return "new user added !";
    }

    @PostMapping("/update")
    public String updateUser(@RequestParam String userName,@RequestParam int userId)
    {
        User user = User.findById(userId);

        user.setUserName(userName);
        User.save(user);

        return "user id : " + userId + " updated !!";
    }

    @PostMapping("/delete")
    public String deleteUser(@RequestParam int userId)
    {
        User.deleteById(userId);

        List<Booking> bookings = Book.findAllByUserId(userId);
        Book.deleteAll(bookings);

        return "user id : " + userId + " successfully deleted !!";
    }

    @PostMapping("/booking")
    public String bookFlight(@RequestParam int userId,@RequestParam String flightName,@RequestParam String bookingclass)
    {
        Booking newBooking = new Booking();

        newBooking.setUserId(userId);
        newBooking.setFlightName(flightName);
        newBooking.setBookingClass(bookingclass);

        Book.save(newBooking);
        
        return "Successfully booked " + flightName + " for user id : " + userId + " in " + bookingclass +" class";
    }

    @GetMapping("/showallbookings")
    public @ResponseBody Iterable<Booking> showBookings(@RequestParam int userId)
    {
        return Book.findAllByUserId(userId);
    }


}
