package com.enaa.diabetes.service;

import com.enaa.diabetes.model.Glucose;
import com.enaa.diabetes.repository.GlucoseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GlucoseService {
    @Autowired
    private GlucoseRepository glucoseRepository;

    public List<Glucose> getAllReadings() {
        return glucoseRepository.findAll();
    }

    public Glucose saveReading(Glucose glucose) {
        return glucoseRepository.save(glucose);
    }
}

