package com.hoteladvisor.hotel.service;

import com.hoteladvisor.hotel.entity.Hotel;
import com.hoteladvisor.hotel.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public final class HotelServiceImpl implements HotelService {
    private final HotelRepository hotelRepository;

    @Override
    public Hotel addHotel(String hotelName) {
        if (hotelName == null || hotelName.isBlank()) {
            log.error("Hotel name can't be blank!");
            throw new IllegalArgumentException("Hotel name can't be blank!");
        }
        return hotelRepository.save(Hotel.builder().hotelName(hotelName).build());
    }
}
