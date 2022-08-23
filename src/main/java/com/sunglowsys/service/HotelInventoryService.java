package com.sunglowsys.service;

import com.sunglowsys.domain.HotelInventory;

import java.util.List;
import java.util.Optional;

public interface HotelInventoryService {

    HotelInventory save(HotelInventory hotelInventory);

    HotelInventory update(HotelInventory hotelInventory);

    Optional<HotelInventory> findOne(Long id);

    List<HotelInventory> findAll(Long id);

    void delete(Long id);
}
