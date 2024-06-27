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

    @Column(nullable = false)
    private Double glucoseLevel;

    @Column(nullable = false)
    private LocalDateTime readingTime;

    @Column(nullable = false)
    private String measurementUnit;

    @Column
    private String notes;
}
