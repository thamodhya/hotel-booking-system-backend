package com.example.hotel_booking_backend.service;

import com.example.hotel_booking_backend.dto.LoginRequest;
import com.example.hotel_booking_backend.dto.Response;
import com.example.hotel_booking_backend.entity.User;

public interface UserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
