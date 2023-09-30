package com.example.parkinglot.downloadImages;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class Images {

    private Set<String> imageURL;

    public void displayImages() {
        System.out.println(imageURL);
    }
}
