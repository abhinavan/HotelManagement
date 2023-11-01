package com.abhinavan.hotelManagement.persistence;

import com.abhinavan.hotelManagement.models.Hotel;
import com.abhinavan.hotelManagement.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class HotelDao
{
    @Autowired
    private HotelRepository hotelRepository;

    @Transactional
    public Hotel saveHotel(Hotel hotel)
    {
        return hotelRepository.saveAndFlush(hotel);
    }

    public List<Hotel> getAllHotels()
    {
        return hotelRepository.findAll();
    }

    public Hotel getHotelByName(String hotelName)
    {
        return hotelRepository.findByHotelName(hotelName);
    }
}
