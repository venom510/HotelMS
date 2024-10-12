package com.hoteladvisor.hotel.controller;

import com.hoteladvisor.hotel.entity.Hotel;
import com.hoteladvisor.hotel.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
@RequiredArgsConstructor
public final class HotelController {
    private final HotelService hotelService;

    @PostMapping
    public Hotel addHotel(@RequestParam(name = "hotelName", required = true) String hotelName) {
        return hotelService.addHotel(hotelName);
    }
}
