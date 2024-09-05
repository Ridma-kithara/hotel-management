package com.example.msbooking.booking.controller;

import com.example.msbooking.booking.entity.Room;
import com.example.msbooking.booking.service.RoomService;
import com.example.msbooking.models.RoomModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping
    public List<RoomModel> getAllRooms() {
        return roomService.getAllRooms();
    }
}
