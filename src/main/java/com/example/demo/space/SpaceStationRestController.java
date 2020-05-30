package com.example.demo.space;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/space")
public class SpaceStationRestController {

    @GetMapping("/greeting")
    public String greeting(){
        return "Hello from the spacestation";
    }
}
