package za.ac.cput.factory;

import za.ac.cput.entity.Booking;
import za.ac.cput.util.GenericHelper;

/*  BookingFactory.java
 *  Factory for the booking
 *  Author: Ian Louw(216250773)
 *  Date: 11 June 2021
 */

public class BookingFactory {

    public static Booking createBooking(String bookingID, String name, String address, String date, String status, Double price){

        String bookingId = GenericHelper.generateId();
        Booking booking = new Booking.Builder().setBookingID(bookingID).
                                //setBookingID(bookingID).
                                setName(name).
                                setAddress(address).
                                //setDatabase(database).
                                setDate(date).
                                setStatus(status).
                                setPrice(price).
                                build();

                                return booking;
    }
}
