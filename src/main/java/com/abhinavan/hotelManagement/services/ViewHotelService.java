package com.abhinavan.hotelManagement.services;

import com.abhinavan.hotelManagement.models.Hotel;
import com.abhinavan.hotelManagement.persistence.HotelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewHotelService
{
    @Autowired
    private HotelDao hotelDao;

    public List<Hotel> getAllHotels()
    {
        return hotelDao.getAllHotels();
    }

    public Hotel getHotelByName(String name)
    {
        return hotelDao.getHotelByName(name);
    }
}
