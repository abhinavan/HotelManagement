package com.abhinavan.hotelManagement.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "hotel_info")
public class Hotel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int hotelId;

    private String hotelName;

    private String hotelLocation;
}
