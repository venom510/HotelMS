package com.hoteladvisor.hotel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@EqualsAndHashCode
public final class Hotel {
    @Id
    @SequenceGenerator(initialValue = 1000, name = "HOTEL_ID_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HOTEL_ID_SEQ")
    private long hotelId;
    private String hotelName;
    private long numberOfRatings;
    private double avgRating;
    private boolean premiumHotel;
}
