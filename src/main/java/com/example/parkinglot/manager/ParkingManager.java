package com.example.parkinglot.manager;

/**
 * @author sanketjain
 */
public interface ParkingManager {
    Object entry(String vehicleNo);

    Object summary();

    Object exit(String vehicleNo);
}
