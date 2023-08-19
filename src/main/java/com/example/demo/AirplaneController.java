package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/airplane")
public class AirplaneController {

    @GetMapping
    public ResponseEntity<AirplaneModel> getAirplane(){

        AirplaneModel airplane = new AirplaneModel("Boeing", 2006);

        
        return ResponseEntity.status(HttpStatus.OK).body(airplane);
    }
}
