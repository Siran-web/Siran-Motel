package com.SiranMotel.Motel.services;

import com.SiranMotel.Motel.dtos.RoomDTO;
import com.SiranMotel.Motel.entities.RoomEntity;
import com.SiranMotel.Motel.exception.ResourceNotFoundException;
import com.SiranMotel.Motel.modelMappers.RoomModelMapper;
import com.SiranMotel.Motel.repositories.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<RoomDTO> findAllRoom() {
        List<RoomEntity> roomEntities = roomRepository.findAll();
        List<RoomDTO> roomDTOs = new ArrayList<>();
        for (RoomEntity roomEntity : roomEntities) {
            roomDTOs.add(RoomModelMapper.toDTO(roomEntity));
        }
        return roomDTOs;
    }

    public RoomDTO getRoomById(Long roomId) {
        RoomEntity roomEntity = roomRepository.findById(roomId).orElse(null);
        assert roomEntity != null;
        return RoomModelMapper.toDTO(roomEntity);
    }

    public RoomDTO createRoom(RoomDTO roomDTO) {
        RoomEntity roomEntity = RoomModelMapper.toEntity(roomDTO);
        roomEntity.setRoomId(null);
        roomRepository.save(roomEntity);
        return RoomModelMapper.toDTO(roomEntity);
    }

    public void isExistRoomWithId(Long roomId){
        boolean exists = roomRepository.existsById(roomId);
        if(!exists) throw new ResourceNotFoundException("Room Not Found with id: " + roomId);
    }

    public Boolean deleteRoomById(Long roomId){
        isExistRoomWithId(roomId);
        roomRepository.deleteById(roomId);
        return true;
    }

    public RoomDTO updateRoom(Long roomId, RoomDTO roomDTO ) {
        isExistRoomWithId(roomId);
        RoomEntity roomEntity = RoomModelMapper.toEntity(roomDTO);
        roomEntity.setRoomId(roomId);
        RoomEntity updatedEntity = roomRepository.save(roomEntity);
        return RoomModelMapper.toDTO(updatedEntity);
    }

 }
