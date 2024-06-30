package com.enaa.diabetes.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "glucose_readings")
public class Glucose {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "glucose_level")
    private Double glucoseLevel;
    @Column(name = "reading_time")
    private LocalDateTime readingTime;
    @Column(name = "measurement_unit")
    private String measurementUnit;
    private String notes;
}
