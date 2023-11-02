package com.abhinavan.hotelManagement.services;

import com.abhinavan.hotelManagement.models.Hotel;
import com.abhinavan.hotelManagement.persistence.HotelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateHotelService
{
    @Autowired
    private HotelDao hotelDao;

    public Hotel updateHotel(Hotel hotel)
    {
        return hotelDao.updateHotel(hotel);
    }

    public Hotel deleteHotel(String name)
    {
        return hotelDao.deleteHotel(name);
    }
}
