package com.example.parkinglot.manager;

import com.example.parkinglot.dto.ConfigRequestDTO;

/**
 * @author sanketjain
 */
public interface UserManager {


    Object register(String vehicleNo);

    Object config(ConfigRequestDTO configRequestDTO);
}
