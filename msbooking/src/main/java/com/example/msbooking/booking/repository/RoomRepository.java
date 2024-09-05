package com.example.msbooking.booking.repository;

import com.example.msbooking.booking.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
