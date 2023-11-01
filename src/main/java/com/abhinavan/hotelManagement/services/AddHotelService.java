package com.abhinavan.hotelManagement.services;

import com.abhinavan.hotelManagement.models.Hotel;
import com.abhinavan.hotelManagement.persistence.HotelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddHotelService
{

    @Autowired
    private HotelDao hotelDao;

    public Hotel addHotel(Hotel hotel)
    {
        return hotelDao.saveHotel(hotel);
    }
}
