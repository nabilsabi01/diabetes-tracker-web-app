package com.enaa.diabetes.controller;

import com.enaa.diabetes.model.Glucose;
import com.enaa.diabetes.service.GlucoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/glucose")
@CrossOrigin(origins = "http://localhost:4200")
public class GlucoseController {
    @Autowired
    private GlucoseService glucoseService;

    @GetMapping("/readings")
    public List<Glucose> getAllReadings() {
        return glucoseService.getAllReadings();
    }

    @PostMapping("/save")
    public Glucose saveReading(@RequestBody Glucose glucose) {
        return glucoseService.saveReading(glucose);
    }
}
