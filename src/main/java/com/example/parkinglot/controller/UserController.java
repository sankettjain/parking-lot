package com.example.parkinglot.controller;

import com.example.parkinglot.dto.ConfigRequestDTO;
import com.example.parkinglot.dto.RegisterRequestDTO;
import com.example.parkinglot.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author sanketjain
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserManager userManager;


    @PutMapping("/register/{vehicleNo}")
    public Object register(@RequestParam String vehicleNo, @RequestBody RegisterRequestDTO registerRequestDTO){

        return userManager.register(vehicleNo);

    }

    @PutMapping("/config")
    public Object config(@RequestBody ConfigRequestDTO configRequestDTO){

        return userManager.config(configRequestDTO);
    }
}
