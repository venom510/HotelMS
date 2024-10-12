package com.hoteladvisor.hotel.service;

import com.hoteladvisor.hotel.repository.HotelRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class HotelServiceTest {
    private static final String TEST_HOTEL_NAME = "testHotel";

    @Mock
    private HotelRepository hotelRepository;
    @InjectMocks
    private HotelServiceImpl hotelService;

    @Test
    void testAddHotelWhenHotelNameIsNull() {
        assertThrows(IllegalArgumentException.class, () -> hotelService.addHotel(null));
    }

    @Test
    void testAddHotel() {
        var hotel = hotelService.addHotel(TEST_HOTEL_NAME);
        verify(hotelRepository, times(1)).save(argThat(h -> TEST_HOTEL_NAME.equals(h.getHotelName())));
    }
}