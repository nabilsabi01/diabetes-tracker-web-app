package com.enaa.diabetes.service;

import com.enaa.diabetes.exception.ResourceNotFoundException;
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

    public Glucose updateReading(Long id, Glucose glucose) {
        Glucose existingGlucose = glucoseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Glucose reading not found with id: " + id));

        existingGlucose.setGlucoseLevel(glucose.getGlucoseLevel());
        existingGlucose.setReadingTime(glucose.getReadingTime());
        existingGlucose.setMeasurementUnit(glucose.getMeasurementUnit());
        existingGlucose.setNotes(glucose.getNotes());

        return glucoseRepository.save(existingGlucose);
    }

    public void deleteReading(Long id) {
        Glucose glucose = glucoseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Glucose reading not found with id: " + id));

        glucoseRepository.delete(glucose);
    }
}