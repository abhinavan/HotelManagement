package com.abhinavan.hotelManagement.repositories;

import com.abhinavan.hotelManagement.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HotelRepository extends JpaRepository<Hotel,Long>
{
    Hotel findByHotelName(String hotelName);

    Optional<Hotel> findByHotelId(int hotelId);
}
