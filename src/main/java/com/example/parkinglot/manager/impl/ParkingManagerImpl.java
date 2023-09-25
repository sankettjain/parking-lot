package com.example.parkinglot.manager.impl;

import com.example.parkinglot.manager.ParkingManager;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sanketjain
 */
@Service
public class ParkingManagerImpl implements ParkingManager {

    Map<String, String> vehicleToStatus;

    @PostConstruct
    public void init() {
        vehicleToStatus = new HashMap<>();
    }


    @Override
    public Object entry(String vehicleNo) {
        return null;
    }

    @Override
    public Object summary() {
        return null;
    }

    @Override
    public Object exit(String vehicleNo) {
        return null;
    }
}
