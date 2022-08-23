package com.sunglowsys.service.impl;

import com.sunglowsys.domain.HotelInventory;
import com.sunglowsys.repository.HotelInventoryRepository;
import com.sunglowsys.service.HotelInventoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
@Transactional
public class HotelInventoryServiceImpl implements HotelInventoryService {

    //private final Logger log = (Logger) LoggerFactory.getLogger(HotelInventoryServiceImpl.class);

    private final HotelInventoryRepository hotelInventoryRepository;

    public HotelInventoryServiceImpl(HotelInventoryRepository hotelInventoryRepository){
        this.hotelInventoryRepository = hotelInventoryRepository;
    }

    @Override
    public HotelInventory save(HotelInventory hotelInventory) {
        return hotelInventoryRepository.save(hotelInventory);
    }

    @Override
    public HotelInventory update(HotelInventory hotelInventory) {
        return hotelInventoryRepository.save(hotelInventory);
    }

    @Override
    public Optional<HotelInventory> findOne(Long id) {
        return hotelInventoryRepository.findById(id);
    }

    @Override
    public List<HotelInventory> findAll(Long id) {
        return hotelInventoryRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        hotelInventoryRepository.deleteById(id);
    }
}
