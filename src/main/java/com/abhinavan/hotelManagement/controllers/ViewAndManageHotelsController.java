package com.abhinavan.hotelManagement.controllers;

import com.abhinavan.hotelManagement.models.Hotel;
import com.abhinavan.hotelManagement.services.AddHotelService;
import com.abhinavan.hotelManagement.services.ViewHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/viewAndManageHotels")
public class ViewAndManageHotelsController
{

    @Autowired
    private AddHotelService addHotelService;

    @Autowired
    private ViewHotelService viewHotelService;

    @GetMapping("/hotels/all")
    public List<Hotel> getAllHotels()
    {
        return viewHotelService.getAllHotels();
    }

    @GetMapping("/hotels/{name}")
    public ResponseEntity<Hotel> getHotelByName(@PathVariable String name)
    {
        return ResponseEntity.ok(viewHotelService.getHotelByName(name));
    }

    @PostMapping("/hotels/add")
    public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel)
    {
        return addHotelService.addHotel(hotel) != null ? ResponseEntity.ok(hotel) : ResponseEntity.badRequest().build();
    }
}
