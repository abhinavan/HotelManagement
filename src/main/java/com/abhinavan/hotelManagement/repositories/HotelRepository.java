package com.abhinavan.hotelManagement.repositories;

import com.abhinavan.hotelManagement.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,Long>
{
    Hotel findByHotelName(String hotelName);
}
