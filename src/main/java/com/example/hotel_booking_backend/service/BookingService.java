package com.example.hotel_booking_backend.service;

import com.example.hotel_booking_backend.dto.Response;
import com.example.hotel_booking_backend.entity.Booking;

public interface BookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
