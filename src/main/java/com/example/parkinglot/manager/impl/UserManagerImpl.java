package com.example.parkinglot.manager.impl;

import com.example.parkinglot.dto.ConfigRequestDTO;
import com.example.parkinglot.manager.UserManager;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sanketjain
 */
@Service
public class UserManagerImpl implements UserManager {

    Map<String, String> userToStatus;
    Map<String, ConfigRequestDTO> clientToConfig;

    @PostConstruct
    public void init() {
        userToStatus = new HashMap<>();
        clientToConfig = new HashMap<>();
    }

    @Override
    public Object register(String vehicleNo) {
        userToStatus.put(vehicleNo, "RGISTERED");
        return "SUCCESS";
    }

    @Override
    public Object config(ConfigRequestDTO configRequestDTO) {
        clientToConfig.put("1", configRequestDTO);
        return "SUCCESS";
    }
}
