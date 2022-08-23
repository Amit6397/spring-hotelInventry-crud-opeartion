package com.sunglowsys.resource;

import com.sunglowsys.domain.HotelInventory;
import com.sunglowsys.service.HotelInventoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping ("/api")
public class HotelInventoryResource {

   // private final Logger log = LoggerFactory.getLogger(HotelInventoryResource.class);

    private final HotelInventoryService hotelInventoryService;

    public HotelInventoryResource(HotelInventoryService hotelInventoryService) {
        this.hotelInventoryService = hotelInventoryService;
    }

    @PostMapping("/hotel_inventories")
    public ResponseEntity<HotelInventory> createHotelInventory(@RequestBody HotelInventory hotelInventory) throws URISyntaxException {
        HotelInventory result = hotelInventoryService.save(hotelInventory);
        return ResponseEntity
                .created(new URI("/api/hotel-inventories/" + result.getId()))
                .body(result);
    }
    @PutMapping("/hotel_inventories")
    public ResponseEntity<HotelInventory> updateHotelInventory(@RequestBody HotelInventory hotelInventory) {
        if (hotelInventory.getId() == null) {
            throw new RuntimeException("HotelInventory must have ID");
        }
        HotelInventory result = hotelInventoryService.update(hotelInventory);
        return ResponseEntity.status(HttpStatus.OK).body(result);

    }
    @GetMapping("/hotel_inventories/{id}")
    public ResponseEntity<HotelInventory> getHotelInventory(@PathVariable Long id){
        HotelInventory result = hotelInventoryService.findOne(id).get();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @GetMapping("/hotel_inventories")
    public ResponseEntity<List<HotelInventory>> getAllHotelInventory(Long id){
        List<HotelInventory> hotelInventories = hotelInventoryService.findAll(id);
        return ResponseEntity.status(HttpStatus.OK).body(hotelInventories);
    }
    @DeleteMapping("/hotel_inventories/{id}")
    public ResponseEntity<HotelInventory> deleteHotelInventory(@PathVariable("id") Long id){
        hotelInventoryService.delete(id);
        return ResponseEntity.ok().build();
    }

}
