package com.glinka.touk_task.service;

import com.glinka.touk_task.model.Room;

public interface IRoomService {

    void save(Room room);
    Room findById(int id);
//    Room addSeatsToRoom(int id, Seat seat);
}