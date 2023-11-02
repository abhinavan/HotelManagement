package com.abhinavan.hotelManagement.controllers;

import com.abhinavan.hotelManagement.models.Hotel;
import com.abhinavan.hotelManagement.services.AddHotelService;
import com.abhinavan.hotelManagement.services.UpdateHotelService;
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

    @Autowired
    private UpdateHotelService updateHotelService;

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

    @PutMapping("/hotels/update")
    public ResponseEntity<Hotel> updateHotel(@RequestBody Hotel hotel)
    {
        return updateHotelService.updateHotel(hotel) != null ? ResponseEntity.ok(hotel) : ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/hotels/delete/{name}")
    public ResponseEntity deleteHotel(@PathVariable String name)
    {
        System.out.println("Deleting hotel with name: " + name);
        return updateHotelService.deleteHotel(name) != null ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }
}
