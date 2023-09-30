package com.example.parkinglot.controller;


import com.example.parkinglot.downloadImages.ImageParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/imageparser")
public class ImageParserController {

    @Autowired
    private ImageParser imageParser;

    @GetMapping("/getImages")
    public Object images(@RequestParam String baseURL) throws IOException {

        return imageParser.getImages(baseURL);
    }
}
