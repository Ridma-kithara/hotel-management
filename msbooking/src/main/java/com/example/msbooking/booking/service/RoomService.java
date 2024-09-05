package com.example.msbooking.booking.service;

import com.example.msbooking.booking.entity.Room;
import com.example.msbooking.booking.repository.RoomRepository;
import com.example.msbooking.models.RoomModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<RoomModel> getAllRooms() {
        List<Room> rooms = roomRepository.findAll();
        return rooms.stream()
                .map(room -> modelMapper.map(room, RoomModel.class))
                .collect(Collectors.toList());
    }
}
