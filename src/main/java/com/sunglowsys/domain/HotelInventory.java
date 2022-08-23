package com.sunglowsys.domain;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hotel_inventory")
public class HotelInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "total_inventory", nullable = false)
    private Integer totalInventory;

    @NotNull
    @Column(name = "hotel_id", nullable = false)
    private Integer hotelId;

    @NotNull
    @Column(name = "room_type_id", nullable = false)
    private Integer roomTypeId;

    public HotelInventory() {
    }

    public HotelInventory(Integer totalInventory, Integer hotelId, Integer roomTypeId) {
        this.totalInventory = totalInventory;
        this.hotelId = hotelId;
        this.roomTypeId = roomTypeId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTotalInventory() {
        return totalInventory;
    }

    public void setTotalInventory(Integer totalInventory) {
        this.totalInventory = totalInventory;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelInventory that = (HotelInventory) o;
        return Objects.equals(id, that.id) && Objects.equals(totalInventory, that.totalInventory) && Objects.equals(hotelId, that.hotelId) && Objects.equals(roomTypeId, that.roomTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, totalInventory, hotelId, roomTypeId);
    }

    @Override
    public String toString() {
        return "HotelInventory{" +
                "id=" + id +
                ", totalInventory=" + totalInventory +
                ", hotelId=" + hotelId +
                ", roomTypeId=" + roomTypeId +
                '}';
    }
}
