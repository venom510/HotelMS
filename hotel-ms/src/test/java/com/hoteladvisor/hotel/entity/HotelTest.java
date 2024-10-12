package com.hoteladvisor.hotel.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class HotelTest {
    private static final String TEST_HOTEL_NAME = "testHotel";

    @Test
    void testInitialValues() {
        Hotel hotel = Hotel.builder().hotelName(TEST_HOTEL_NAME).build();
        assertEquals(TEST_HOTEL_NAME, hotel.getHotelName());
        assertEquals(0, hotel.getAvgRating());
        assertEquals(0, hotel.getNumberOfRatings());
        assertFalse(hotel.isPremiumHotel());
    }
}