package com.abhinavan.hotelManagement.persistence;

import com.abhinavan.hotelManagement.models.Hotel;
import com.abhinavan.hotelManagement.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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

    public Hotel updateHotel(Hotel hotel)
    {
        Optional<Hotel> hotel1 = hotelRepository.findByHotelId(hotel.getHotelId());
        if(hotel1.isPresent())
        {
            hotel1.get().setHotelName(hotel.getHotelName());
            hotel1.get().setHotelLocation(hotel.getHotelLocation());
            return hotelRepository.save(hotel1.get());
        }
        else
        {
            return hotelRepository.save(hotel);
        }
    }

    public Hotel deleteHotel(String name)
    {
        Hotel hotel = hotelRepository.findByHotelName(name);
        hotelRepository.delete(hotel);
        return hotel;
    }
}
