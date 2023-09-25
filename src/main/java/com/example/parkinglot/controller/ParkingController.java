package com.example.parkinglot.controller;

import com.example.parkinglot.manager.ParkingManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author sanketjain
 */
@RestController
@RequestMapping("/parking")
public class ParkingController {

    @Autowired
    private ParkingManager parkingManager;

    @PutMapping("/entry/{vehicleNo}")
    public Object entry(@RequestParam String vehicleNo) {

        return parkingManager.entry(vehicleNo);
    }

    @GetMapping("/summary")
    public Object summary() {

        return parkingManager.summary();
    }

    @DeleteMapping("/exit/{vehicleNo}")
    public Object exit(@RequestParam String vehicleNo) {

        return parkingManager.exit(vehicleNo);
    }
}
